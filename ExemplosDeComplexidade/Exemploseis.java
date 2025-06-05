package ExemplosDeComplexidade;
public class Exemploseis {
    public static void main(String[] args) {
        for (int i = 1; i < 16; i++) {
            int resultado = calcularCoelhos(i);
            System.out.println("No " + i + "o mês teremos " + resultado + " coelhos.");
        }
    }

    public static int calcularCoelhos(int mes) {
        try {
            if (mes == 0) {
                Thread.sleep(1);
                return 1; // Vamos supor que começamos com 1 par de coelhos
            } else {
                int totalCoelhos = 2 * calcularCoelhos(mes - 1);
                Thread.sleep(totalCoelhos);
                return totalCoelhos;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    
}
