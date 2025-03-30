package practice_questions;

import java.util.Scanner;

public class PetersonNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        String v = String.valueOf(n);
        int []a = new int[v.length()];
        int sum = 0;
        int h = n;
        for(int i=0; i<a.length; i++)
        {
            int b = n%10;
            n = n/10;

            a[i] = b;

        }
        for(int j=0; j<a.length; j++)
        {
            int fact = 1;
            for(int k=a[j]; k>=1; k--)
            {
                fact = fact * k;

            }
            sum = sum + fact;

        }
        if(h==sum)
        {
            System.out.println("Peterson Number");
        }
        else
        {
            System.out.println("Not Peterson Number");
        }


    }
}
