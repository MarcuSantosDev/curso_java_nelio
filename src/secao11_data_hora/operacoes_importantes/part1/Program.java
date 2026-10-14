package secao11_data_hora.operacoes_importantes.part1;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;



public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm");
        // Ao formatar um Instant é preciso definir um fuso horário para exibi-lo como data e hora local.
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern(("dd/MM/YYYY HH:mm")).withZone(ZoneId.systemDefault());

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; // Específico pra Instant

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusWeeks(1);
        LocalDate nextWeekLocalDate = d04.plusWeeks(1);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        // Zone Id´s q posso usar
        // for(String s: ZoneId.getAvailableZoneIds()) {
        // System.out.println(s);
        // }

        // Converte Instant para data local
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());

        // Converte Instant para data local em Portugal
        LocalDate r2 = LocalDate.ofInstant(d06,ZoneId.of("Portugal"));

        // Converte Instant para data-hora local
        LocalDateTime r3 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault());

        // Converte Instant para data-hora em Portugal
        LocalDateTime r4 = LocalDateTime.ofInstant(d06,ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("d04 day = " + d04.getDayOfMonth());
        System.out.println("d04  mounth= " + d04.getMonth());
        System.out.println("d04 year = " + d04.getYear());
        System.out.println("\nd05 hour = " + d05.getHour());
    }
}


