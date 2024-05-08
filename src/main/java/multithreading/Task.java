package multithreading;

public class Task implements Runnable{
    private String name;
    public Task(String name)
    {
        this.name = name;
    }
    @Override
    public void run() {
        for(int i=0; i<5; i++)
        {
            System.out.println(name + ": "+i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Task task1 = new Task("Task1");
        Task task2 = new Task("Task2");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}
