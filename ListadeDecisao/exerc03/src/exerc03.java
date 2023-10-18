import java.util.Scanner;

public class exerc03 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        char letra;

        // Solicita ao usuário para inserir uma letra (F ou M)
        System.out.print("Digite uma letra (F para feminino, M para masculino): ");

        // Verifica se a entrada é válida (F, f, M ou m)
        while (true) {
            String input = scanner.next();
            if (input.length() == 1 && (input.charAt(0) == 'F' || input.charAt(0) == 'f' || input.charAt(0) == 'M' || input.charAt(0) == 'm')) {
                letra = input.charAt(0);
                break; // Sai do loop se a entrada é válida
            } else {
                System.out.println("Por favor, digite uma letra válida (F ou M).");
                System.out.print("Digite uma letra (F para feminino, M para masculino): ");
            }
        }

        // Verifica se a letra é F ou M e imprime a correspondente descrição do sexo
        if (letra == 'F' || letra == 'f') {
            System.out.println("F - Feminino");
        } else {
            System.out.println("M - Masculino");
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
