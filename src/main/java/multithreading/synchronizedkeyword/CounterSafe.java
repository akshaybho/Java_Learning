package multithreading.synchronizedkeyword;

public class CounterSafe {

    int count = 0;

    public synchronized void increment()
    {
        count++;
    }
}
