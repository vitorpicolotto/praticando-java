package alura.stringRegex;

import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if (senha.matches(regex)){
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso negado! Senha inválida!!");
        }

        scanner.close();
    }
}
