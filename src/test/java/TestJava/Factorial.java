package TestJava;

public class Factorial {

    public static int fact(int n)
    {
        int fact = 1;
        for(int i=n; i>=1; i--)
        {
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {

        int m = Factorial.fact(5);

        System.out.println("Factorial of give number is = "+m);
    }
}
