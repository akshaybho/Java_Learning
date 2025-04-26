package practice_questions;

public class Special {
    public static void specialNumber(int n)
    {
        int rev = 0;

        int b;
        int sum = 0;
        while(n>0)
        {
            int fact = 1;
            b  = n%10;
            rev =  b;
            n = n/10;
            for(int i=rev; i>=1; i--)
            {
                fact = fact*i;
            }
            sum = sum + fact;
        }
        System.out.println(sum);

    }
    public static void main(String[] args)
    {
        specialNumber(145);
    }
}
