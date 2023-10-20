import java.util.Scanner;

public class exerc15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lado1, lado2, lado3;

        // Loop para garantir que os lados sejam números positivos
        do {
            System.out.print("Digite o lado 1 do triângulo: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, insira um número válido.");
                System.out.print("Digite o lado 1 do triângulo: ");
                scanner.next(); // Limpa o buffer do scanner
            }
            lado1 = scanner.nextDouble();
        } while (lado1 <= 0);

        do {
            System.out.print("Digite o lado 2 do triângulo: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, insira um número válido.");
                System.out.print("Digite o lado 2 do triângulo: ");
                scanner.next();
            }
            lado2 = scanner.nextDouble();
        } while (lado2 <= 0);

        do {
            System.out.print("Digite o lado 3 do triângulo: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, insira um número válido.");
                System.out.print("Digite o lado 3 do triângulo: ");
                scanner.next();
            }
            lado3 = scanner.nextDouble();
        } while (lado3 <= 0);

        // Verifica se os lados formam um triângulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            // Determina o tipo de triângulo
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Os lados formam um Triângulo Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Os lados formam um Triângulo Isósceles.");
            } else {
                System.out.println("Os lados formam um Triângulo Escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
