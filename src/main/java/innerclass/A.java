package innerclass;

public class A {

    int age;
    public void show()
    {
        System.out.println("in show");
    }
    class B
    {
        public void config()
        {
            System.out.println("in config");
        }
    }

    static class C
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}

