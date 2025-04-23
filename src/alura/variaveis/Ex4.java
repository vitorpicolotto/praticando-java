package alura.variaveis;

import java.util.Scanner;
//conversor de temperatura

public class Ex4 {
    public static void main(String[] args) {
        Scanner temperatura = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celcius");
        int temperaturaCelcius = temperatura.nextInt();

        double temperaturaFahrenheit = (double) (temperaturaCelcius) * 9 / 5 + 32;
        System.out.println("A temperatura convertida de Celcius para Fahrenheit é " + temperaturaFahrenheit);
    }
}
