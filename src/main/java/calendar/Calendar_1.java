package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_1 {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println(sdf.format(cal.getTime()));

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));

    }
}
