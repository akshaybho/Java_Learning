package calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_1 {

    public static void main(String[] args) {

        //current date, current time
        Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(sdf.format(d));
        //mm/dd/yyyy HH:MM:SS


    }
}
