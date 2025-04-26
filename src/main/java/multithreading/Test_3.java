package multithreading;

public class Test_3 extends Thread {

        public void run()
        {
            System.out.println("Hello");
            System.out.println("1 "+Thread.currentThread().getName());
        }

    public static void main(String[] args) {
        Test_3 t = new Test_3();
        t.start();
        System.out.println("2 "+Thread.currentThread().getName());
    }
}
