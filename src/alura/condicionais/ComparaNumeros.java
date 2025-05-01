package alura.condicionais;

import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1;
        int n2;

        while(true){
            System.out.println("Digite o primeiro número:");
            if (scanner.hasNextInt()){
                n1 = scanner.nextInt();
                break;
            } else {
                System.out.println("Por favor, digite um número INTEIRO!");
                scanner.next();
            }
        }

        while (true){
            System.out.println("Digite o segundo número:");
            if (scanner.hasNextInt()){
                n2 = scanner.nextInt();
                break;
            } else {
                System.out.println("Por favor, digite um número INTEIRO!");
                scanner.next();
            }
        }

        if (n1 > n2){
            System.out.println("O número " + n1 + " é maior que " + n2);
        } else if (n2 > n1){
            System.out.println("O número " + n2 + " é maior que " + n1);
        } else {
            System.out.println("Os números são iguais");
        }

        scanner.close();

    }
}
