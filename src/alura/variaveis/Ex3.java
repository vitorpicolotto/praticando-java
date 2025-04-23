package alura.variaveis;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = nota.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = nota.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = nota.nextDouble();


        double mediaFinal = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua média é igual a: " + mediaFinal);

        if (mediaFinal > 8) {
            System.out.println("Um ótimo desempenho! Parabéns!");
        } else if (mediaFinal < 8 && mediaFinal > 6){
            System.out.println("Você foi bem e está aprovado!");
        } else {
            System.out.println("Você está reprovado! Sinto muito.");
        }

        nota.close();
    }

}
