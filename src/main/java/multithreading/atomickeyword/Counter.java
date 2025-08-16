package multithreading.atomickeyword;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    AtomicInteger count = new AtomicInteger();

    //int counter  = 0;
    public void increment()
    {
        count.incrementAndGet();
        //counter++;
    }

    public int getCount()
    {
        return count.get();
    }
}
