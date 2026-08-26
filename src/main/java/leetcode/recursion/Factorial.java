package leetcode.recursion;

public class Factorial {

    public static void main(String[] args) {

        int fact = getFactorial(5);
        System.out.println(fact);
    }
    public static int getFactorial(int N){

        if(N == 0){
            return 1;
        }
        int fact = N * getFactorial(N-1);

        return fact;
    }
}
