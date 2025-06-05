package ArrayListaligada;

public class Pesquisalinear {
    
    public static int buscaLinear(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Procurando... Tentativa " + (i + 1) + " de " + array.length);
            if (array[i] == x) {
                return i; // elemento encontrado na posição 'i'
            }
        }
        return -1; // elemento não encontrado
    }

    public static void main(String[] args) {
        int[] vetor = {4, 2, 7, 9, 11, 15, 5, 8, 3, 6};
        int item_para_encontrar = 5;

        int resultado = buscaLinear(vetor, item_para_encontrar);

        if (resultado == -1) {
            System.out.println("Elemento não encontrado.");
        } else {
            System.out.println("Elemento encontrado na posição: " + resultado);
        }
    }
    
}
