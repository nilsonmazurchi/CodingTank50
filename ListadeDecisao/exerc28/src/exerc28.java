import java.util.Scanner;
import java.text.DecimalFormat;

public class exerc28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "1";

        DecimalFormat df = new DecimalFormat("#.00"); // Formato para duas casas decimais

        while (!continuar.equals("0")) {
            double precoTotal = 0;

            // Entrada de dados para o tipo de carne
            System.out.println("Escolha o tipo de carne:");
            System.out.println("1 - File Duplo");
            System.out.println("2 - Alcatra");
            System.out.println("3 - Picanha");
            int tipoCarne = obterOpcao(scanner, 1, 3) - 1;

            // Entrada de dados para a quantidade de carne
            System.out.print("Digite a quantidade de carne (em Kg): ");
            double quantidade = obterNumero(scanner);

            double[] precos = { 4.90, 5.90, 6.90 }; // Preços por Kg
            double precoPorKg = precos[tipoCarne];

            // Cálculo do preço total
            if (quantidade <= 5) {
                precoTotal = quantidade * precoPorKg;
            } else {
                precoTotal = quantidade * (precoPorKg + 1.90); // Preço por Kg acima de 5 Kg
            }

            // Aplicação do desconto para pagamento com cartão Tabajara
            System.out.print("Pagamento com cartão Tabajara? (S para Sim, N para Não): ");
            String opcao = scanner.nextLine().toUpperCase();
            if (opcao.equals("S")) {
                double desconto = precoTotal * 0.05;
                precoTotal -= desconto;
                System.out.println("Desconto de 5% aplicado: R$" + df.format(desconto));
            }

            // Exibição do cupom fiscal
            String[] tiposCarne = { "File Duplo", "Alcatra", "Picanha" };
            System.out.println("Cupom Fiscal");
            System.out.println("Tipo de Carne: " + tiposCarne[tipoCarne]);
            System.out.println("Quantidade: " + quantidade + " Kg");
            System.out.println("Preço Total: R$" + df.format(precoTotal));

            // Pergunta se deseja inserir outro número
            System.out.print("Pressione Enter para inserir outro número ou digite '0' para sair...");
            continuar = scanner.nextLine();
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }

    // Função para obter uma opção válida do usuário dentro de um intervalo
    private static int obterOpcao(Scanner scanner, int min, int max) {
        int opcao = 0;
        boolean opcaoValida = false;
        while (!opcaoValida) {
            try {
                opcao = Integer.parseInt(scanner.nextLine());
                if (opcao >= min && opcao <= max) {
                    opcaoValida = true;
                } else {
                    System.out.print("Por favor, escolha uma opção válida: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Por favor, escolha uma opção válida: ");
            }
        }
        return opcao;
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

