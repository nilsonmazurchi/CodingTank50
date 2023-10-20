import java.util.Scanner;

public class exerc24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "1";

        while (!continuar.equals("0")) {
            // Solicita ao usuário para inserir dois números
            double numero1 = obterNumero(scanner, "Digite o primeiro número: ");
            double numero2 = obterNumero(scanner, "Digite o segundo número: ");

            // Solicita ao usuário para escolher uma operação
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Opção: ");
            int opcao = obterOpcao(scanner);

            double resultado = 0;

            // Executa a operação escolhida e exibe o resultado
            switch (opcao) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("Resultado da adição: " + resultado);
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            // Pergunta se deseja inserir outro número
            System.out.print("Pressione Enter para inserir outro número ou digite '0' para sair...");
            continuar = scanner.nextLine();
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }

    // Função para obter um número válido do usuário
    private static double obterNumero(Scanner scanner, String mensagem) {
        double numero = 0;
        boolean numeroValido = false;
        while (!numeroValido) {
            System.out.print(mensagem);
            if (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                numeroValido = true;
            } else {
                System.out.println("Por favor, insira um número válido.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }
        scanner.nextLine(); // Limpa a nova linha do buffer do scanner
        return numero;
    }

    // Função para obter uma opção válida do usuário
    private static int obterOpcao(Scanner scanner) {
        int opcao = 0;
        boolean opcaoValida = false;
        while (!opcaoValida) {
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                if (opcao >= 1 && opcao <= 4) {
                    opcaoValida = true;
                } else {
                    System.out.println("Por favor, escolha uma opção válida (1 a 4).");
                }
            } else {
                System.out.println("Por favor, escolha uma opção válida (1 a 4).");
                scanner.next(); // Limpa o buffer do scanner
            }
        }
        scanner.nextLine(); // Limpa a nova linha do buffer do scanner
        return opcao;
    }
}
