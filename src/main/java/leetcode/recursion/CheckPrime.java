package leetcode.recursion;

public class CheckPrime {

    public static void main(String[] args) {

        boolean res = isPrime( 2, 11);
        System.out.println(res);
    }

    public static boolean isPrime(int i, int n){

        if(i >= n) return true;

        if(n%i == 0) return false;

       return isPrime(i+1, n);
    }
}
