import java.util.Scanner;

public class exerc14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir as notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Calcula a média
        double media = (nota1 + nota2) / 2;

        // Determina o conceito de acordo com a média
        String conceito;
        if (media >= 9.0 && media <= 10.0) {
            conceito = "A";
        } else if (media >= 7.5 && media < 9.0) {
            conceito = "B";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = "D";
        } else if (media >= 0 && media < 4.0) {
            conceito = "E";
        } else {
            conceito = "Média inválida";
        }

        // Imprime as notas, a média, o conceito e a situação (aprovado ou reprovado)
        System.out.println("Notas: " + nota1 + ", " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);

        // Determina e imprime a situação do aluno
        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
