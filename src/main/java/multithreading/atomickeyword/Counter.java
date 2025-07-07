package multithreading.atomickeyword;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    AtomicInteger count = new AtomicInteger();

    public void increment()
    {
        count.incrementAndGet();
    }

    public int getCount()
    {
        return count.get();
    }
}
