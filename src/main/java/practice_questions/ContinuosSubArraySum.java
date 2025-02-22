package practice_questions;

public class ContinuosSubArraySum {
    public static void main(String[] args) {

        int []a = {12, 5, 31, 9, 21, 8, 16, 5, 20, 12, 8};

        for(int i=0; i<a.length; i++)
        {

            int temp = a[i];
            for(int j=i+1; j<a.length; j++)
            {

                int sum = a[i] + a[j];

                a[i] = sum;
                if(sum == 45)
                {
                    int b = sum - a[j] - temp;

                    System.out.println(temp+" "+b+" "+a[j]+" ");
                }
            }
        }
    }
}
