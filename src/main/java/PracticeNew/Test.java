package PracticeNew;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number upto which you required prime numbers");
        int n = sc.nextInt();
        int start = 1;
        for (int i = 2; i <= n; i++) {
            int count = 0;


            if(start<=i && i%start == 0)
            {
                count++;
                start ++;
            }


            if (count == 2) {

                System.out.print(i + " ");

            }

        }
    }
}


