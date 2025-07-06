package alura.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrazoEntrega {
    public static void main(String[] args) {
        LocalDate dataInicio = LocalDate.now();
        int prazo = 15;
        LocalDate dataFinal = dataInicio.plusDays(prazo);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataFinal.format(formatter);

        System.out.println("Data da entrega: " + dataFormatada);
    }
}
