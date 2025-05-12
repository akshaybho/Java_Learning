package multithreading.priority;

public class myThread extends Thread{

    public void run()
    {
        System.out.println("hi : "+Thread.currentThread().getName());
    }
}

