
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Livro{
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private Queue<Usuario> filaDeEspera;


    public Livro(String titulo,String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.filaDeEspera = new LinkedList<>();
    }


    public void adicionarUsuarioFilaEspera(Usuario usuario) {
        filaDeEspera.add(usuario);
    }


    public String getTitulo() {
        return titulo;
    }

    

}


class Usuario{

    private String nome;

    public Usuario(String nomeDoUsuario){
        this.nome = nomeDoUsuario;
    }
}




class BibliotecaV{

    LinkedList<Livro> pratileiraDelivros;
    Stack<String> historicoNavegacao;

    public BibliotecaV(){
        this.pratileiraDelivros = new LinkedList<>();
        this.historicoNavegacao = new Stack<>();

        pratileiraDeLivros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        pratileiraDeLivros.add(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997));
        pratileiraDeLivros.add(new Livro("Dom Quixote", "Miguel de Cervantes", 1605));
        pratileiraDeLivros.add(new Livro("1984", "George Orwell", 1949));
        pratileiraDeLivros.add(new Livro("A Revolução dos Bichos", "George Orwell", 1945));
        pratileiraDeLivros.add(new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967));
        pratileiraDeLivros.add(new Livro("A Arte da Guerra", "Sun Tzu", 1500));
        pratileiraDeLivros.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943));
        pratileiraDeLivros.add(new Livro("Orgulho e Preconceito", "Jane Austen", 1813));
        pratileiraDeLivros.add(new Livro("Crime e Castigo", "Fiódor Dostoiévski", 1866));
    }


    

    

    public void consultarLivro(Livro livro, Usuario nome){
        if (pratileiraDelivros.contains(livro)){
            System.out.println("Livro disponivel!!");
            

        }else {
            livro.adicionarUsuarioFilaEspera(nome);
            System.out.println("Livro não disponível. Adicionado à lista de espera.");
        }
        

    }

  
}




public class Biblioteca {
    
}
