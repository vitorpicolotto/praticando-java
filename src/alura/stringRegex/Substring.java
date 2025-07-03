package alura.stringRegex;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();
        System.out.println("Digite a palavra: ");
        String palavra = scanner.nextLine();

        if(texto.contains(palavra)){
            System.out.println("A palavra '" + palavra + "' está no texto");
        } else {
            System.out.println("A palavra '" + palavra + "' NÃO está no texto");
        }

        scanner.close();
    }
}
