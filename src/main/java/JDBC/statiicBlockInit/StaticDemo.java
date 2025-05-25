package JDBC.statiicBlockInit;

public class StaticDemo {

    static StaticDemo st;
    static
    {
        st = new StaticDemo();
        System.out.println("Object created");
    }
    public static StaticDemo getValue()
    {
        return st;
    }
}
