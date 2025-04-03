package practice_questions;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n)
    {
        if(n<0)
        {
            System.out.println("False");
        }

        else
        {
            while(n%2 == 0)
            {
                n = n/2;

            }
            if(n == 1)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }

        return true;
    }

    public static void main(String[] args) {

        isPowerOfTwo(16);

    }
}
