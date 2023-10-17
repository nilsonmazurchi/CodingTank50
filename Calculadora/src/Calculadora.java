import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        // Obtém o primeiro número inteiro
        boolean numero1Valido = false;
        while (!numero1Valido) {
            try {
                System.out.print("Digite o primeiro número inteiro: ");
                numero1 = scanner.nextInt();
                numero1Valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número inteiro válido.");
                scanner.next(); // Limpa o buffer do Scanner
            }
        }

        // Obtém o segundo número inteiro
        boolean numero2Valido = false;
        while (!numero2Valido) {
            try {
                System.out.print("Digite o segundo número inteiro: ");
                numero2 = scanner.nextInt();
                numero2Valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número inteiro válido.");
                scanner.next(); // Limpa o buffer do Scanner
            }
        }

        // Realiza as operações matemáticas que podem ser realizadas
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;

        // Exibe os resultados na tela
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        // Verifica se o segundo número é diferente de zero antes de fazer a divisão
        if (numero2 != 0) {
            int divisao = numero1 / numero2;
            System.out.println("Divisão: " + divisao);
        } else {
            // Exibe mensagem de aviso se o segundo número for zero
            System.out.println("Aviso: Não é possível dividir por zero.");
        }

        scanner.close();
    }
}
