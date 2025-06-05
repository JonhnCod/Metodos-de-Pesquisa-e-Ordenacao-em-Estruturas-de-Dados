
import java.util.LinkedList;

// Exemplo de estruturas implementadas do 0 (Filas e pilhas)

class FilaComListaLigada{

    private  LinkedList<Integer> listaInterna = new LinkedList<>();

    public void incluirItensNaFila(int item) {
        listaInterna.addLast(item);

    }

    public int removerItemDaFila(){
        if (!verificarFilaVazia()){
            return listaInterna.removeFirst();
        } else {
            System.out.println("Eita! Nao tem nenhum item na  fila ");
            return -1;
        }

    }

    public boolean verificarFilaVazia(){
        return listaInterna.isEmpty();

        }

    }


class PilhaComListaLigada{

    private  LinkedList<Integer> pilhaInterna = new LinkedList<>();
    
        public void incluirItensNaPilha(int item) {
            pilhaInterna.addLast(item);
    
        }
    
        public int removerItemDaPilha(){
            if (!verificarPilhaVazia()){
                return pilhaInterna.removeLast();
            } else {
                System.out.println("Eita! Nao tem nenhum item na  Pilha ");
                return -1;
            }
    
        }
    
        public boolean verificarPilhaVazia(){
            return pilhaInterna.isEmpty();
    
            }
    
        }


public class Exemplofila {

    public static void main(String[] args) {

        LinkedList<Integer> minhaLista = new LinkedList<>();

        minhaLista.add(10);
        minhaLista.add(15);
        minhaLista.add(12);
        minhaLista.add(1);
        minhaLista.add(0);
        minhaLista.add(40);



        // Exemplo de filas 

    FilaComListaLigada minhaFila = new FilaComListaLigada();

    minhaFila.incluirItensNaFila(10);
    minhaFila.incluirItensNaFila(20);
    minhaFila.incluirItensNaFila(30);
    minhaFila.incluirItensNaFila(40);
    minhaFila.incluirItensNaFila(50);
    minhaFila.incluirItensNaFila(100);


    while (!minhaFila.verificarFilaVazia()){
        int primeiroDaFila = minhaFila.removerItemDaFila();
        System.err.println("O primeiro item da fila é: " + primeiroDaFila);
    }


    // Exemplo de pilhas 

    PilhaComListaLigada minhaPilha = new PilhaComListaLigada();

    minhaPilha.incluirItensNaPilha(10);
    minhaPilha.incluirItensNaPilha(120);
    minhaPilha.incluirItensNaPilha(58);
    minhaPilha.incluirItensNaPilha(145);
    minhaPilha.incluirItensNaPilha(15);
    minhaPilha.incluirItensNaPilha(14);


    while (!minhaPilha.verificarPilhaVazia()){
        int primeiroDaPilha = minhaPilha.removerItemDaPilha();
        System.out.println("O primeiro item da Pilha é: " + primeiroDaPilha);
    }
        
    }
    
}
