package AtividadeDiagnostica;

public class Moda {
    public static void main(String[] args) {

        int[] vetor = {1, 5, 2, 3, 1, 3, 1};
        
        int numeroVezes;

        int numeroVezesAnterior = 0;

        int moda = 0;

 

        for (int i = 0; i < vetor.length; i++) {

            numeroVezes = 1;

 

            for (int j = 0; j < vetor.length; j++) {

                if (vetor[i] == vetor[j]) {

                    numeroVezes++;

                }

            }

            if (numeroVezes > numeroVezesAnterior) {

                moda = vetor[i];

                numeroVezesAnterior = numeroVezes;

            }

        }

 

        System.out.println("Moda: " + moda);

    }
    
}
