package multithreading.synchronization;

class BookTrainSeat
{
    int total_seats = 10;
    public void bookSeat(int seats, String name)
    {
        if(total_seats >= seats)
        {
            System.out.println(name + " booked "+seats+" successfully ");
            total_seats = total_seats - seats;
            System.out.println("Total seats left : "+total_seats);
        }
        else
        {
            System.out.println(name +"Soryy!! seats not booked");
            System.out.println("Total seats left : "+total_seats);
        }
    }
}
class MyThread extends Thread
{
    BookTrainSeat bts;
    int seats;
    public MyThread(BookTrainSeat bts, int seats)
    {
        this.seats = seats;
        this.bts = bts;
    }
    public void run()
    {
        bts.bookSeat(seats, getName());
    }

}
public class TrainReservation {

    public static void main(String[] args) {

        BookTrainSeat bts = new BookTrainSeat();
        MyThread d = new MyThread(bts, 5);
        d.setName("Deepak");
        d.start();

        MyThread a = new MyThread(bts, 3);
        a.setName("Akshay");
        a.start();

        MyThread c = new MyThread(bts, 4);
        c.setName("Chinmay");
        c.start();
    }

}
