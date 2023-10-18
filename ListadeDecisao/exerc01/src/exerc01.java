import java.util.Scanner;

public class exerc01 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2;

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

        // Verifica qual número é maior
        double maiorNumero = Math.max(numero1, numero2);

        // Imprime o maior número
        System.out.println("O maior número é: " + maiorNumero);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
