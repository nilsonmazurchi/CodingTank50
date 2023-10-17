import java.util.Scanner;

public class calcSalario {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        double valorPorHora = 0;
        double horasTrabalhadas = 0;
        boolean inputValido = false;

        // Loop para garantir que o usuário insira números válidos para o valor por hora
        while (!inputValido) {
            System.out.print("Por favor, digite o valor ganho por hora: ");
            if (scanner.hasNextDouble()) {
                valorPorHora = scanner.nextDouble();
                inputValido = true;
            } else {
                System.out.println("Por favor, insira apenas números.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        inputValido = false; // Resetar a flag para a próxima entrada

        // Loop para garantir que o usuário insira números válidos para as horas trabalhadas
        while (!inputValido) {
            System.out.print("Por favor, digite o número de horas trabalhadas no mês: ");
            if (scanner.hasNextDouble()) {
                horasTrabalhadas = scanner.nextDouble();
                inputValido = true;
            } else {
                System.out.println("Por favor, insira apenas números.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        // Calcula o salário total no referido mês
        double salario = valorPorHora * horasTrabalhadas;

        // Mostra o resultado do salário para o usuário
        System.out.println("O total do seu salário no referido mês é: " + salario);

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}

