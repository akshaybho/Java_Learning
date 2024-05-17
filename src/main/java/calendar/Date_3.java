package calendar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date_3 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate birthDay = LocalDate.of(2024,05,25);

        long daysUntilBirthday = ChronoUnit.DAYS.between(today, birthDay);

        if(daysUntilBirthday<0)
        {
            birthDay = birthDay.plusYears(1);
            daysUntilBirthday = ChronoUnit.DAYS.between(today, birthDay);
        }

        System.out.println("Days until next birthday : "+ daysUntilBirthday);
    }
}
