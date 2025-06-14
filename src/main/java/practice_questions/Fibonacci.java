package practice_questions;

public class Fibonacci {
    public int fibo(int n){
        int sum = 0;
        int temp = 1;
        System.out.print(sum+" "+temp+" ");
        for(int i=0;i<n;i++){
            int b = sum + temp;
            sum = temp;
            temp = b;
            System.out.print(" "+b+" ");
        }
    return n;
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.fibo(3);
    }
}
