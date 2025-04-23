package alura.variaveis;
//conversão de tipos

public class Ex2 {
    public static void main(String[] args) {
        double valorReal = 19.5;
        int valorInteiro = (int) valorReal;
        System.out.println("O valor inteiro do produto é: " + valorInteiro);

        int alturaEmCm = 183;
        double alturaEmMetro = (double) (alturaEmCm) / 100;
        System.out.println("Minha altura em metro é: " + alturaEmMetro);
    }
}
