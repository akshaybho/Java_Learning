package calendar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date_4 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate birthDay = LocalDate.of(1995, 02, 11);

        long ageinDays = ChronoUnit.DAYS.between(birthDay, today);

        System.out.println("Age in days : "+ageinDays);
    }
}
