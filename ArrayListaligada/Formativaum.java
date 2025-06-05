package ArrayListaligada;

import java.util.LinkedList;

class Livro {
    String titulo;
    String autor;
    int data;

    public Livro(String titulo, String autor, int data) {
        this.titulo = titulo;
        this.autor = autor;
        this.data = data;
    }
}

class Nod {
    Livro livro;
    Nod proximo;

    public Nod(Livro livro) {
        this.livro = livro;
        this.proximo = null;
    }
}

class BibliotecaVirtual {
    Nod inicio;
    Nod ultimo;
    

    public BibliotecaVirtual() {

        LinkedList<Livro> listLivros = new LinkedList<>();

        listLivros.add(new Livro("harry potter", "Jonathan", 1988));
        listLivros.add(new Livro("harry potter", "Jonathan", 1988));
        listLivros.add(new Livro("harry potter", "Jonathan", 1988));
        listLivros.add(new Livro("harry potter", "Jonathan", 1988));
        listLivros.add(new Livro("harry potter", "Jonathan", 1988));
        listLivros.add(new Livro("harry potter", "Jonathan", 1988));
        listLivros.add(new Livro("harry potter", "Jonathan", 1988));
        listLivros.add(new Livro("harry potter", "Jonathan", 1988));
        listLivros.add(new Livro("harry potter", "Jonathan", 1988));
        listLivros.add(new Livro("harry potter", "Jonathan", 1988));

        for (Livro livro : listLivros) {
            Nod novoNo = new Nod(livro);
            if (inicio == null) {
                inicio = novoNo;
                ultimo = novoNo; 
            } else {
                ultimo.proximo = novoNo; 
                ultimo = novoNo; 
            }
        }
    }

    public void printList(){

        Nod atual = inicio;

        while (atual != null){

            System.out.println("Título: " + atual.livro.titulo);
            System.out.println("Autor: " + atual.livro.autor);
            System.out.println("Ano de publicação: " + atual.livro.data);
            System.out.println("------------------------");
            atual = atual.proximo;
        }
    }
}

    public class Formativaum{

        public static void main(String[] args) {

            BibliotecaVirtual biblioteca = new BibliotecaVirtual();

            biblioteca.printList();



        
        }
    }









