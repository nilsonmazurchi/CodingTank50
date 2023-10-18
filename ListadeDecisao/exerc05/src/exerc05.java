import java.util.Scanner;

public class exerc05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, media;

        // Solicita ao usuário para inserir a primeira nota
        System.out.print("Digite a primeira nota: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido.");
            System.out.print("Digite a primeira nota: ");
            scanner.next(); // Limpa o buffer do scanner
        }
        nota1 = scanner.nextDouble();

        // Solicita ao usuário para inserir a segunda nota
        System.out.print("Digite a segunda nota: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido.");
            System.out.print("Digite a segunda nota: ");
            scanner.next(); // Limpa o buffer do scanner
        }
        nota2 = scanner.nextDouble();

        // Calcula a média das notas
        media = (nota1 + nota2) / 2;

        // Verifica a situação do aluno e imprime a mensagem correspondente
        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
