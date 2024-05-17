package TestJava;

public class FiboNacci {

    public static void fibo(int n)
    {
        int a=0, b=1;
        for(int i=1; i<=n; i++)
        {
            int c = a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }

    public static void main(String[] args) {

        fibo(10);
    }
}
