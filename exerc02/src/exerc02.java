import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean numeroValido = false;

        // Loop para garantir que o usuário insira um número válido
        while (!numeroValido) {
            // Pede ao usuário para digitar um número
            System.out.print("Por favor, digite um número: ");

            // Verifica se a entrada é um número inteiro
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                numeroValido = true;
            } else {
                // Limpa o buffer do Scanner em caso de entrada inválida
                scanner.next();
                System.out.println("Por favor, insira apenas números.");
            }
        }

        // Mostra a mensagem com o número informado
        System.out.println("O número informado foi " + numero);

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
