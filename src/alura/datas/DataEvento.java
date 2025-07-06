package alura.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEvento {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2025, 7, 4);
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String dataEventoFormatada = dataEvento.format(formatter);
        String dataAtualFormatada = dataAtual.format(formatter);

        System.out.println("Data do evento: " + dataEventoFormatada);
        System.out.println("Data atual: " + dataAtualFormatada);

        if(dataEvento.isBefore(dataAtual)){
            System.out.println("O evento já ocoreu.");
        } else {
            System.out.println("O evento está para acontecer");
        }
    }
}
