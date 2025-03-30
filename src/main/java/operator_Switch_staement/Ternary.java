package operator_Switch_staement;

public class Ternary {

    // Ternary Operator
    // ?
    public static void main(String[] args) {

        int n = 4;
        int result = 0;

        result = n%2==0 ? 10 : 20; //Since the condition n % 2 == 0 is true, the ternary operator returns the first value (10).
                                   // If it were false, it would return 20.


        System.out.println(result);
    }
}
