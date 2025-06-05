import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Criado um classe simples , somente com o nome que seria o titulo do livro , e um set de livros que representa as conexões do livro.

class Livro {
    String nome;
    Set<Livro> conexoes;

    public Livro(String nome) {
        this.nome = nome;
        this.conexoes = new HashSet<>();
    }

    public void adicionarConexao(Livro livro) {
        conexoes.add(livro);
    }

    public String getNome() {
        return nome;
    }

    public Set<Livro> getConexoes() {
        return conexoes;
    }
}

// Como fui orientado e agora com mais conhecimento aprofundado , use o Hashmap para representar o grafo de livros.

class Grafo {
    private HashMap<String, Livro> livros;

    public Grafo() {
        livros = new HashMap<>();
    }

    public void adicionarLivro(String nomeDoLivro) {
        livros.put(nomeDoLivro, new Livro(nomeDoLivro));
    }

    public void adicionarConexao(String livro1, String livro2) {
        Livro l1 = livros.get(livro1);
        Livro l2 = livros.get(livro2);

        if (l1 != null && l2 != null) {
            l1.adicionarConexao(l2);
            l2.adicionarConexao(l1);
        }
    }
    // Este método implementa o algoritmo de Dijkstra para encontrar as menores distâncias entre um nó de origem e todos os outros nós em um grafo
    public Map<Livro, Integer> dijkstraSimples(HashMap<Livro, Set<Livro>> grafo, Livro origem) {
        Map<Livro, Integer> distancias = new HashMap<>();
        Queue<Livro> fila = new LinkedList<>();

        distancias.put(origem, 0);
        fila.add(origem);

        while (!fila.isEmpty()) {
            Livro atual = fila.poll();
            int distanciaAtual = distancias.get(atual);

            for (Livro vizinho : grafo.getOrDefault(atual, new HashSet<>())) {
                if (!distancias.containsKey(vizinho)) {
                    distancias.put(vizinho, distanciaAtual + 1);
                    fila.add(vizinho);
                }
            }
        }

        return distancias;
    }

    //Este método, faz o seguinte: primeiro, ele calcula a distância entre o livro de origem escolhido e os outros livros no grafo. Em seguida, ele lista esses livros em ordem crescente de distância, ou seja, dos mais próximos aos mais distantes. e no fim  ele recomenda os dois livros mais próximos como sugestões de leitura

    public List<String> recomendarLivros(String origem) {
        List<String> recomendacoes = new ArrayList<>();
        Map<Livro, Integer> distancias = dijkstraSimples(converterGrafo(), livros.get(origem));

        // Usei essa logica para Ordenar as distâncias em ordem crescente
        List<Map.Entry<Livro, Integer>> listaOrdenada = new ArrayList<>(distancias.entrySet());
        listaOrdenada.sort(Comparator.comparingInt(Map.Entry::getValue));

        // Essa linha percorre a lista de entradas ordenadas por distância e adiciona os nomes dos livros com as menores distâncias à lista de recomendações.
        for (Map.Entry<Livro, Integer> entrada : listaOrdenada) {
            Livro livro = entrada.getKey();
            if (!livro.getNome().equals(origem)) {
                recomendacoes.add(livro.getNome());
            }
        }

        List<String> recomendacoesSimples = new ArrayList<>();
        if (recomendacoes.size() >= 2) {
            // Se houver mais de dois elementos, pegue apenas os dois primeiros
            recomendacoesSimples.add(recomendacoes.get(0));
            recomendacoesSimples.add(recomendacoes.get(1));
        } else {
            // Se houver menos de dois elementos, pegue todos
            recomendacoesSimples.addAll(recomendacoes);
        }
        return recomendacoesSimples;
    }

    public HashMap<Livro, Set<Livro>> converterGrafo() {
        HashMap<Livro, Set<Livro>> grafoConvertido = new HashMap<>();
        for (Livro livro : livros.values()) {
            grafoConvertido.put(livro, livro.getConexoes());
        }
        return grafoConvertido;
    }

    // Método para acessar os livros do grafo de livros .
    public HashMap<String, Livro> getLivros() {
        return livros;
    }
}

class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        grafo.adicionarLivro("A Garota no Trem");
        grafo.adicionarLivro("O Sol é para Todos");
        grafo.adicionarLivro("A Coragem de Ser Imperfeito");
        grafo.adicionarLivro("As Crônicas de Gelo e Fogo: A Guerra dos Tronos");
        grafo.adicionarLivro("A Culpa é das Estrelas");
        grafo.adicionarLivro("O Orfanato da Srta. Peregrine Para Crianças Peculiares");
        grafo.adicionarLivro("Estação Onze");
        grafo.adicionarLivro("Pequenas Grandes Mentiras");
        grafo.adicionarLivro("Sapiens: Uma Breve História da Humanidade");
        grafo.adicionarLivro("Extraordinário");

        grafo.adicionarConexao("A Garota no Trem", "O Sol é para Todos");
        grafo.adicionarConexao("A Garota no Trem", "A Coragem de Ser Imperfeito");
        grafo.adicionarConexao("O Sol é para Todos", "A Coragem de Ser Imperfeito");
        grafo.adicionarConexao("A Coragem de Ser Imperfeito", "As Crônicas de Gelo e Fogo: A Guerra dos Tronos");
        grafo.adicionarConexao("As Crônicas de Gelo e Fogo: A Guerra dos Tronos", "A Culpa é das Estrelas");
        grafo.adicionarConexao("A Culpa é das Estrelas", "O Orfanato da Srta. Peregrine Para Crianças Peculiares");
        grafo.adicionarConexao("O Orfanato da Srta. Peregrine Para Crianças Peculiares", "Estação Onze");
        grafo.adicionarConexao("Estação Onze", "Pequenas Grandes Mentiras");
        grafo.adicionarConexao("Pequenas Grandes Mentiras", "Sapiens: Uma Breve História da Humanidade");
        grafo.adicionarConexao("Sapiens: Uma Breve História da Humanidade", "Extraordinário");
        grafo.adicionarConexao("Extraordinário", "A Garota no Trem");
        grafo.adicionarConexao("Extraordinário", "O Sol é para Todos");

        // fique a vontade para trcocar o nome dos livros , afim de ver as interações

        String livroOrigem = "A Garota no Trem";

        //Essa parte do código imprime as distâncias a partir do nó de origem utilizando o método dijkstraSimples do objeto grafo,confesso que foi algo desafiador e tive que fazer algumas consultas para chegar nesse resultado 

        System.out.println("Distâncias a partir de " + livroOrigem + ":");
        System.out.println("");
        for (Map.Entry<Livro, Integer> entrada : grafo.dijkstraSimples(grafo.converterGrafo(), grafo.getLivros().get(livroOrigem)).entrySet()) {
            System.out.println(entrada.getKey().getNome() + ": " + entrada.getValue());
        }
        
        // Essa parte do código, foi apenas um bonus , ela  imprime as recomendações baseadas nas menores distâncias a partir do nó de origem especificado

        System.out.println("");
        System.out.println("Recomendações baseadas na distância:");
        for (String recomendacao : grafo.recomendarLivros(livroOrigem)) {
            System.out.println("- " + recomendacao);
        }
    }
}

















