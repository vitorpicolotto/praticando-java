package alura.lacos;

import java.util.Scanner;

public class TentativaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaDeAcesso = "senha123";

        int tentativas = 3;

        while (tentativas > 0){
            System.out.println("Digite sua senha:");
            String senhaDigitada = scanner.nextLine();

            if (senhaDigitada.equals(senhaDeAcesso)){
                System.out.println("Acesso concedido.");
                break;
            } else {
                tentativas--;
                if (tentativas > 0){
                    System.out.println("Senha incorreta. Você possuí mais " + tentativas + " tentativas.");
                } else {
                    System.out.println("Acesso bloqueado!!");
                }
            }

        }

        scanner.close();
    }
}
