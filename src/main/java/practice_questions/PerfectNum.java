package practice_questions;

public class PerfectNum {
    public static void perfectNumber(int n)
    {
        int sum = 0;
        for(int i=1; i<n; i++)
        {
            if(n%i == 0) // check the numbers who divide n
            {
                sum = sum + i;
            }
        }
        if(n == sum)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }

    }
    public static void main(String[] args)
    {
        perfectNumber(496);
    }
}
