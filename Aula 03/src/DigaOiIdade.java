import java.util.Scanner;
import java.time.Year;

public class DigaOiIdade {
    public static void main(String[] args) {
        // Cria um Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário que informe seu nome
        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        // Pede ao usuário que informe seu ano de nascimento
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Obtém o ano atual
        int anoAtual = Year.now().getValue();

        // Calcula a idade que a pessoa terá ao final de 2023
        int idade = anoAtual - anoNascimento;

        // Imprime a mensagem de boa noite com o nome do usuário e sua idade ao final de 2023
        System.out.println("Boa noite, " + nome + "! Em 2023, você terá " + idade + " anos.");

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
