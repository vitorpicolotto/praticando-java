package alura.variaveis;

public class Ex8 {
    public static void main(String[] args) {
        double real = 4550.75;
        double taxaCambio = 5.25;

        double dolar = real / taxaCambio;

        System.out.println("O valor de R$" + real + " é igual a $" + String.format("%.2f", dolar));

    }
}
