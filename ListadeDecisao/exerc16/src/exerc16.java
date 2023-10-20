import java.util.Scanner;

public class exerc16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir o valor de 'a'
        double a;
        do {
            System.out.print("Digite o valor de 'a' (deve ser diferente de 0): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, insira um número válido.");
                System.out.print("Digite o valor de 'a' (deve ser diferente de 0): ");
                scanner.next();
            }
            a = scanner.nextDouble();
        } while (a == 0);

        // Solicita ao usuário para inserir os valores de 'b' e 'c'
        System.out.print("Digite o valor de 'b': ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de 'c': ");
        double c = scanner.nextDouble();

        // Calcula o delta
        double delta = b * b - 4 * a * c;

        // Verifica as condições e calcula as raízes
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais: Raiz 1 = " + raiz1 + ", Raiz 2 = " + raiz2);
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
