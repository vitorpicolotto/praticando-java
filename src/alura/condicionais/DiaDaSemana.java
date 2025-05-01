package alura.condicionais;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana que você quer saber: ");

        String diaDaSemana = scanner.nextLine().toLowerCase();
        scanner.close();

        if (diaDaSemana.equals("segunda") || diaDaSemana.equals("terça") || diaDaSemana.equals("quarta")
        || diaDaSemana.equals("quinta") || diaDaSemana.equals("sexta")){
            System.out.println(diaDaSemana + " é um dia útil, você precisa trabalhar!");
        } else {
            System.out.println(diaDaSemana + " é fim de semana!");
        }
    }
}
