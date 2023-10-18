import java.util.Scanner;

public class exerc12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor da hora e a quantidade de horas trabalhadas
        System.out.print("Digite o valor da sua hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        // Calcula o salário bruto
        double salarioBruto = valorHora * horasTrabalhadas;

        // Calcula o desconto do Imposto de Renda
        double descontoIR = 0;
        if (salarioBruto > 900 && salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.1;
        } else if (salarioBruto > 2500) {
            descontoIR = salarioBruto * 0.2;
        }

        // Calcula os descontos e o salário líquido
        double sindicato = salarioBruto * 0.03;
        double inss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        double totalDescontos = descontoIR + sindicato + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        // Imprime as informações
        System.out.println("Salário Bruto: (" + valorHora + " * " + horasTrabalhadas + "): R$ " + salarioBruto);
        System.out.println("(-) IR: R$ " + descontoIR);
        System.out.println("(-) INSS (10%): R$ " + inss);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("(-) Sindicato (3%): R$ " + sindicato);
        System.out.println("Total de descontos: R$ " + totalDescontos);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
