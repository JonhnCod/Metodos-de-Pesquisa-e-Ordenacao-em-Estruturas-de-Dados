package outro exemplo;
import java.util.LinkedList;

class FilaComLista {
    private LinkedList<Integer> lista = new LinkedList<Integer>();

    // Adiciona elemento na fila
    public void enfileirar(int valor) {
        lista.addLast(valor);  // Adiciona no final da lista
    }

    // Remove elemento da fila
    public int desenfileirar() {
        if (!estaVazia()) {
            return lista.removeFirst();  // Remove do início da lista
        } else {
            System.out.println("Fila vazia!");
            return -1;  // Indicando erro
        }
    }

    // Verifica se a fila está vazia
    public boolean estaVazia() {
        return lista.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        FilaComLista fila = new FilaComLista();

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        fila.enfileirar(40);
        fila.enfileirar(50);
        fila.enfileirar(60);
        fila.enfileirar(70);
        fila.enfileirar(4);
        fila.enfileirar(5);
        fila.enfileirar(1);

        while (!fila.estaVazia()) {
            System.out.println("Removendo o 1o valor da lista. Removemos o: " + fila.desenfileirar());
        }
    }
}
    

