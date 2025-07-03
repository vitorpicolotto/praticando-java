package alura.stringRegex;

import java.util.Scanner;

public class MaiusculoMinusculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qualquer coisa: ");
        String texto = scanner.nextLine();

        String textoMinusculo = texto.toLowerCase();
        System.out.println("Texto minusculo: " + textoMinusculo);
        String textoMaiusculo = texto.toUpperCase();
        System.out.println("Texto maiúsculo: " + textoMaiusculo);

        scanner.close();
    }
}
