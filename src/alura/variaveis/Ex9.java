package alura.variaveis;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner viagem = new Scanner(System.in);
        System.out.println("Vamos planejar sua viagem!");

        System.out.println("Qual o consumo médio do seu veículo (km/L)?");
        double consumoMedio = viagem.nextDouble();

        System.out.println("Qual a capacidade do tanque de combustível (L)?");
        double capacidadeTanque = viagem.nextDouble();

        System.out.println("Quantos litros de combustível tem no seu tanque agora?");
        double combustivelAtual = viagem.nextDouble();

        System.out.println("Qual a distância que você irá percorrer (km)?");
        double distanciaViagem = viagem.nextDouble();

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.println("Com o tanque cheio, você consegue percorrer " + autonomiaMaxima + "km.");

        if(autonomiaAtual >= distanciaViagem){
            System.out.println("Você tem combustível suficiente para completar a viagem");
        } else {
            System.out.println("Abasteça antes de viajar ou vai ficar na estrada!");
        }

        viagem.close();
    }
}
