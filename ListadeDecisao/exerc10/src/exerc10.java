import java.util.Scanner;

public class exerc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String turno;

        // Loop para pedir a entrada até que seja válida
        do {
            // Solicita ao usuário para inserir o turno
            System.out.print("Em que turno você estuda? (M-matutino, V-Vespertino ou N-Noturno): ");
            turno = scanner.nextLine().toUpperCase(); // Converte a entrada para maiúsculas

            // Verifica o turno e imprime a saudação correspondente
            switch (turno) {
                case "M":
                    System.out.println("Bom Dia!");
                    break;
                case "V":
                    System.out.println("Boa Tarde!");
                    break;
                case "N":
                    System.out.println("Boa Noite!");
                    break;
                default:
                    System.out.println("Valor Inválido! Por favor, insira M, V ou N.");
                    break;
            }
        } while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N"));

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
