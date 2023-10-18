import java.util.Scanner;

public class exerc07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2, numero3;

        // Solicita ao usuário para inserir o primeiro número
        System.out.print("Digite o primeiro número: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido.");
            System.out.print("Digite o primeiro número: ");
            scanner.next(); // Limpa o buffer do scanner
        }
        numero1 = scanner.nextDouble();

        // Solicita ao usuário para inserir o segundo número
        System.out.print("Digite o segundo número: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido.");
            System.out.print("Digite o segundo número: ");
            scanner.next(); // Limpa o buffer do scanner
        }
        numero2 = scanner.nextDouble();

        // Solicita ao usuário para inserir o terceiro número
        System.out.print("Digite o terceiro número: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido.");
            System.out.print("Digite o terceiro número: ");
            scanner.next(); // Limpa o buffer do scanner
        }
        numero3 = scanner.nextDouble();

        // Calcula o maior número
        double maiorNumero = Math.max(Math.max(numero1, numero2), numero3);

        // Calcula o menor número
        double menorNumero = Math.min(Math.min(numero1, numero2), numero3);

        // Imprime o maior e o menor número
        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O menor número é: " + menorNumero);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
