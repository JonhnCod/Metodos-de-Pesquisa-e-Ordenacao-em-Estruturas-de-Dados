package ArrayListaligada;

import java.util.Arrays;

public class Exemploremovematriz {

    public static void main(String[] args) {
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("Matriz original: " + Arrays.deepToString(matrizOriginal));

        // Adicionando uma nova linha
        int[][] matrizComLinhaAdicional = new int[matrizOriginal.length + 1][matrizOriginal[0].length];
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                matrizComLinhaAdicional[i][j] = matrizOriginal[i][j];
            }
        }
        // Inicializando a nova linha com valores (por exemplo, 0)
        for (int j = 0; j < matrizComLinhaAdicional[0].length; j++) {
            matrizComLinhaAdicional[matrizComLinhaAdicional.length - 1][j] = 0;
        }
        System.out.println("Matriz com +1 linha: " + Arrays.deepToString(matrizComLinhaAdicional));

        // Adicionando uma nova coluna
        int[][] matrizComColunaAdicional = new int[matrizOriginal.length][matrizOriginal[0].length + 1];
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                matrizComColunaAdicional[i][j] = matrizOriginal[i][j];
            }
            // Inicializando a nova coluna com valores (por exemplo, 0)
            matrizComColunaAdicional[i][matrizComColunaAdicional[i].length - 1] = 0;
        }
        System.out.println("Matriz com +1 coluna: " + Arrays.deepToString(matrizComColunaAdicional));
    }
    
}
