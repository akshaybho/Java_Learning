package multithreading;

public class DaemonThreads_1 extends Thread{

    public void run()
    {
        System.out.println("Daemon Thread");
    }

    public static void main(String[] args) {

        // if we remove sop("main thread") then daemon thread will not provide service
        System.out.println("Main Thread");
        DaemonThreads_1 d = new DaemonThreads_1();
        d.setDaemon(true);
        d.start();
    }
}
