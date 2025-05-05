package practice_questions;

import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you principal amount");
        double principal_amount = sc.nextDouble();

        System.out.println("Enter rate of interest");
        double rate = sc.nextDouble();

        System.out.println("Enter a time");
        double time = sc.nextDouble();

        double CI = principal_amount*(Math.pow((1 + rate/100), time));

        System.out.println("Compound interest is "+CI);
    }
}
