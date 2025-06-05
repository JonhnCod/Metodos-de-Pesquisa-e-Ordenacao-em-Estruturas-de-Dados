package ExemplosDeComplexidade;
public class Exemploquatro {
    public static void main(String[] args) {
        int[] valores = {1, 10, 100, 1000, 10000, 100000, 1000000};

        for (int valor : valores) {
            int etapas = nLogNComplexity(valor);
            System.out.println("Para " + valor + ": " + etapas + " etapas");
        }
    }

    public static int nLogNComplexity(int n) {
        int i = 0;
        int etapas = 0;

        while (i < n) {
            int j = 1;
            etapas += 1;

            while (j < n) {
                j *= 2;
                etapas += 1;
            }

            i += 1;
        }

        return etapas;
    }
    
}
