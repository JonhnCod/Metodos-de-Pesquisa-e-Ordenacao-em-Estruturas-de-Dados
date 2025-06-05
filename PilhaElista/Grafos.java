

import java.util.ArrayList;
import java.util.LinkedList;

class Grafo {
    private ArrayList<String> livro;
    private ArrayList<LinkedList<String>> rotas;

    public Grafo() {
        cidades = new ArrayList<>();
        rotas = new ArrayList<>();
    }

    public void adicionarCidade(String cidade) {
        cidades.add(cidade);
        rotas.add(new LinkedList<>());
    }

    public void adicionarRota(String origem, String destino) {
        int indexOrigem = cidades.indexOf(origem);
        int indexDestino = cidades.indexOf(destino);

        if (indexOrigem != -1 && indexDestino != -1) {
            rotas.get(indexOrigem).add(destino);
            rotas.get(indexDestino).add(origem);
        }
    }

    public void imprimirGrafo() {
        for (int i = 0; i < cidades.size(); i++) {
            System.out.print("A cidade de " + cidades.get(i) + " tem rotas para: ");

            LinkedList<String> rotasCidadeAtual = rotas.get(i);
            for (int j = 0; j < rotasCidadeAtual.size(); j++) {
                System.out.print(rotasCidadeAtual.get(j));

                if (j < rotasCidadeAtual.size() - 1)
                    System.out.print(", ");
            }
            System.out.println();
        }
    }
}

public class Grafos {
    public static void main(String[] args) {
        Grafo grafoDeCidades = new Grafo();

        grafoDeCidades.adicionarCidade("Curitiba");
        grafoDeCidades.adicionarCidade("Araucária");
        grafoDeCidades.adicionarCidade("Pinhais");
        grafoDeCidades.adicionarCidade("Colombo");
        grafoDeCidades.adicionarCidade("Quatro Barras");
        grafoDeCidades.adicionarCidade("Itaperuçu");
        grafoDeCidades.adicionarCidade("Campo Largo");

        grafoDeCidades.adicionarRota("Curitiba", "Araucária");
        grafoDeCidades.adicionarRota("Curitiba", "Pinhais");
        grafoDeCidades.adicionarRota("Curitiba", "Colombo");
        grafoDeCidades.adicionarRota("Curitiba", "Campo Largo");
        grafoDeCidades.adicionarRota("Araucária", "Campo Largo");
        grafoDeCidades.adicionarRota("Pinhais", "Colombo");
        grafoDeCidades.adicionarRota("Pinhais", "Quatro Barras");
        grafoDeCidades.adicionarRota("Colombo", "Quatro Barras");
        grafoDeCidades.adicionarRota("Itaperuçu", "Campo Largo");

        grafoDeCidades.imprimirGrafo();
    }
}
 
