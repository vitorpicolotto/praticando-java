package alura.lacos;

import java.util.Scanner;

public class ContagemDegraus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de degraus: ");
        int numeroDegraus = scanner.nextInt();

        for (int i = 1; i <= numeroDegraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }

        System.out.println("Você chegou ao topo");

        scanner.close();


        System.out.println("\n Testando com o while");

        int degraus = 1;

        while (degraus <= numeroDegraus){
            System.out.println("Subindo o degrau "+ degraus);
            degraus++;
        }

    }
}
