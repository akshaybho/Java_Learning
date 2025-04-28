package practice_questions;

public class ListOfPerfect {

    public static void listOfPerfect(int n)
    {

        for(int i=1; i<n; i++)
        {int sum = 0;
            for(int j=1; j<i; j++)
            {
                if(i%j==0)
                {
                    sum = sum + j;
                }
            }
            if(sum==i)
            {
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String[] args)
    {
        listOfPerfect(100000);
    }
}
