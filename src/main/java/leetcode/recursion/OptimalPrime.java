package leetcode.recursion;

public class OptimalPrime {

    public static void main(String[] args) {

        int i = 7;
        boolean res = checkPrime(i);
        System.out.println(res);
    }

    public static boolean checkPrime(int num){

        if(num <= 1) return false;

        return prime(num, 2);
    }

    public static boolean prime(int n, int x){

        if(x > Math.sqrt(n)) return true;

        if(n%x == 0) return false;

        return prime(n, x+1);
    }
}
