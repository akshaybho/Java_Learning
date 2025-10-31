package multithreading.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ES1 {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        //Submit the task to the executor
        executor.submit(()->{
            System.out.println(Thread.currentThread().getName()+" is running the task");
        });

        executor.submit(()->{
            System.out.println(Thread.currentThread().getName()+" is running the task");
        });

        executor.submit(()->{
            System.out.println(Thread.currentThread().getName()+" is running the task");
        });

        //shutdown the executor after the task are done
        executor.shutdown();
    }
}
