import java.util.Scanner;

public class exerc14 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variável para armazenar a altura
        double altura = 0;
        boolean inputValido = false;

        // Loop para garantir que o usuário insira números válidos para a altura
        while (!inputValido) {
            System.out.print("Por favor, digite sua altura em metros: ");

            // Verifica se a entrada é um número
            if (scanner.hasNextDouble()) {
                altura = scanner.nextDouble();
                inputValido = true;
            } else {
                System.out.println("Por favor, insira apenas números.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        // Pede ao usuário para inserir o sexo (M para homem, F para mulher)
        System.out.print("Por favor, digite seu sexo (M para homem, F para mulher): ");

        // Lê o sexo fornecido pelo usuário
        char sexo = scanner.next().charAt(0);

        // Calcula o peso ideal baseado no sexo usando as fórmulas fornecidas
        double pesoIdeal;
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Por favor, use M para homem ou F para mulher.");
            // Fecha o Scanner e encerra o programa
            scanner.close();
            return;
        }

        // Mostra o peso ideal para o usuário
        System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
