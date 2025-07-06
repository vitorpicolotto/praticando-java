package alura.datas;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleHorarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scanner.next(), formatter);

        System.out.println("Digite a carga horária diária (em horas): ");
        int cargaHoraria = scanner.nextInt();

        System.out.println("Digite o horário que saiu (HH:mm): ");
        LocalTime saida = LocalTime.parse(scanner.next(), formatter);

        scanner.close();

        LocalTime saidaPrevista = entrada.plusHours(cargaHoraria);

        Duration diferenca = Duration.between(saidaPrevista, saida);
        long horasExtras = diferenca.toHours();
        long minutosExtras = diferenca.toMinutesPart();

        System.out.println("\nHorário de entrada: " + entrada.format(formatter));
        System.out.println("Horário previsto de saída: " + saidaPrevista.format(formatter));
        System.out.println("Horário de saída: " + saida.format(formatter));

        if(horasExtras == 0 && minutosExtras == 0){
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;

            if(horasExtras > 0 || minutosExtras > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }
            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutosExtras) + "min.");
        }

    }
}
