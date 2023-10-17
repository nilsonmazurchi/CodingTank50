import java.util.Scanner;

public class exerc15 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        double peso = 0;
        boolean inputValido = false;

        // Loop para garantir que o usuário insira números válidos para o peso
        while (!inputValido) {
            System.out.print("Por favor, digite o peso dos peixes em quilos: ");
            if (scanner.hasNextDouble()) {
                peso = scanner.nextDouble();
                inputValido = true;
            } else {
                System.out.println("Por favor, insira apenas números.");
                scanner.next(); // Limpa o buffer do Scanner em caso de entrada inválida
            }
        }

        // Verifica se o peso excede o limite (50 quilos)
        double limite = 50;
        if (peso > limite) {
            // Calcula o excesso de peso e o valor da multa
            double excesso = peso - limite;
            double multa = excesso * 4.00;

            // Mostra os resultados
            System.out.println("Peso excedente: " + excesso + " kg");
            System.out.println("Valor da multa a ser pago: R$ " + multa);
        } else {
            // Caso o peso não exceda o limite, não há multa
            System.out.println("Peso dentro do limite, sem multa a ser paga.");
        }

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}

