package multithreading;

public class Test_2 extends Thread {

    private Thread t;
    private String threadName;
    Test_2(String name)
    {
        threadName = name;
        System.out.println("Thread: "+threadName+" , "+"state: New");
    }
    public void run()
    {

    }
}
