package alura.lacos;

public class SomaDeNumeros {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        System.out.println("O valor total da compra é R$" + soma);


        System.out.println("\n usando forEach");

        int[] valores2 = {50, 75, 25, 50};
        int soma2 = 0;

        for (int valor2 : valores2){
            soma2 += valor2;
        }

        System.out.println("O valor total da compra é R$" + soma2);

    }
}
