package multithreading.volatileKeyword;

public class SharedObj {

    public volatile boolean flag = false;
//after using volatile gives output from both threads because its taking from main memory

    public void setFlagTrue()
    {
        System.out.println("Writer thread made the flag true !");
        flag = true;
    }

    public void printIfFlagTrue()
    {
        while(!flag)
        {
            // do nothing
        }
        System.out.println("Flag is true !");
    }

    public static void main(String[] args) {

        SharedObj sharedObj = new SharedObj();

        Thread writerThread = new Thread(()->{
            try
            {
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {

            }
            sharedObj.setFlagTrue();
        });

        Thread readerThread = new Thread(()->{

            sharedObj.printIfFlagTrue();
        });

        writerThread.start();
        readerThread.start();
    }
}
