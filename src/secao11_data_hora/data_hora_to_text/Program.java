package secao11_data_hora.data_hora_to_text;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

// https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/time/format/DateTimeFormatter.html

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

        // d04
        System.out.println("d04: " + d04.format(fmt1)); // Transforma a data em uma string do tipo formatado
        System.out.println("d04: " + fmt1.format(d04)); // Fumciona desse jeito também !!!
        System.out.println("d04: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/YYYY"))); // Outra alternativa
        System.out.println();

        // d05
        System.out.println("d05: " + d05.format(fmt1));
        System.out.println("d05: " + d05.format(fmt2));
        System.out.println("d05: " + d05.format(fmt4));

        // d06
        System.out.println();
        System.out.println("d06: " + fmt3.format(d06));
        //System.out.println("d06: " + d06.format(fmt3));      Instant não tem o método format()
        System.out.println("d06: " + fmt5.format(d06));
    }
}
