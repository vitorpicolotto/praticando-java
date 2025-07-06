package alura.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Lembrete {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2025, 7, 30);
        int avisoAntecedencia = 5;
        LocalDate dataLembrete = dataVencimento.minusDays(avisoAntecedencia);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataLembrete.format(formatter);

        System.out.println("Data lembrete: " + dataFormatada);
    }
}
