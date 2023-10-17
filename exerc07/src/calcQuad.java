import java.util.Scanner;

public class calcQuad {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        double lado = 0;
        boolean inputValido = false;

        // Loop para garantir que o usuário insira números válidos
        while (!inputValido) {
            // Pede ao usuário para digitar o lado do quadrado
            System.out.print("Por favor, digite o lado do quadrado: ");

            // Verifica se a entrada é um número
            if (scanner.hasNextDouble()) {
                lado = scanner.nextDouble();
                inputValido = true;
            } else {
                System.out.println("Por favor, insira apenas números.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        // Calcula a área do quadrado
        double area = lado * lado;

        // Calcula o dobro da área
        double dobroDaArea = 2 * area;

        // Mostra o resultado do dobro da área para o usuário
        System.out.println("O dobro da área do quadrado é: " + dobroDaArea);

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
