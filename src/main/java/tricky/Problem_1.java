package tricky;

public class Problem_1 {

    public static void main(String[] args) {
        method1();
    }

    public static boolean method1()
    {
        int []a = {10, 20, 30};

        try
        {
            System.out.println(a[2]);
            return true;
        }
        finally
        {
            System.out.println("END");
        }
    }
}
