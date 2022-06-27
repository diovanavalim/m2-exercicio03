package Exercicio02;

public class Distribuidora {
    public static void main(String[] args) {
        Pereciveis queijo = new Pereciveis(3, "queijo", 5.80);
        Pereciveis presunto = new Pereciveis(1, "presunto", 6.10);
        NaoPereciveis sabaoEmPo = new NaoPereciveis("lavanderia", "sabão em pó", 10.40);
        NaoPereciveis amaciante = new NaoPereciveis("lavanderia", "amaciante", 12.23);
        Pereciveis iogurte = new Pereciveis(30, "iogurte", 7.80);

        double precoQueijo = queijo.calcular(5);
        double precoPresunto = presunto.calcular(5);
        double precoSabaoEmPo = sabaoEmPo.calcular(5);
        double precoAmaciante = amaciante.calcular(5);
        double precoIogurte = iogurte.calcular(5);

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

        System.out.println(" ");

        System.out.println("Preço queijo x5: " + precoQueijo);
        System.out.println("Preço presunto x5: " + precoPresunto);
        System.out.println("Preço sabão em pó x5: " + precoSabaoEmPo);
        System.out.println("Preço amaciante x5: " + precoAmaciante);
        System.out.println("Preço iogurte x5: " + precoIogurte);
    }
}
