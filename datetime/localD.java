package datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class localD {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalTime d2 = LocalTime.now();
        LocalDateTime d3 = LocalDateTime.now();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        Period p = Period.of(2,2,10);
        System.out.println(p.addTo(d3));

        Instant i = Instant.now();
        System.out.println(i);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(df.format(d3));

        //chronoField -> localeDateTime
        System.out.println(d3.get(ChronoField.YEAR));
    }
}
