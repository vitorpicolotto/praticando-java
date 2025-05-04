package alura.lacos;

import java.util.Scanner;

public class PulandoNum5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroFinal = scanner.nextInt();

        for (int i = 1; i <= numeroFinal; i++){
            if(i % 10 == 5){
                continue; //ignora os números que terminam em 5. Se termina em 5, o continue é acionado e o loop pula a impressão dele.
            }
            System.out.print(i + " ");
        }

        scanner.close();

    }
}
