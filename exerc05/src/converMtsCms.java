import java.util.Scanner;

public class converMtsCms {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        double metros = 0;
        boolean inputValido = false;

        // Loop para garantir que o usuário insira números válidos
        while (!inputValido) {
            // Pede ao usuário para digitar o valor em metros
            System.out.print("Por favor, digite o valor em metros: ");

            // Verifica se a entrada é um número
            if (scanner.hasNextDouble()) {
                metros = scanner.nextDouble();
                inputValido = true;
            } else {
                System.out.println("Por favor, insira apenas números.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        // Converte metros para centímetros
        double centimetros = metros * 100;

        // Mostra o resultado da conversão
        System.out.println(metros + " metros é igual a " + centimetros + " centímetros.");

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
