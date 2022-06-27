package Exercicio01;

public class PraticaExcecoes2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            int result = b / a;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Não pode ser dividido por zero.");
        }
    }
}
