import java.util.Scanner;

public class exerc18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir a data
        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String data = scanner.nextLine();

        // Divide a string em partes (dia, mês e ano)
        String[] partes = data.split("/");
        int dia, mes, ano;

        // Verifica se foram inseridas três partes
        if (partes.length == 3) {
            try {
                // Converte as partes para inteiros
                dia = Integer.parseInt(partes[0]);
                mes = Integer.parseInt(partes[1]);
                ano = Integer.parseInt(partes[2]);

                // Verifica se a data é válida
                boolean dataValida = (ano >= 0 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasNoMes(mes, ano));

                if (dataValida) {
                    System.out.println("Data válida.");
                } else {
                    System.out.println("Data inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Formato inválido. Por favor, insira uma data válida.");
            }
        } else {
            System.out.println("Formato inválido. Por favor, insira uma data no formato dd/mm/aaaa.");
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }

    // Função para verificar o número de dias em um determinado mês
    public static int diasNoMes(int mes, int ano) {
        if (mes == 2) {
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                return 29; // Fevereiro em ano bissexto
            } else {
                return 28; // Fevereiro em ano não bissexto
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30; // Abril, Junho, Setembro, Novembro
        } else {
            return 31; // Janeiro, Março, Maio, Julho, Agosto, Outubro, Dezembro
        }
    }
}

