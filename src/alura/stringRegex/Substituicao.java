package alura.stringRegex;

import java.util.Scanner;

public class Substituicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto: ");
            String texto = scanner.nextLine();
        System.out.println("Digite a palavra que quer substituir: ");
            String palavraParaSubstituir = scanner.nextLine();

        if (!texto.contains(palavraParaSubstituir)){
            System.out.println("Palavra não existe!");
            scanner.close();
            return;
        }

        System.out.println("Digite a nova palavra: ");
            String palavraSubstituta = scanner.nextLine();

        String novoTexto =  texto.replace(palavraParaSubstituir, palavraSubstituta);
        System.out.println("Texto modificado: " + novoTexto);

        scanner.close();
    }
}
