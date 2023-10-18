import java.text.DecimalFormat;
import java.util.Scanner;

public class exerc11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioAtual, novoSalario, aumento, percentualAumento;

        // Solicita ao usuário para inserir o salário atual
        System.out.print("Digite o salário atual do colaborador: R$ ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido.");
            System.out.print("Digite o salário atual do colaborador: R$ ");
            scanner.next(); // Limpa o buffer do scanner
        }
        salarioAtual = scanner.nextDouble();

        // Calcula o reajuste de acordo com as faixas salariais
        if (salarioAtual <= 280) {
            percentualAumento = 20;
        } else if (salarioAtual <= 700) {
            percentualAumento = 15;
        } else if (salarioAtual <= 1500) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        // Calcula o aumento e o novo salário
        aumento = (percentualAumento / 100) * salarioAtual;
        novoSalario = salarioAtual + aumento;

        // Formata os valores com duas casas decimais
        DecimalFormat formato = new DecimalFormat("#0.00");

        // Imprime as informações formatadas
        System.out.println("Salário antes do reajuste: R$ " + formato.format(salarioAtual));
        System.out.println("Percentual de aumento aplicado: " + formato.format(percentualAumento) + "%");
        System.out.println("Valor do aumento: R$ " + formato.format(aumento));
        System.out.println("Novo salário após o aumento: R$ " + formato.format(novoSalario));

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
