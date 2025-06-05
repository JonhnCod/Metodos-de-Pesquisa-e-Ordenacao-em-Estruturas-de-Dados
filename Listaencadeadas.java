class Node {
    int valor;
    Node proximo;

    public Node(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class ListaEncadeada {
    Node inicio;

    public void incluirValorNofinalDalista(int valor) {
        Node newNode = new Node(valor);
        if (inicio == null) {
            inicio = newNode;
            return;
        }

        Node current = inicio;
        while (current.proximo != null) {
            current = current.proximo;
        }
        current.proximo = newNode;
    }

    public void mostrarListaCriada() {
        Node current = inicio;
        while (current != null) {
            System.out.print(current.valor + " -> ");
            current = current.proximo;
        }
        System.out.println("null");
    }

    public void remove(int valor) {
        if (inicio == null) return;  // Lista vazia, nada para remover

        // Se o nó a ser removido está no começo
        if (inicio.valor == valor) {
            inicio = inicio.proximo;
            return;
        }

        Node current = inicio;
        while (current.proximo != null && current.proximo.valor != valor) {
            current = current.proximo;
        }

        // Nó não encontrado
        if (current.proximo == null) return;

        // Remove o nó
        current.proximo = current.proximo.proximo;
    }
}


public class Listaencadeadas {
    public static void main(String[] args) {
        ListaEncadeada list = new ListaEncadeada();

        list.append(10);
        list.append(20);
        list.append(30);

        System.out.println("Lista encadeada:");
        list.printList();

        list.remove(20);  // Remove o valor 20 da lista
        System.out.println("Lista após remover o 20:");
        list.printList();
    }
}
    

