package alura.datas;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConversaoFuso {
    public static void main(String[] args) {
        ZonedDateTime horarioSistema = ZonedDateTime.now();
        ZonedDateTime horarioSydney = horarioSistema.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário local atual: " + horarioSistema.format(formatter));
        System.out.println("Horário de Sydney (Austrália): " + horarioSydney.format(formatter));
    }
}
