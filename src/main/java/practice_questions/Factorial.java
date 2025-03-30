package practice_questions;

import java.util.Scanner;

public class Factorial {
    public int fact(int n){
        int facto =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        for(int i=n; i>=1; i--){
            facto = facto*i;
        }
        System.out.println("The factorial of "+n+" is = "+facto);
        return facto;
    }
    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.fact(5);
    }
}
