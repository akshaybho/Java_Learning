package multithreading;

public class Test_1 extends Thread{

    public void run()
    {
        System.out.println("Thread starts running");
    }

    public static void main(String[] args) {
        Test_1 t1 = new Test_1();
        t1.start();
        Test_1 t2 = new Test_1();
        t2.start();
    }
}
