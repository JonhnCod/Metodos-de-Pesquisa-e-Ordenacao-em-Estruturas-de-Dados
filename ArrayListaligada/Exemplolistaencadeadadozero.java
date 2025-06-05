package ArrayListaligada;



    class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    class Listaencadeada {
        Node head;
    
        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
    
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    
        public void remove(int data) {
            if (head == null) return;  // Lista vazia, nada para remover
    
            // Se o nó a ser removido está no começo
            if (head.data == data) {
                head = head.next;
                return;
            }
    
            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }
    
            // Nó não encontrado
            if (current.next == null) return;
    
            // Remove o nó
            current.next = current.next.next;
        }
    }

public class Exemplolistaencadeadadozero {
    
    
        public static void main(String[] args) {
            Listaencadeada list = new Listaencadeada();
    
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


    

