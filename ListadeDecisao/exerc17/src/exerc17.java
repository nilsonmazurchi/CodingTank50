import java.util.Scanner;

public class exerc17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ano;

        do {
            // Solicita ao usuário para inserir o ano
            System.out.print("Digite um ano (ou 0 para sair): ");
            ano = scanner.nextInt();

            // Verifica se o ano é bissexto
            if (ano != 0) {
                boolean bissexto = ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0));
                if (bissexto) {
                    System.out.println(ano + " é um ano bissexto.");
                } else {
                    System.out.println(ano + " não é um ano bissexto.");
                }
            }

        } while (ano != 0);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
