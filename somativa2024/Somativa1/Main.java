import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Grafo {
    private ArrayList<String> livros;
    private ArrayList<LinkedList<String>> conexoes;

    public Grafo() {
        livros = new ArrayList<>();
        conexoes = new ArrayList<>();
    }

    public void adicionarLivro(String nomeDoLivro) {
        livros.add(nomeDoLivro);
        conexoes.add(new LinkedList<>());
    }

    public void adicionarConexao(String livro1, String livro2) {
        int indiceDoLivro1 = livros.indexOf(livro1);
        int indiceDoLivro2 = livros.indexOf(livro2);

        if (indiceDoLivro1 != -1 && indiceDoLivro2 != -1) {
            conexoes.get(indiceDoLivro1).add(livro2);
            conexoes.get(indiceDoLivro2).add(livro1);
        }
    }

    public List<String> sugestaoDeLivros(List<String> interessesDoUsuario) {
        List<String> sugestoes = new ArrayList<>();

        for (String interesse : interessesDoUsuario) {
            int indiceDoLivro = livros.indexOf(interesse);
            if (indiceDoLivro != -1) {
                LinkedList<String> conexoesDoLivro = conexoes.get(indiceDoLivro);
                int contador = 0; 
                for (String livroConectado : conexoesDoLivro) {
                    if (!sugestoes.contains(livroConectado) && !interessesDoUsuario.contains(livroConectado)) {
                        sugestoes.add(livroConectado);
                        contador++;
                        if (contador == 2) 
                            break;
                    }
                }
            }
        }

        return sugestoes;
    }
}

public class Main {
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
        
        // Livre pra trocar os nomes dos livros , a cada troca a sugestão tambem muda !
        // A mesma estrutura pode ser usada para os ultimos livros lidos pelo usuarios 
        List<String> interessesDoUsuario = new ArrayList<>();
        interessesDoUsuario.add("Pequenas Grandes Mentiras");
        interessesDoUsuario.add("Pequenas Grandes Mentiras");

        List<String> sugestoes = grafo.sugestaoDeLivros(interessesDoUsuario);
        System.out.println("Sugestões de livros:");
        for (String sugestao : sugestoes) {
            System.out.println(sugestao);
        }
    }
}


