import java.util.Scanner;

public class exerc19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número inteiro menor que 1000
        int numero;
        do {
            System.out.print("Digite um número inteiro menor que 1000: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                System.out.print("Digite um número inteiro menor que 1000: ");
                scanner.next(); // Limpa o buffer do scanner
            }
            numero = scanner.nextInt();
        } while (numero >= 1000 || numero < 0);

        // Separa o número em centenas, dezenas e unidades
        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;

        // Constrói a mensagem de saída
        String mensagem = "";
        if (centenas > 0) {
            mensagem += centenas + " centena";
            if (centenas > 1) {
                mensagem += "s";
            }
        }
        if (dezenas > 0) {
            if (!mensagem.isEmpty()) {
                mensagem += ", ";
            }
            mensagem += dezenas + " dezena";
            if (dezenas > 1) {
                mensagem += "s";
            }
        }
        if (unidades > 0 || numero == 0) {
            if (!mensagem.isEmpty()) {
                mensagem += " e ";
            }
            mensagem += unidades + " unidade";
            if (unidades > 1) {
                mensagem += "s";
            }
        }

        // Exibe a mensagem de saída
        System.out.println(mensagem);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
