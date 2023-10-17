import java.util.Scanner;

public class exerc03 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        boolean numerosValidos = false;

        // Loop para garantir que o usuário insira números válidos
        while (!numerosValidos) {
            // Pede ao usuário para digitar o primeiro número
            System.out.print("Por favor, digite o primeiro número: ");
            // Verifica se a entrada é um número inteiro
            if (scanner.hasNextInt()) {
                numero1 = scanner.nextInt();
                // Pede ao usuário para digitar o segundo número
                System.out.print("Por favor, digite o segundo número: ");
                // Verifica se a entrada é um número inteiro
                if (scanner.hasNextInt()) {
                    numero2 = scanner.nextInt();
                    numerosValidos = true;
                } else {
                    System.out.println("Por favor, insira apenas números.");
                    scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
                }
            } else {
                System.out.println("Por favor, insira apenas números.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        // Calcula a soma dos dois números
        int soma = numero1 + numero2;

        // Mostra o resultado da soma
        System.out.println("A soma dos números é: " + soma);

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
