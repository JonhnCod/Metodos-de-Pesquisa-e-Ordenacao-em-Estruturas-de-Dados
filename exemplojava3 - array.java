import java.util.Arrays;
public class exemplojava3 {
    
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        System.out.println("Vetor original: " + Arrays.toString(original));

        int[] novo = new int[original.length + 1];
        System.arraycopy(original, 0, novo, 0, original.length);
        novo[original.length] = 4000; // Adicionando o elemento 4000
        System.out.println("Novo vetor: " + Arrays.toString(novo));
    }
}
    

