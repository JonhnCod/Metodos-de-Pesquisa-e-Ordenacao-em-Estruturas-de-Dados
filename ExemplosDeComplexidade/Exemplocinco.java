package ExemplosDeComplexidade;
public class Exemplocinco {
    public static void main(String[] args) {
        mostrarPares(1);
        mostrarPares(3);
        mostrarPares(5);
    }

    public static void mostrarPares(int numeroRoupasTenis) {
        System.out.println("=".repeat(50));
        System.out.println("Mostrando combinações para " + numeroRoupasTenis + " roupas e tênis:");
        System.out.println("=".repeat(50));

        for (int i = 0; i < numeroRoupasTenis; i++) {
            for (int j = 0; j < numeroRoupasTenis; j++) {
                System.out.println("Tênis " + i + " + Roupa " + j);
            }
        }
        System.out.println("\n");
    }
    
}
