package alura.stringRegex;

import java.util.Scanner;

public class ArredondarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = scanner.nextDouble();

        String valorArredondado = String.format("R$ %.2f", valor);
        System.out.println("Valor arredondado é: " + valorArredondado);

        scanner.close();
    }
}
