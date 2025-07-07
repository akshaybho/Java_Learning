package multithreading.synchronizedkeyword;

public class Safe {

    public static void main(String[] args) throws InterruptedException {

        CounterSafe cs = new CounterSafe();

        Thread t1 = new Thread(()->
        {
            for(int i=0; i<1000; i++)
            {
               cs.increment();
            }
        });

        Thread t2 = new Thread(()->
        {
            for(int i=0; i<1000; i++)
            {
                cs.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Safe : "+cs.count);


    }
}
