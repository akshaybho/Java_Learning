package practice_questions;

public class Reverse_Number {

    public long reverse(int a){
   long rev=0;
         while(a>0){
             long b = a%10;
              rev = rev*10 + b;
              a = a/10;

         }return rev;

    }

    public static void main(String[] args) {

        Reverse_Number m = new Reverse_Number();
        long rev = m.reverse(1534236469);

        System.out.println(rev);
    }
}
