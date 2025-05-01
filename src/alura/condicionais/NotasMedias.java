package alura.condicionais;

import java.util.Scanner;

public class NotasMedias {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = nota.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = nota.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        double nota3 = nota.nextDouble();
        nota.close();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7){
            System.out.println("O aluno está aprovado com média = " + media);
        } else if (media >= 5){
            System.out.println("O aluno está em recuperação com média = " + media);
        } else {
            System.out.println("O aluno está reprovado com média = " + media);
        }
    }
}
