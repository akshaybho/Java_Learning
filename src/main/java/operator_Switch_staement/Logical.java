package operator_Switch_staement;

public class Logical {

    //Logical Operators
    // &, &&
    // T, T ----> T
    // T, F ----> F
    // F, T ----> F
    // F, F ----> F

    // |, || : OR
    // T, T ----> T
    // T, F ----> T
    // F, T ----> T
    // F, F ----> F

    // ! : NOT
    // T ----> F
    // F ----> T

    public static void main(String[] args) {

        int x = 7;
        int y = 5;

        int a = 5;
        int b = 9;

        boolean result = x>y && a>b;
        boolean result1 = x>y || a>b || a>10;

        System.out.println(result);
        System.out.println(!result);
        System.out.println(result1);
    }
}
