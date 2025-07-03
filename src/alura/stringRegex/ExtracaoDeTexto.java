package alura.stringRegex;

import java.util.Scanner;

public class ExtracaoDeTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();

        int posicaoPonto = nomeArquivo.lastIndexOf(".");
        if (posicaoPonto != -1){
            String nomeArquivoSemExtensao = nomeArquivo.substring(0, posicaoPonto);
            System.out.println("Nome do arquivo sem extensão: " + nomeArquivoSemExtensao);
        } else {
            System.out.println("O arquivo não possui extensão");
        }

        scanner.close();
    }
}
