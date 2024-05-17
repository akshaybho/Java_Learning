package multithreading;

 class Demo extends Thread {

     public void run()
     {
         for(int i=0; i<=100; i++)
         {
             System.out.println("Hi");
         }
     }

}
class Demo1 extends Thread {

    public void run()
    {
        for(int i=0; i<=100; i++)
        {
            System.out.println("Hello");
        }
    }
}
class Main
{
    public static void main(String[] args) {
        Demo d = new Demo();
        Demo1 d1 = new Demo1();

        d.setPriority(Thread.MAX_PRIORITY);
        System.out.println(d.getPriority());
        d.start();
        d1.start();
    }
}
