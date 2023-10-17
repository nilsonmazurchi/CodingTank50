import java.util.Scanner;

public class DigaOi {
    public static void main(String[] args) {
        // Cria um Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário que informe seu nome
        System.out.print("Por favor, digite seu nome: ");

        // Lê o nome do usuário
        String nome = scanner.nextLine();

        // Imprime a mensagem de boa noite com o nome do usuário
        System.out.println("Boa noite, " + nome + "!");

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}

