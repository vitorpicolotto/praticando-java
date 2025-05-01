package alura.condicionais;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner senha = new Scanner(System.in);
        System.out.println("Digite sua senha:");
        String senhaDigitada = senha.nextLine();

        String senhaMaster = "minhaSenha55!";

        if (!senhaDigitada.equals(senhaMaster)){
            System.out.println("Acesso negado!");
        } else {
            System.out.println("Acesso garantido!");
        }

        senha.close();

    }
}
