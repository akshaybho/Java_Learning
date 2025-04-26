package multithreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool_1 {

    public static void main(String[] args) {

        //create a thread-pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        //submit 5 tasks to thread-pool
        for(int i=1; i<=5; i++)
        {
            Runnable task = new MyTask(i);
            executor.submit(task);
        }

        //shutdown the thread-pool
        executor.shutdown();

    }
}
