package practice_questions;

import java.util.Scanner;

public class PetersonNumber {

    Scanner sc;
    int n;

    public static void main(String[] args)
    {
        PetersonNumber t = new PetersonNumber();
        t.start_application();
    }
    void start_application()
    {
        System.out.println("Enter a number : ");
        getUserInput();
        main_logic();
    }
    void getUserInput()
    {
        sc = new Scanner(System.in);
        n = sc.nextInt();
    }
    void main_logic()
    {
        int sum = 0;
        int h = n;
        String s = String.valueOf(n);
        int []a = new int[s.length()];

        for(int i=0; i<a.length; i++)
        {
            int b = n%10;
            n = n/10;
            a[i] = b;
        }

        for(int j=0; j<a.length; j++)
        {
            int fact = 1;
            for(int k = a[j]; k>=1; k--)
            {
                fact = fact*k;
            }
            sum = sum + fact;
        }
        if(sum==h)
        {
            System.out.println("Peterson Number");
        }
        else
        {
            System.out.println("Not Peterson Number");
        }
        start_application();
    }
}
