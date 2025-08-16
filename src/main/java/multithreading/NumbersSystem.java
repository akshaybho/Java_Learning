package multithreading;

public class NumbersSystem {

    private static final Object lock = new Object();
    private static int number =1;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{

            while(number<=10)
            {
                synchronized (lock)
                {
                    if(number%2!=0)
                    {
                        System.out.println(Thread.currentThread().getName()+"====="+number);
                        number++;
                        lock.notify();
                    }
                    else
                    {
                        try{
                            lock.wait();
                        }
                        catch(InterruptedException e)
                        {

                        }
                    }
                }
            }

        });

        Thread t2 = new Thread(()->{

            while(number<=10)
            {
                synchronized (lock)
                {
                    if(number%2==0)
                    {
                        System.out.println(Thread.currentThread().getName()+"====="+number);
                        number++;
                        lock.notify();
                    }
                    else
                    {
                        try{
                            lock.wait();
                        }
                        catch(InterruptedException e)
                        {

                        }
                    }
                }
            }

        });

        t1.start();
        t2.start();

    }
}
