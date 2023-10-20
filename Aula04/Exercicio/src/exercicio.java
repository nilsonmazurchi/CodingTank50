import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir o nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Solicita ao usuário para inserir o horário (no formato hh:mm)
        System.out.print("Digite o horário do dia (no formato hh:mm): ");
        String horario = scanner.next();

        // Extrai apenas as horas da entrada do usuário
        int hora = Integer.parseInt(horario.split(":")[0]);
        System.out.println(hora);
        // Verifica o horário e exibe a saudação apropriada
        if (hora >= 4 && hora <= 11) {
            System.out.println("Bom dia, " + nome + "!");
        } else if (hora >= 12 && hora <= 17) {
            System.out.println("Boa tarde, " + nome + "!");
        } else if ((hora >= 18 && hora <= 23) || (hora >= 0 && hora <= 3)) {
            System.out.println("Boa noite, " + nome + "!");
        } else {
            System.out.println("Horário inválido.");
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
