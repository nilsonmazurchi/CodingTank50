import java.util.Scanner;

public class calcCirc {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        double raio = 0;
        boolean inputValido = false;

        // Loop para garantir que o usuário insira números válidos
        while (!inputValido) {
            // Pede ao usuário para digitar o raio do círculo
            System.out.print("Por favor, digite o raio do círculo: ");

            // Verifica se a entrada é um número
            if (scanner.hasNextDouble()) {
                raio = scanner.nextDouble();
                inputValido = true;
            } else {
                System.out.println("Por favor, insira apenas números.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        // Calcula a área do círculo
        double area = Math.PI * Math.pow(raio, 2);

        // Mostra o resultado da área do círculo
        System.out.println("A área do círculo é: " + area);

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
