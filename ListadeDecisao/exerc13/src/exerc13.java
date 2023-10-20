import java.util.Scanner;

public class exerc13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Loop para pedir a entrada até que seja válida
        do {
            // Solicita ao usuário para inserir um número
            System.out.print("Digite um número de 1 a 7 para representar o dia da semana: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                System.out.print("Digite um número de 1 a 7 para representar o dia da semana: ");
                scanner.next(); // Limpa o buffer do scanner
            }
            numero = scanner.nextInt();

            // Verifica o número e imprime o dia correspondente
            switch (numero) {
                case 1:
                    System.out.println("1-Domingo");
                    break;
                case 2:
                    System.out.println("2-Segunda");
                    break;
                case 3:
                    System.out.println("3-Terça");
                    break;
                case 4:
                    System.out.println("4-Quarta");
                    break;
                case 5:
                    System.out.println("5-Quinta");
                    break;
                case 6:
                    System.out.println("6-Sexta");
                    break;
                case 7:
                    System.out.println("7-Sábado");
                    break;
                default:
                    System.out.println("Valor Inválido! Por favor, insira um número de 1 a 7.");
                    break;
            }
        } while (numero < 1 || numero > 7);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
