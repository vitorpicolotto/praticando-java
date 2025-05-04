package alura.lacos;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerosPositivos = 0;
        int numerosNegativos = 0;
        String entrada;

        do{
            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            entrada = scanner.nextLine();

            if(!entrada.equals("fim")){
                int numeroDigitado = Integer.parseInt(entrada);

                if (numeroDigitado > 0){
                    numerosPositivos++;
                } else {
                    numerosNegativos++;
                }
            }


        } while(!entrada.equals("fim"));

        System.out.println("Numeros positivos: " + numerosPositivos);
        System.out.println("Numeros negativos: " + numerosNegativos);

        scanner.close();
    }
}
