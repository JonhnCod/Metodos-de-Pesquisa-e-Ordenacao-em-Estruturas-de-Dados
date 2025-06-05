package ExemplosDeComplexidade;
public class Exemplodois {
    public static void main(String[] args) {
        int primeiroNum = 813604;
        int segundoNum = 72948681;
        int terceiroNum = 49;

        Resultado raizPrimeiroNum = raizQuadradaInteira(primeiroNum);
        Resultado raizSegundoNum = raizQuadradaInteira(segundoNum);
        Resultado raizTerceiroNum = raizQuadradaInteira(terceiroNum);

        System.out.println("Raiz de " + primeiroNum + " = " + raizPrimeiroNum.raiz + " (" + raizPrimeiroNum.etapas + " etapas)");
        System.out.println("Raiz de " + segundoNum + " = " + raizSegundoNum.raiz + " (" + raizSegundoNum.etapas + " etapas)");
        System.out.println("Raiz de " + terceiroNum + " = " + raizTerceiroNum.raiz + " (" + raizTerceiroNum.etapas + " etapas)");
    }

    public static Resultado raizQuadradaInteira(int n) {
        int x = n;
        int y = (x + n / x) / 2;
        int totalEtapas = 1;

        while (y < x) {
            x = y;
            y = (x + n / x) / 2;
            totalEtapas += 1;
        }

        return new Resultado(x, totalEtapas);
    }

    static class Resultado {
        int raiz;
        int etapas;

        Resultado(int raiz, int etapas) {
            this.raiz = raiz;
            this.etapas = etapas;
        }
    }
}
    

