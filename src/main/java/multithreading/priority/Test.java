package multithreading.priority;

public class Test
{
    public static void main(String[] args) {

        myThread mt = new myThread();
        mt.start();

        System.out.println("Hello : "+Thread.currentThread().getName());
    }
}
