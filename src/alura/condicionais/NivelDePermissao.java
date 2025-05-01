package alura.condicionais;

import java.util.Scanner;

public class NivelDePermissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String codigoCorreto = "vaLid0";
        int nivelMinimo = 1;
        int nivelMaximo = 4;

        System.out.println("Digite o código de acesso:");
        String codigoDigitado = scanner.nextLine();
        System.out.println("Digite seu nível de permissão:");
        int nivelDigitado = scanner.nextInt();

        scanner.close();

        boolean codigoValido = codigoDigitado.equals(codigoCorreto);
        boolean nivelValido = nivelDigitado >= nivelMinimo && nivelDigitado <= nivelMaximo;

        if (codigoValido && nivelValido){
            System.out.println("Você acessou o software.");
        } else {
            System.out.println("Acesso negado!");
            if (!codigoValido && !nivelValido){
                System.out.println("O código digitado está incorreto e você não tem permissão para acessar o software.");
            } else if (!nivelValido) {
                System.out.println("Você não tem o nível de permissão necessário para acessar o software.");
            } else {
                System.out.println("Você errou o código de acesso.");
            }
        }

    }
}
