package recursion;

public class RecFactorial {

    public static int calculateFactorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        int fact_nm1 = calculateFactorial(n-1);

        return n*fact_nm1;
    }

    public static void main(String[] args) {

        int b = 5;
        int ans = calculateFactorial(b);
        System.out.println(ans);
    }
}
