import java.util.Scanner;

public class calculoIMC {
    public static void main(String[] args) {
        // Cria um Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário que informe sua altura em metros
        System.out.print("Por favor, digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Pede ao usuário que informe seu peso em quilogramas
        System.out.print("Agora, por favor, digite seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        // Calcula o Índice de Massa Corporal (IMC)
        double imc = peso / (altura * altura);

        // Imprime o IMC
        System.out.println("Seu Índice de Massa Corporal (IMC) é: " + imc);
        System.out.printf("Seu IMC é %.2f", imc);

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
