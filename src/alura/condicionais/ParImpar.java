package alura.condicionais;

import java.util.Random;

public class ParImpar {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é par!");
        } else {
            System.out.println("O número " + numero + " é impar!");
        }
    }

}
