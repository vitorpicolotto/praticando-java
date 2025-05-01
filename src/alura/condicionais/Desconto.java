package alura.condicionais;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da compra");

        double valorCompra = scanner.nextDouble();

        double desconto = valorCompra*0.1;
        double valorFinal = valorCompra - desconto;

        if (valorCompra >= 100){
            System.out.println("Desconto aplicado! O novo valor da compra é " + valorFinal);
        } else {
            System.out.println("Desconto não é válido para essa compra. O total é: " + valorCompra);
        }

        scanner.close();
    }
}
