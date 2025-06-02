package practice_questions;

public class WaterBottles {

    public static int calculateBottles(int numBottles, int numExchange)
    {
        int ans = numBottles;

        while(numBottles>=numExchange)
        {
            int newBottles = numBottles/numExchange;

            int remBottles = numBottles % numExchange;

            ans = ans + newBottles;

            numBottles = newBottles + remBottles;
        }
        return ans;
    }

    public static void main(String[] args) {

        int b = calculateBottles(15,4);
        System.out.println(b);
    }
}
