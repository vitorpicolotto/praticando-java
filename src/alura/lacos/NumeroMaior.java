package alura.lacos;

import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números separados por espaços: ");

        String[] numeros = scanner.nextLine().split(" "); //salvando o numero em uma lista e separando por espaços
        System.out.println(numeros);
        int numeroMaior = Integer.MIN_VALUE; //esse valor representa o MENOR VALOR POSSIVEL PARA UM TIPO INT EM JAVA

        for (String numeroLista : numeros){
            int numero = Integer.parseInt(numeroLista); //converter a String de "numeros" em numeros verdadeiros.
            if(numero > numeroMaior){
                numeroMaior = numero;
            }
        }

        System.out.println("O maior número é: " + numeroMaior);
        scanner.close();

    }
}
