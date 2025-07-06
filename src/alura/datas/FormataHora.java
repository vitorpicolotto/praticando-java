package alura.datas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormataHora {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.now();
        LocalDate data = LocalDate.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        String dataFormatada = data.format(formatoData);
        String horaFormatada = hora.format(formatoHora);

        System.out.println("Data formatada: " + dataFormatada);
        System.out.println("Hora formatada: " + horaFormatada);

    }
}
