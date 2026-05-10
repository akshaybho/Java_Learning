package leetcode.bitManipulations;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        //Swap numbers without using third variable
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a ="+" "+a);
        System.out.println("b ="+" "+b);
    }
}
