class No{
    String titulo;
    String autor;
    int data;
    No proximo;

    public No(String titulo,String autor,int data){
        this.titulo = titulo;
        this.autor = autor;
        this.data = data;
        this.proximo = null;
    }
    
}


class LinkedList{
    No inicio;

    public LinkedList(){
        this.inicio = null;
    }

    public void adicionarLivro(String titulo,String autor,int data){
        No newNo = new No(titulo,autor,data);
        if (inicio == null){
            inicio = newNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null){
                atual = atual.proximo;
            }

            atual.proximo = newNo;
        }
    }

    public void MostraLivros(){
        No atual = inicio;
        while (atual != null){
            System.out.println("Titulo do livro: " + atual.titulo);
            System.out.println("Autor do livro: " + atual.autor);
            System.out.println("Ano de Publicacao: " + atual.data);
            System.out.println(" ");
            atual = atual.proximo;

        }
    }
}

public class Mainformativa {
    public static void main(String[] args) {
        LinkedList livraria = new LinkedList();

        livraria.adicionarLivro("jsdhjshdjh", "nskdsjdkj", 0);
        livraria.adicionarLivro("jsdhjshdjh", "nskdsjdkj", 0);
        livraria.adicionarLivro("jsdhjshdjh", "nskdsjdkj", 0);
        livraria.adicionarLivro("jsdhjshdjh", "nskdsjdkj", 0);
        

        System.out.println("Livros na livraria:");
        livraria.MostraLivros(); 

    
    }
}

