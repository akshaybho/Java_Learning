package practice_questions;

import java.util.Scanner;

public class SunnyNumber {

    static boolean findPerfectSquare(int n)
    {
        double square_root = Math.sqrt(n);

        return (square_root - Math.floor(square_root)==0);
    }

    static void isSunny(int b)
    {
        if (findPerfectSquare(b+1))
        {
            System.out.println("The number is Sunny Number");
        }
        else
        {
            System.out.println("The number is not Sunny Number");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int c = sc.nextInt();

        isSunny(c);
    }
}
