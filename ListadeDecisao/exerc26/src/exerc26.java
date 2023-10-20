import java.util.Scanner;
import java.text.DecimalFormat;

public class exerc26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "1";

        DecimalFormat df = new DecimalFormat("#.00"); // Formato para duas casas decimais

        while (!continuar.equals("0")) {
            System.out.print("Digite o número de litros vendidos: ");
            double litros = obterNumero(scanner);

            System.out.print("Digite o tipo de combustível (A para Álcool, G para Gasolina): ");
            char tipo = obterTipoCombustivel(scanner);

            double precoLitroAlcool = 1.90;
            double precoLitroGasolina = 2.50;
            double desconto = 0;

            if (tipo == 'A') {
                desconto = (litros <= 20) ? 0.03 : 0.05;
            } else if (tipo == 'G') {
                desconto = (litros <= 20) ? 0.04 : 0.06;
            }

            double precoTotal = litros * (tipo == 'A' ? precoLitroAlcool : precoLitroGasolina);
            double valorDesconto = precoTotal * desconto;
            double precoFinal = precoTotal - valorDesconto;

            System.out.println("Preço total: R$" + df.format(precoTotal));
            System.out.println("Desconto: R$" + df.format(valorDesconto));
            System.out.println("Preço final a ser pago pelo cliente: R$" + df.format(precoFinal));

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
                if (numero > 0) {
                    numeroValido = true;
                } else {
                    System.out.print("Por favor, insira um número positivo: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Por favor, insira um número válido: ");
            }
        }
        return numero;
    }

    // Função para obter um tipo de combustível válido do usuário
    private static char obterTipoCombustivel(Scanner scanner) {
        char tipo = ' ';
        boolean tipoValido = false;
        while (!tipoValido) {
            String entrada = scanner.nextLine().toUpperCase();
            if (entrada.equals("A") || entrada.equals("G")) {
                tipo = entrada.charAt(0);
                tipoValido = true;
            } else {
                System.out.print("Por favor, insira 'A' para Álcool ou 'G' para Gasolina: ");
            }
        }
        return tipo;
    }
}
