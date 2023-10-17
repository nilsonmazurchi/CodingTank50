import java.util.Scanner;

public class exerc17 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para inserir o tamanho da área a ser pintada em metros quadrados
        System.out.print("Por favor, digite o tamanho da área a ser pintada em metros quadrados: ");
        double area = scanner.nextDouble();

        // Calcula a quantidade de litros de tinta necessários com 10% de folga
        double litrosTinta = area / 6.0 * 1.1;

        // Calcula a quantidade de latas de 18 litros necessárias
        int latas18L = (int) Math.ceil(litrosTinta / 18.0);

        // Calcula a quantidade de galões de 3,6 litros necessários
        int galoes3_6L = (int) Math.ceil(litrosTinta / 3.6);

        // Calcula a quantidade mínima de latas e galões considerando o desperdício mínimo
        int latasMinimas = (int) Math.floor(litrosTinta / 18.0);
        int galoesMinimos = (int) Math.ceil((litrosTinta - latasMinimas * 18) / 3.6);

        // Calcula os preços para cada situação
        double precoLatas18L = latas18L * 80.0;
        double precoGaloes3_6L = galoes3_6L * 25.0;
        double precoMinimo = latasMinimas * 80.0 + galoesMinimos * 25.0;

        // Mostra os resultados
        System.out.println("Situação 1: Comprar apenas latas de 18 litros");
        System.out.println("Quantidade de latas: " + latas18L);
        System.out.println("Preço total: R$ " + precoLatas18L);

        System.out.println("\nSituação 2: Comprar apenas galões de 3,6 litros");
        System.out.println("Quantidade de galões: " + galoes3_6L);
        System.out.println("Preço total: R$ " + precoGaloes3_6L);

        System.out.println("\nSituação 3: Misturar latas e galões (mínimo de desperdício)");
        System.out.println("Quantidade de latas: " + latasMinimas);
        System.out.println("Quantidade de galões: " + galoesMinimos);
        System.out.println("Preço total: R$ " + precoMinimo);

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
