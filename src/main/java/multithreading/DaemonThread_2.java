package multithreading;

public class DaemonThread_2 extends Thread {

    public void run() {
        while (true) {
            System.out.println("Daemon thread is running...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Daemon thread is interrupted");
            }
        }
    }
    public static void main(String[] args) {

        DaemonThread_2 d = new DaemonThread_2();
        d.setDaemon(true);
        d.start();

        System.out.println("Main thread is running...");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Main thread finished...");
    }

}
