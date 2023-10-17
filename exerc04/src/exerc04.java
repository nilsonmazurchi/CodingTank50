import java.util.Scanner;

public class exerc04 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;

        // Loop para garantir que o usuário insira números válidos
        while (true) {
            System.out.print("Por favor, digite a primeira nota bimestral: ");
            if (scanner.hasNextDouble()) {
                nota1 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Por favor, insira apenas números.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        while (true) {
            System.out.print("Por favor, digite a segunda nota bimestral: ");
            if (scanner.hasNextDouble()) {
                nota2 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Por favor, insira apenas números.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        while (true) {
            System.out.print("Por favor, digite a terceira nota bimestral: ");
            if (scanner.hasNextDouble()) {
                nota3 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Por favor, insira apenas números.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        while (true) {
            System.out.print("Por favor, digite a quarta nota bimestral: ");
            if (scanner.hasNextDouble()) {
                nota4 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Por favor, insira apenas números.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        // Calcula a média das quatro notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Mostra o resultado da média
        System.out.println("A média das notas bimestrais é: " + media);

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
