import java.util.Scanner;

public class exerc22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            // Solicita ao usuário para inserir um número inteiro
            int numero;
            do {
                System.out.print("Digite um número inteiro: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, insira um número inteiro válido.");
                    System.out.print("Digite um número inteiro: ");
                    scanner.next(); // Limpa o buffer do scanner
                }
                numero = scanner.nextInt();
            } while (numero < 0); // Considerando apenas números não negativos

            // Verifica se o número é par ou ímpar
            if (numero % 2 == 0) {
                System.out.println(numero + " é um número par.");
            } else {
                System.out.println(numero + " é um número ímpar.");
            }

            // Pergunta se deseja inserir outro número
            System.out.print("Deseja inserir outro número? (Digite 'sim' para continuar ou 'não' para sair): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("sim"));

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
