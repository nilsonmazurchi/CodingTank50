import java.util.Scanner;

public class exerc18
{
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para inserir o tamanho do arquivo em MB
        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
        double tamanhoArquivoMB = scanner.nextDouble();

        // Pede ao usuário para inserir a velocidade da Internet em Mbps
        System.out.print("Digite a velocidade da sua conexão com a Internet (em Mbps): ");
        double velocidadeInternetMbps = scanner.nextDouble();

        // Calcula o tempo de download em minutos
        double tempoDownloadMinutos = (tamanhoArquivoMB / (velocidadeInternetMbps * 60));

        // Mostra o tempo de download aproximado ao usuário
        System.out.println("Tempo aproximado de download: " + tempoDownloadMinutos + " minutos");

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
