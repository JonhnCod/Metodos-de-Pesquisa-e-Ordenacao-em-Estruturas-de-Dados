import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;



class BibliotecaVirtual{

    private LinkedList<String> pratileiraDeLivros;
    public Queue<String> listaEspera;
    public Stack<List<String>> historicoNavegacao;

    public BibliotecaVirtual(){
        this.pratileiraDeLivros = new LinkedList<>();
        this.listaEspera = new LinkedList<>();
        this.historicoNavegacao = new Stack<>();

        pratileiraDeLivros.add("livro1");
        pratileiraDeLivros.add("livro2");
        pratileiraDeLivros.add("livro3");
        pratileiraDeLivros.add("livro4");
        pratileiraDeLivros.add("livro5");
        pratileiraDeLivros.add("livro6");

    }

    public void ConsultarLivro(String livro , String Solicitante){
        if (!pratileiraDeLivros.contains(livro)){
            System.out.println("O Livro " + livro + " Não esta Disponivel no momento , vou adicionar seu nome na Lista de espera");
            listaEspera.add(Solicitante);
        }else {
            System.out.println("O Livro: " + livro + " Está Disponivel ! ");
        }
        List<String> consulta = new ArrayList<>();
        consulta.add(livro);
        consulta.add(Solicitante);
        historicoNavegacao.push(consulta);

    }

    public void ConsultarListaEspera(String livro) {
        boolean livroEncontrado = false;
        System.out.println("Lista de espera para o livro \"" + livro + "\":");
        for (String solicitante : listaEspera) {
            if (solicitante.equals(livro)) {
                System.out.println(" - " + solicitante);
                livroEncontrado = true;
            }
        }
        if (!livroEncontrado) {
            System.out.println("Ninguém está esperando pelo livro \"" + livro + "\".");
        }
    }
    


    public void ConsultarHistorico(String solicitante){
        
        Stack<List<String>> historicoTemporario = new Stack<>();

    
    for (List<String> consulta : historicoNavegacao) {
        
        if (consulta.get(1) == solicitante) {

            historicoTemporario.push(consulta); 
        }
    }

    
    if (historicoTemporario.isEmpty()) {
        System.out.println("Nenhum Histórico para: " + solicitante);
    } else {
        System.out.println("Histórico de Consultas de: " + solicitante + ":");
        
        while (!historicoTemporario.isEmpty()) {
            List<String> consulta = historicoTemporario.pop();
            System.out.println("Livro: " + consulta.get(0));
        }
            }
    }
}


public class Formativafilaepilha{

    public static void main(String[] args) {

        BibliotecaVirtual consulta = new BibliotecaVirtual();

        consulta.ConsultarLivro("livro8", "Jonathan");
        consulta.ConsultarLivro("livro2", "Bruna");
        consulta.ConsultarLivro("livro4", "Bruna");
        consulta.ConsultarLivro("livro5", "Bruna");
        consulta.ConsultarLivro("livro6", "Bruna");
        consulta.ConsultarLivro("livro8", "Bruna");

        consulta.ConsultarHistorico("Bruna");
        consulta.ConsultarHistorico("Jonathan");

        consulta.ConsultarListaEspera("livro8");
        
        
    }
}











