import java.util.Scanner;

public class exerc04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;
        char continuar;

        // Loop continua até que o usuário digite '0' para sair
        while (true) {
            // Solicita ao usuário para inserir uma letra
            System.out.print("Digite uma letra ou '0' para sair: ");
            continuar = scanner.next().charAt(0);

            // Verifica se o usuário deseja sair
            if (continuar == '0') {
                break;
            }

            // Verifica se a entrada é uma letra
            if ((continuar >= 'a' && continuar <= 'z') || (continuar >= 'A' && continuar <= 'Z')) {
                letra = continuar;
                // Verifica se a letra é vogal ou consoante e imprime o resultado
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                        letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                    System.out.println("A letra é uma vogal.");
                } else {
                    System.out.println("A letra é uma consoante.");
                }
            } else {
                System.out.println("Caractere inválido. Por favor, digite uma letra válida.");
            }
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
