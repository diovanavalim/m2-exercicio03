package Exercicio02;

public class Pereciveis extends Produto{
    private int diasParaVencer;

    public Pereciveis(int diasParaVencer, String nome, double preco) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return this.diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeProdutos) {
        double preco = super.calcular(quantidadeProdutos);
        switch (this.diasParaVencer) {
            case 1:
                return preco/4;
            case 2:
                return preco/3;
            case 3:
                return preco/2;
            default:
                return preco;
        }
    }
}
