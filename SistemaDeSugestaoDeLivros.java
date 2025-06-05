import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Livro {
    private String titulo;
    
    public Livro(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    @Override
    public String toString() {
        return titulo;
    }
}

public class SistemaDeSugestaoDeLivros {
    private Map<Livro, Set<Livro>> grafo;
    
    public SistemaDeSugestaoDeLivros() {
        grafo = new HashMap<>();
    }
    
    public void adicionarLivro(Livro livro, Set<Livro> recomendacoes) {
        grafo.put(livro, recomendacoes);
    }
    
    public Set<Livro> obterRecomendacoes(Livro livro) {
        return grafo.get(livro);
    }
    
    public static void main(String[] args) {
        SistemaDeSugestaoDeLivros sistema = new SistemaDeSugestaoDeLivros();
        
        // Adicionando livros e suas recomendações
        Livro livro1 = new Livro("Livro 1");
        Livro livro2 = new Livro("Livro 2");
        Livro livro3 = new Livro("Livro 3");
        Livro livro4 = new Livro("Livro 4");
        Livro livro5 = new Livro("Livro 5");
        
        Set<Livro> recomendacoesLivro1 = new HashSet<>();
        recomendacoesLivro1.add(livro2);
        recomendacoesLivro1.add(livro3);
        
        Set<Livro> recomendacoesLivro2 = new HashSet<>();
        recomendacoesLivro2.add(livro1);
        recomendacoesLivro2.add(livro3);
        
        Set<Livro> recomendacoesLivro3 = new HashSet<>();
        recomendacoesLivro3.add(livro4);
        recomendacoesLivro3.add(livro5);
        
        sistema.adicionarLivro(livro1, recomendacoesLivro1);
        sistema.adicionarLivro(livro2, recomendacoesLivro2);
        sistema.adicionarLivro(livro3, recomendacoesLivro3);
        
        // Obtendo recomendações para um livro específico
        Livro livroSelecionado = livro1;
        Set<Livro> recomendacoes = sistema.obterRecomendacoes(livroSelecionado);
        
        System.out.println("Recomendações para " + livroSelecionado + ":");
        for (Livro recomendacao : recomendacoes) {
            System.out.println("- " + recomendacao);
        }
    }
}

