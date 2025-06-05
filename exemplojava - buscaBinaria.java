public class exemplojava {
        public static int buscaBinaria(int[] array, int x) {
            int esquerda = 0;
            int direita = array.length - 1;
            int contador = 1;
    
            while (esquerda <= direita) {
                int meio = (esquerda + direita) / 2;
                System.out.print("Tentativa " + contador + ". ");
                System.out.print("Vendo se " + x + " fica antes/depois/é igual a " + array[meio] + ". ");
                contador++;
    
                if (array[meio] == x) {
                    System.out.println("Achei!");
                    return meio; // elemento encontrado na posição 'meio'
                } else if (array[meio] < x) {
                    System.out.println("Fica depois.");
                    esquerda = meio + 1; // procurar na metade à direita
                } else {
                    System.out.println("Fica antes.");
                    direita = meio - 1; // procurar na metade à esquerda
                }
            }
    
            return -1; // elemento não encontrado
        }
    
        public static void main(String[] args) {
            int[] vetor = {1, 3, 5, 7, 9, 10, 11, 13, 14, 15, 17, 19, 20, 22, 200};
            int item_para_encontrar = 11;
    
            int resultado = buscaBinaria(vetor, item_para_encontrar);
    
            if (resultado == -1) {
                System.out.println("Elemento não encontrado.");
            } else {
                System.out.println("Elemento encontrado na posição: " + resultado);
            }
        }
    }
    

