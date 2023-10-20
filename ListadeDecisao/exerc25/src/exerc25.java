import java.util.Scanner;

public class exerc25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda às perguntas com 'sim' ou 'nao'.");
        System.out.print("Telefonou para a vítima? ");
        String resposta1 = obterResposta(scanner);

        System.out.print("Esteve no local do crime? ");
        String resposta2 = obterResposta(scanner);

        System.out.print("Mora perto da vítima? ");
        String resposta3 = obterResposta(scanner);

        System.out.print("Devia para a vítima? ");
        String resposta4 = obterResposta(scanner);

        System.out.print("Já trabalhou com a vítima? ");
        String resposta5 = obterResposta(scanner);

        int count = contarRespostasPositivas(resposta1, resposta2, resposta3, resposta4, resposta5);

        // Emite a classificação baseada nas respostas
        if (count == 2) {
            System.out.println("Você é Suspeito.");
        } else if (count >= 3 && count <= 4) {
            System.out.println("Você é Cúmplice.");
        } else if (count == 5) {
            System.out.println("Você é o Assassino.");
        } else {
            System.out.println("Você é Inocente.");
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }

    // Função para obter uma resposta válida do usuário
    private static String obterResposta(Scanner scanner) {
        String resposta = "";
        boolean respostaValida = false;
        while (!respostaValida) {
            resposta = scanner.next().toLowerCase();
            if (resposta.equals("sim") || resposta.equals("nao")) {
                respostaValida = true;
            } else {
                System.out.print("Por favor, responda com 'sim' ou 'nao': ");
            }
        }
        return resposta;
    }

    // Função para contar o número de respostas positivas
    private static int contarRespostasPositivas(String... respostas) {
        int count = 0;
        for (String resposta : respostas) {
            if (resposta.equals("sim")) {
                count++;
            }
        }
        return count;
    }
}
