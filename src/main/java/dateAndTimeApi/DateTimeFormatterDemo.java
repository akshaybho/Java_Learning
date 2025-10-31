package dateAndTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2015,3,18);
        LocalTime localTime = LocalTime.of(15,30,0);
        LocalDateTime localDateTime = LocalDateTime.of(2015,3,18,15,30,0);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        System.out.println("=======================================================================================================");

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dateFormatter.format(localDate);
        System.out.println(formattedDate);


        System.out.println("=======================================================================================================");

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedTime = timeFormatter.format(localTime);
        System.out.println(formattedTime);

    }
}
