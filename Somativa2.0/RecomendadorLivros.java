import java.util.*;

// Definição da classe Livro
class Livro {
    String titulo;
    String autor;
    String genero;
    int anoDePublicacao;

    // Método Construtor da classe
    public Livro(String titulo, String autor, String genero, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoDePublicacao = anoDePublicacao;
    }
}

// Definição da classe Grafo
class Grafo {
    private Map<Livro, Set<Livro>> grafo;

    // Construtor
    public Grafo() {
        this.grafo = new HashMap<>();
    }

    // Método para adicionar livros ao grafo
    public void adicionarLivro(Livro livro) {
        if (!grafo.containsKey(livro)) {
            grafo.put(livro, new HashSet<>());
        }
    }

    // Método para adicionar relações entre livros
    public void adicionarRelacao(Livro origem, Livro destino) {
        adicionarLivro(origem);
        adicionarLivro(destino);

        grafo.get(origem).add(destino);
        grafo.get(destino).add(origem);
    }

    // Método para obter os livros relacionados a um livro dado
    public Set<Livro> obterLivrosRelacionados(Livro livro) {
        return grafo.getOrDefault(livro, new HashSet<>());
    }
}

public class RecomendadorLivros {
    // Algoritmo de Dijkstra simplificado
    public static Map<Livro, Integer> dijkstraSimples(Grafo grafo, Livro origem) {
        Map<Livro, Integer> distancias = new HashMap<>();
        Queue<Livro> fila = new LinkedList<>();

        distancias.put(origem, 0); // peso padrão é 0
        fila.add(origem);

        while (!fila.isEmpty()) {
            Livro atual = fila.poll();
            int distanciaAtual = distancias.get(atual);

            for (Livro vizinho : grafo.obterLivrosRelacionados(atual)) {
                if (!distancias.containsKey(vizinho)) {
                    distancias.put(vizinho, distanciaAtual + 1);
                    fila.add(vizinho);
                }
            }
        }

        return distancias;
    }

    public static void main(String[] args) {
        Grafo grafoDeLivros = new Grafo();

        // Criação dos livros
        Livro livro1 = new Livro("1984", "George Orwell", "Ficção Distópica", 1949);
        Livro livro2 = new Livro("Admirável Mundo Novo", "Aldous Huxley", "Ficção Distópica", 1932);
        // Adicione mais livros conforme necessário

        // Adição das relações entre os livros
        grafoDeLivros.adicionarRelacao(livro1, livro2);
        // Adicione mais relações conforme necessário

        // Escolha um livro de origem
        Livro livroOrigem = livro1;

        // Use o algoritmo de Dijkstra para encontrar os caminhos mais curtos
        Map<Livro, Integer> distancias = dijkstraSimples(grafoDeLivros, livroOrigem);

        // Imprima as distâncias calculadas para cada livro
        for (Map.Entry<Livro, Integer> entry : distancias.entrySet()) {
            Livro livro = entry.getKey();
            int distancia = entry.getValue();
            System.out.println("Distância de '" + livroOrigem.titulo + "' até '" + livro.titulo + "': " + distancia);
        }
    }
}



