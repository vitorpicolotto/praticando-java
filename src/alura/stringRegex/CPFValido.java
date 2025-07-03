package alura.stringRegex;

import java.util.Scanner;

public class CPFValido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu CPF");
        String cpf = scanner.nextLine();

        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        if (cpf.matches(regex)){
            System.out.println("O CPF " + cpf + " é válido");
        } else {
            System.out.println("CPF inválido");
        }

        scanner.close();
    }
}
