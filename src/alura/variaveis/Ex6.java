package alura.variaveis;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner preco = new Scanner (System.in);
        System.out.println("Digite o preço do produto: ");

        double precoProduto = preco.nextDouble();

        if (precoProduto <= 50.00){
            System.out.println("Categoria do produto: Econômico");
        } else if (precoProduto > 50.01 && precoProduto <= 200.00){
            System.out.println("Categoria do produto: Intermediário");
        } else {
            System.out.println("Categoria do produto: Premium");
        }

        preco.close();
    }
}
