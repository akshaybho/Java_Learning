package practice_questions;

public class CountPrime {

    public static void countPrimeNumbers(int n)
    {

        int primeNumbers = 0;
        for(int i=2; i<n; i++)
        {
            int count = 0;
            for(int j=1; j<n; j++)
            {
                if(i%j == 0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                System.out.print(i+" ");
                primeNumbers++;

            }

        }System.out.println();
        System.out.println(primeNumbers);
    }

    public static void main(String[] args) {
        countPrimeNumbers(100);
    }
}
