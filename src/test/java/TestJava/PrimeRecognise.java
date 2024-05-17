package TestJava;

import java.util.Scanner;

public class PrimeRecognise {

    public static void primeNumbers(int n)
    {
        int count =0;

        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
               count++;
            }
        }
        if(count==2)
        {
            System.out.println("PRIME");
        }
        else
        {
            System.out.println("NOT PRIME");
        }
    }

    public static void main(String[] args) {

        PrimeRecognise.primeNumbers(43);
    }
}
