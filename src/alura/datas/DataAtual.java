package alura.datas;

import java.time.LocalDate;
import java.time.LocalTime;

public class DataAtual {
    public static void main(String[] args) {
        String tarefa = "Enviar relatório semanal";

        LocalDate dataCriacao = LocalDate.now();
        LocalTime horaCriacao = LocalTime.now();

        System.out.println("Tarefa: \"" + tarefa + "\"");
        System.out.println("Data de criação: " + dataCriacao);
        System.out.println("Hora de criação: "+ horaCriacao);
    }
}
