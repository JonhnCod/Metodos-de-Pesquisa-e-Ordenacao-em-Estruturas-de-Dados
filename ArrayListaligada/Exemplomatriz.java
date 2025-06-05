package ArrayListaligada;

public class Exemplomatriz {

    public static void main(String[] args) {
        // primeira forma
        int[][] minhaMatriz;
        minhaMatriz = new int[2][3];

        minhaMatriz[0][0] = 1;
        minhaMatriz[0][1] = 2;
        minhaMatriz[0][2] = 3;
        minhaMatriz[1][0] = 4;
        minhaMatriz[1][1] = 5;
        minhaMatriz[1][2] = 6;

        // segunda forma
        int[][] outraMatriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // outros tipos (exemplo: String)
        String[][] nomes = {
                {"Ana", "Beto"},
                {"Carlos", "Diana"},
                {"Eduardo", "Fernanda"}
        };
    }
    
}
