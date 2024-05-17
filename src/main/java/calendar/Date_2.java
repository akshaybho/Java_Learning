package calendar;

public class Date_2 {

    private int day;
    private int month;
    private int year;

    public Date_2(int day, int month, int year)
    {
        this.day =day;
        this.month = month;
        this.year = year;
    }

    public void displayDate()
    {
        System.out.println(day + "/" + month + "/" + year);
    }
}

