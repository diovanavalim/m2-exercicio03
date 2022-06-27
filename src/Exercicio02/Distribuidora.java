package Exercicio02;

public class Distribuidora {
    public static void main(String[] args) {
        Pereciveis queijo = new Pereciveis(3, "queijo", 5.80);
        Pereciveis presunto = new Pereciveis(1, "presunto", 6.10);
        NaoPereciveis sabaoEmPo = new NaoPereciveis("lavanderia", "sabão em pó", 10.40);
        NaoPereciveis amaciante = new NaoPereciveis("lavanderia", "amaciante", 12.23);
        Pereciveis iogurte = new Pereciveis(30, "iogurte", 7.80);

        Produto produtos[] = {queijo, presunto, sabaoEmPo, amaciante, iogurte};

        for (int i = 0; i < produtos.length; i++) {
            double resultado = produtos[i].calcular(5);
            System.out.println("Produto: " + produtos[i].getNome() + ", preço final: " + resultado);
            System.out.println(" ");
        }

        System.out.println("Queijo:");
        System.out.println("Nome do produto: " + queijo.getNome());
        System.out.println("Dias para vencer: " + queijo.getDiasParaVencer());
        System.out.println("Preço do produto: " + queijo.getPreco());
        System.out.println("Classe: " + queijo.getClass());

        System.out.println(" ");

        System.out.println("Amaciante:");
        System.out.println("Nome do produto: " + amaciante.getNome());
        System.out.println("Preço do produto: " + amaciante.getPreco());
        System.out.println("Tipo do produto: " + amaciante.getTipo());
        System.out.println("Classe: " + amaciante.getClass());
    }
}
