package alura.datas;

import java.time.Duration;
import java.time.LocalTime;

public class DiferencaHorarios {
    public static void main(String[] args) {
        LocalTime horaInicio = LocalTime.of(14,30,0);
        LocalTime horaFinal = LocalTime.of(16,45,0);

        Duration duracao = Duration.between(horaInicio, horaFinal);

        System.out.println("Diferença entre horários é de: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos.");
    }
}
