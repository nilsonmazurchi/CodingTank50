import java.util.Scanner;

public class exerc20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir três notas parciais
        double nota1, nota2, nota3;
        do {
            System.out.print("Digite a primeira nota parcial: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, insira um número válido.");
                System.out.print("Digite a primeira nota parcial: ");
                scanner.next(); // Limpa o buffer do scanner
            }
            nota1 = scanner.nextDouble();
        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.print("Digite a segunda nota parcial: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, insira um número válido.");
                System.out.print("Digite a segunda nota parcial: ");
                scanner.next();
            }
            nota2 = scanner.nextDouble();
        } while (nota2 < 0 || nota2 > 10);

        do {
            System.out.print("Digite a terceira nota parcial: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, insira um número válido.");
                System.out.print("Digite a terceira nota parcial: ");
                scanner.next();
            }
            nota3 = scanner.nextDouble();
        } while (nota3 < 0 || nota3 > 10);

        // Calcula a média das notas com 2 casas decimais
        double media = (nota1 + nota2 + nota3) / 3.0;
        media = Math.round(media * 100.0) / 100.0; // Arredonda para 2 casas decimais

        // Verifica a situação do aluno e exibe a mensagem correspondente
        if (media == 10) {
            System.out.println("Aprovado com Distinção. Média: " + String.format("%.2f", media));
        } else if (media >= 7) {
            System.out.println("Aprovado. Média: " + String.format("%.2f", media));
        } else {
            System.out.println("Reprovado. Média: " + String.format("%.2f", media));
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
