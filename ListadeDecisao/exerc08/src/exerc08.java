import java.util.Scanner;

public class exerc08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoProduto1, precoProduto2, precoProduto3;

        // Solicita ao usuário para inserir o preço do primeiro produto
        System.out.print("Digite o preço do primeiro produto: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido.");
            System.out.print("Digite o preço do primeiro produto: ");
            scanner.next(); // Limpa o buffer do scanner
        }
        precoProduto1 = scanner.nextDouble();

        // Solicita ao usuário para inserir o preço do segundo produto
        System.out.print("Digite o preço do segundo produto: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido.");
            System.out.print("Digite o preço do segundo produto: ");
            scanner.next(); // Limpa o buffer do scanner
        }
        precoProduto2 = scanner.nextDouble();

        // Solicita ao usuário para inserir o preço do terceiro produto
        System.out.print("Digite o preço do terceiro produto: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido.");
            System.out.print("Digite o preço do terceiro produto: ");
            scanner.next(); // Limpa o buffer do scanner
        }
        precoProduto3 = scanner.nextDouble();

        // Verifica qual produto é o mais barato
        if (precoProduto1 <= precoProduto2 && precoProduto1 <= precoProduto3) {
            System.out.println("Você deve comprar o primeiro produto.");
        } else if (precoProduto2 <= precoProduto1 && precoProduto2 <= precoProduto3) {
            System.out.println("Você deve comprar o segundo produto.");
        } else {
            System.out.println("Você deve comprar o terceiro produto.");
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
