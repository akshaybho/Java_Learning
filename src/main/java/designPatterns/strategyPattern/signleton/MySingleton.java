package designPatterns.strategyPattern.signleton;

public class MySingleton {

    private static MySingleton instance;

    private MySingleton()
    {
        System.out.println("Singleton instance created");
    }

    public static synchronized MySingleton getInstance()
    {
        if(instance==null)
        {
            instance = new MySingleton();
        }
        return instance;
    }

    public void show()
    {
        System.out.println("Hello from singleton");
    }
}
