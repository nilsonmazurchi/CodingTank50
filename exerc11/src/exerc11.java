import java.util.Scanner;

public class exerc11 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar os números
        int numeroInteiro1 = 0;
        int numeroInteiro2 = 0;
        double numeroReal = 0;

        // Loop para o primeiro número inteiro
        while (true) {
            System.out.print("Por favor, digite o primeiro número inteiro: ");
            if (scanner.hasNextInt()) {
                numeroInteiro1 = scanner.nextInt();
                break;
            } else {
                System.out.println("Por favor, insira apenas números inteiros.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        // Loop para o segundo número inteiro
        while (true) {
            System.out.print("Por favor, digite o segundo número inteiro: ");
            if (scanner.hasNextInt()) {
                numeroInteiro2 = scanner.nextInt();
                break;
            } else {
                System.out.println("Por favor, insira apenas números inteiros.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        // Loop para o número real
        while (true) {
            System.out.print("Por favor, digite um número real: ");
            if (scanner.hasNextDouble()) {
                numeroReal = scanner.nextDouble();
                break;
            } else {
                System.out.println("Por favor, insira apenas números.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        // Calcula e mostra o produto do dobro do primeiro com metade do segundo
        double resultado1 = 2 * numeroInteiro1 * (numeroInteiro2 / 2.0);
        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resultado1);

        // Calcula e mostra a soma do triplo do primeiro com o terceiro
        double resultado2 = 3 * numeroInteiro1 + numeroReal;
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultado2);

        // Calcula e mostra o terceiro elevado ao cubo
        double resultado3 = Math.pow(numeroReal, 3);
        System.out.println("O terceiro número elevado ao cubo é: " + resultado3);

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
