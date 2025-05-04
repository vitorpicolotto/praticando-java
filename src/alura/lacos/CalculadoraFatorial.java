package alura.lacos;

import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroDigitado = scanner.nextInt();

        int multiplicacao = 1;

        for (int i = 1; i <= numeroDigitado; i++) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println("O resultado do número " + numeroDigitado + " em fatorial é: " + multiplicacao);



    }
}
