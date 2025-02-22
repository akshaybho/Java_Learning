package constructor;

import java.util.Scanner;

public class Problem_5Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give details");
        System.out.println("Name = ");
        String a = sc.nextLine();
        System.out.println("Age = ");
        int b = sc.nextInt();
        System.out.println("Education = ");
        String c = sc.next();
       System.out.println("Salary = ");
        int d = sc.nextInt();

        Problem_5 p = new Problem_5(a, b, c, d);
        p.displayDetails();

    }
}
