package alura.condicionais;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor;

        do {
            System.out.println("Digite o valor requerido para empréstimo: ");
            valor = scanner.nextDouble();

            if (valor <= 0){
                System.out.println("Digite um número positivo!");
            }

        } while (valor <= 0 );

        if (valor >= 1000 && valor <= 5000){
            System.out.println("O valor de R$" + valor + " pode ser solicitado ao gerente.");
        } else if (valor > 5000){
            System.out.println("O valor de R$" + valor + " está acima do permitido.");
        } else {
            System.out.println("O valor de R$" + valor + " é muito baixo.");
        }

        scanner.close();
    }
}
