package ExemplosDeComplexidade;
public class Exemploum {
    public static void main(String[] args) {
        int[] primeiraLista = {5, 10, 15, 20, 25};
        int[] segundaLista = {1, 21312, 12, 0, -15, 2, 20, 3, 4, 5, 6, 7, 8, 9, -20, 200000};
        int[] terceiraLista = {0, 2, -10};

        System.out.println("O 1o elemento da 1a lista é: " + retornarPrimeiroElemento(primeiraLista));
        System.out.println("O 1o elemento da 2a lista é: " + retornarPrimeiroElemento(segundaLista));
        System.out.println("O 1o elemento da 3a lista é: " + retornarPrimeiroElemento(terceiraLista));
    }

    public static Integer retornarPrimeiroElemento(int[] listaQualquer) {
        if (listaQualquer.length > 0) {
            return listaQualquer[0];
        } else {
            return null;
        }
    }
}