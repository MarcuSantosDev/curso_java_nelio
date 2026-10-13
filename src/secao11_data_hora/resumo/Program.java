package secao11_data_hora.resumo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Program {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now(); // Registra o momento universal correspondente

        // Converter uma String em LocalDate (Se a data estiver em texto no formato ISO)
        LocalDate d04 = LocalDate.parse("2022-10-15");
        LocalDateTime d05 = LocalDateTime.parse("2022-10-15T01:30:26");
        Instant d06 = Instant.parse("2022-10-15T01:30:26Z");

        Instant d07 = Instant.parse("2022-10-15T01:30:26-03:00");

        // Customizando LocalDAte
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("27/07/2003",fmt1);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern(("dd/MM/yyyy HH:mm"));
        LocalDateTime d09 = LocalDateTime.parse("27/07/2003 01:30",fmt2);

        // Criar data específica
        LocalDate d10 = LocalDate.of(2022,7,20);
        LocalDateTime d11 = LocalDateTime.of(2022,7,20,5,10);

        System.out.println("Data de agora: " + d01);
        System.out.println("Data + Hora Atual: " + d02);
        System.out.println("Instant: " + d03);
        System.out.println("Data via String: " + d04);
        System.out.println("Data + hora via String: " + d05);
        System.out.println("Instant via String Londres: " + d06);
        System.out.println("Instant via String SP: " + d07);
        System.out.println("Local Date Customizado: " + d08);
        System.out.println("Local Date + hora Customizado: " + d09);
        System.out.println("Local Date específico: " + d10);
        System.out.println("Local Date + hora específico: " + d11);

    }
}
