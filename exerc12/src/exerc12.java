import java.util.Scanner;

public class exerc12 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        double altura = 0;
        boolean inputValido = false;

        // Loop para garantir que o usuário insira números válidos para a altura
        while (!inputValido) {
            System.out.print("Por favor, digite sua altura em metros: ");
            if (scanner.hasNextDouble()) {
                altura = scanner.nextDouble();
                inputValido = true;
            } else {
                System.out.println("Por favor, insira apenas números.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        // Calcula o peso ideal usando a fórmula fornecida
        double pesoIdeal = (72.7 * altura) - 58;

        // Mostra o peso ideal para o usuário
        System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
