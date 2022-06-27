package Exercicio01;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            int result = b / a;
            System.out.println("Resultado: " + result);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro!");
            System.out.println(e.getMessage());
        }
    }
}
