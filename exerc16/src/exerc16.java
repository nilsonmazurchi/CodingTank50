import java.util.Scanner;

public class exerc16 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para inserir o tamanho da área a ser pintada em metros quadrados
        System.out.print("Por favor, digite o tamanho da área a ser pintada em metros quadrados: ");
        double area = scanner.nextDouble();

        // Calcula a quantidade de litros de tinta necessários
        double litrosTinta = area / 3.0;

        // Calcula a quantidade de latas de tinta necessárias (uma lata tem 18 litros) e arredonda para cima
        int latasTinta = (int) Math.ceil(litrosTinta / 18.0);

        // Mostra os resultados
        System.out.println("Quantidade de latas de tinta necessárias: " + latasTinta);
        System.out.println("Preço total: R$ " + latasTinta * 80);

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}

