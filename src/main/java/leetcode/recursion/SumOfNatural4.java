package leetcode.recursion;

public class SumOfNatural4 {

    public static void main(String[] args) {

        int n = 10;

        int sum = sumOfNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }

    public static int sumOfNumbers(int n){
        if(n == 0){
            return 0;
        }
        int sum = n + sumOfNumbers(n-1);
        return sum;
    }
}
