package alura.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vencimento {
    public static void main(String[] args) {
        LocalDate dataVencimentoOriginal = LocalDate.of(2025,3,20);
        int adiantamentoMeses = 1;
        LocalDate novaDataVencimento = dataVencimentoOriginal.plusMonths(adiantamentoMeses);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = novaDataVencimento.format(formatter);

        System.out.println("Nova data de vencimento: " + dataFormatada);
    }
}
