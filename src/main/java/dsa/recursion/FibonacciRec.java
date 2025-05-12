package dsa.recursion;

public class FibonacciRec {

    public static void fiboNumber(int a, int b, int n)
    {
        if(n==0)
        {
            return;
        }
        int c = a + b;

        System.out.print(c+" ");
        fiboNumber(b, c, n-1);


    }

    public static void main(String[] args) {

        fiboNumber(0,1, 10);

    }

}
