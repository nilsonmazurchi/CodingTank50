import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        double valor;

        // Solicita ao usuário para inserir um valor
        System.out.print("Digite um valor: ");

        // Verifica se o próximo token é um número double
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido.");
            // Limpa o buffer do scanner antes de solicitar a entrada novamente
            scanner.next();
            System.out.print("Digite um valor: ");
        }
        valor = scanner.nextDouble();

        // Verifica se o valor é positivo, negativo ou zero
        if (valor > 0) {
            System.out.println("O valor é positivo.");
        } else if (valor < 0) {
            System.out.println("O valor é negativo.");
        } else {
            System.out.println("O valor é zero.");
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
