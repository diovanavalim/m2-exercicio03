package Exercicio02;

public class NaoPereciveis extends Produto{
    private String tipo;

    public NaoPereciveis(String tipo, String nome, double preco) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
