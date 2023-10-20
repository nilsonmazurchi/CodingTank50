import java.util.Scanner;

public class exerc23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        do {
            // Solicita ao usuário para inserir um número
            do {
                System.out.print("Digite um número (ou 0 para sair): ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Por favor, insira um número válido.");
                    System.out.print("Digite um número (ou 0 para sair): ");
                    scanner.next(); // Limpa o buffer do scanner
                }
                numero = scanner.nextDouble();
            } while (numero < 0); // Considerando apenas números não negativos

            // Verifica se o número é inteiro ou decimal
            if (numero != 0) {
                boolean ehInteiro = numero == Math.floor(numero);

                if (ehInteiro) {
                    System.out.println(numero + " é um número inteiro.");
                } else {
                    System.out.println(numero + " é um número decimal.");
                }
            }

        } while (numero != 0);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
