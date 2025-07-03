package alura.stringRegex;

import java.util.Scanner;

public class Espacos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        String nomeSemEspaco = nome.trim();
        System.out.println("Nome sem espaços: " + nomeSemEspaco);
        scanner.close();
    }
}
