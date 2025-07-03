package alura.stringRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodigoReferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código de referência: ");
        String codigo = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(codigo);

        if (matcher.matches()){
            System.out.println("Código válido");
        } else {
            System.out.println("Código NÃO é válido");
        }

        scanner.close();
    }
}
