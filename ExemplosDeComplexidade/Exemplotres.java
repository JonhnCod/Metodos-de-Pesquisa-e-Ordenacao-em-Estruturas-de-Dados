package ExemplosDeComplexidade;
public class Exemplotres {
    public static void main(String[] args) {
        int[] valores = {10, 100, 10000, 1000000};

        for (int valor : valores) {
            Resultado resultado = somaNumeros(valor);
            System.out.println("Resultado da soma de " + valor + " elementos: " + resultado.soma + " (" + resultado.etapas + " etapas)");
        }
    }

    public static Resultado somaNumeros(int n) {
        int soma = 0;
        int etapas = 0;

        for (int i = 0; i < n; i++) {
            soma += i;
            etapas += 1;
        }

        return new Resultado(soma, etapas);
    }

    static class Resultado {
        int soma;
        int etapas;

        Resultado(int soma, int etapas) {
            this.soma = soma;
            this.etapas = etapas;
        }
    }
}

    

