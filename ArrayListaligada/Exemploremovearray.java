package ArrayListaligada;

import java.util.Arrays;

public class Exemploremovearray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int indexParaRemover = 2; // Por exemplo, remover o elemento na posição 2 (ou seja, o número 3)

        int[] novo = new int[original.length - 1];

        // Copiando os elementos que ficam antes do índice a ser removido
        System.arraycopy(original, 0, novo, 0, indexParaRemover);
        System.out.println("Novo vetor (parcial): " + Arrays.toString(novo));

        // Copiando elementos que ficam depois do índice a ser removido
        System.arraycopy(original, indexParaRemover + 1, novo, indexParaRemover, original.length - indexParaRemover - 1);
        System.out.println("Novo vetor (final): " + Arrays.toString(novo));
    }
    
}
