package alura.condicionais;

import java.util.Scanner;

public class DoadorDeSangue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Digite seu peso (em kg):");
        double peso = scanner.nextDouble();

        if(idade >= 18 && idade <= 65 && peso > 50){
            System.out.println("Você pode doar sangue!");
        } else {
            if (idade < 18 || idade > 65){
                System.out.println("Você não pode doar sangue por conta da idade. Permitido apenas entre 18 e 65 anos.");
            } else {
                System.out.println("Você não tem o peso suficiente para ser um doador de sangue.");
            }
        }

        scanner.close();

    }
}

//opção 2
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade do doador: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o peso do doador (em kg): ");
        double peso = scanner.nextDouble();

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso > 50;

        if (idadeValida && pesoValido) {
            System.out.println("O doador é compatível para doação de sangue.");
        } else {
            System.out.println("O doador não é compatível. Motivo:");
            if (!idadeValida) {
                System.out.println("- Deve ter entre 18 e 65 anos.");
            }
            if (!pesoValido) {
                System.out.println("- Deve pesar mais de 50 kg.");
            }
        }
        scanner.close();
    }
}


 */


