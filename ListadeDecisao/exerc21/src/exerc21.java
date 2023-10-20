import java.util.Scanner;

public class exerc21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Solicita ao usuário para inserir o valor do saque
            int valorSaque;
            do {
                System.out.print("Digite o valor do saque (entre 10 e 600 reais): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, insira um valor válido.");
                    System.out.print("Digite o valor do saque (entre 10 e 600 reais): ");
                    scanner.next(); // Limpa o buffer do scanner
                }
                valorSaque = scanner.nextInt();
            } while (valorSaque < 10 || valorSaque > 600);

            // Calcula as notas de cada valor e exibe a quantidade de cada nota
            int notas100 = valorSaque / 100;
            int notas50 = (valorSaque % 100) / 50;
            int notas10 = ((valorSaque % 100) % 50) / 10;
            int notas5 = (((valorSaque % 100) % 50) % 10) / 5;
            int notas1 = (((valorSaque % 100) % 50) % 10) % 5;

            // Exibe as notas fornecidas
            System.out.println("Notas fornecidas:");
            if (notas100 > 0) {
                System.out.println(notas100 + " nota(s) de 100 reais");
            }
            if (notas50 > 0) {
                System.out.println(notas50 + " nota(s) de 50 reais");
            }
            if (notas10 > 0) {
                System.out.println(notas10 + " nota(s) de 10 reais");
            }
            if (notas5 > 0) {
                System.out.println(notas5 + " nota(s) de 5 reais");
            }
            if (notas1 > 0) {
                System.out.println(notas1 + " nota(s) de 1 real");
            }

            // Pergunta se deseja realizar outro saque
            System.out.print("Deseja realizar outro saque? (Digite 'sim' para continuar ou 'não' para sair): ");
        } while (scanner.next().equalsIgnoreCase("sim"));

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
