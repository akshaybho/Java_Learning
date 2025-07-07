package enums;

public class Main {

    enum Day
    {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        Day today = Day.SUNDAY;

        if(today == Day.SUNDAY || today == Day.SATURDAY)
        {
            System.out.println("Its a weekend");
        }else
        {
            System.out.println("Its a weekday");
        }
    }
}
