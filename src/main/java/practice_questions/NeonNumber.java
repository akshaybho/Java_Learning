package practice_questions;

public class NeonNumber {

    public static void main(String[] args) {

        neonNumber(9);
    }

    public static void neonNumber(int num)
    {
        int h = num;
        int sum = 0;
        int sqaure = 0;
        int temp = 0;
        for(int i=0; i<=1; i++)
        {
            temp = num;
             sqaure = temp*num;
        }
        System.out.println(sqaure);

        while(sqaure>0)
        {
            int b = sqaure%10;
            sum = sum + b;
            sqaure = sqaure/10;
        }
       if(sum==h)
       {
           System.out.println("Neon Number");
       }
       else
       {
           System.out.println("Not Neon Number");
       }
    }
}
