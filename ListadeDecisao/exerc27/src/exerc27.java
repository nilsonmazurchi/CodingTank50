import java.util.Scanner;
import java.text.DecimalFormat;

public class exerc27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "1";

        DecimalFormat df = new DecimalFormat("#.00"); // Formato para duas casas decimais

        while (!continuar.equals("0")) {
            double precoTotal = 0;

            // Entrada de dados para morangos
            System.out.print("Digite a quantidade de morangos (em Kg): ");
            double morangos = obterNumero(scanner);

            // Entrada de dados para maçãs
            System.out.print("Digite a quantidade de maçãs (em Kg): ");
            double macas = obterNumero(scanner);

            // Cálculo do preço total dos morangos
            if (morangos <= 5) {
                precoTotal += morangos * 2.50;
            } else {
                precoTotal += morangos * 2.20;
            }

            // Cálculo do preço total das maçãs
            if (macas <= 5) {
                precoTotal += macas * 1.80;
            } else {
                precoTotal += macas * 1.50;
            }

            // Aplicação do desconto se necessário
            if ((morangos + macas) > 8 || precoTotal > 25) {
                precoTotal *= 0.90; // Aplica desconto de 10%
            }

            System.out.println("Valor a ser pago pelo cliente: R$" + df.format(precoTotal));

            // Pergunta se deseja inserir outro número
            System.out.print("Pressione Enter para inserir outro número ou digite '0' para sair...");
            continuar = scanner.nextLine();
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }

    // Função para obter um número válido do usuário
    private static double obterNumero(Scanner scanner) {
        double numero = 0;
        boolean numeroValido = false;
        while (!numeroValido) {
            try {
                numero = Double.parseDouble(scanner.nextLine());
                if (numero >= 0) {
                    numeroValido = true;
                } else {
                    System.out.print("Por favor, insira um número não negativo: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Por favor, insira um número válido: ");
            }
        }
        return numero;
    }
}
