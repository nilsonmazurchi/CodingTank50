import java.util.Scanner;

public class converTemp {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para escolher a opção de conversão
        System.out.println("Escolha a opção de conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int opcao = scanner.nextInt();

        // Variáv1el para armazenar a temperatura
        double temperatura;

        // Loop para garantir que o usuário insira números válidos
        while (true) {
            System.out.print("Por favor, digite a temperatura: ");
            if (scanner.hasNextDouble()) {
                temperatura = scanner.nextDouble();
                break;
            } else {
                System.out.println("Por favor, insira apenas números.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        // Variável para armazenar o resultado da conversão
        double resultado = 0;

        if (opcao == 1) {
            // Converte de Celsius para Fahrenheit
            resultado = (temperatura * 9 / 5) + 32;
            System.out.println("A temperatura em Fahrenheit é: " + resultado);
        } else if (opcao == 2) {
            // Converte de Fahrenheit para Celsius
            resultado = 5 * ((temperatura - 32) / 9);
            System.out.println("A temperatura em Celsius é: " + resultado);
        } else {
            System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
