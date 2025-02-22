package operator_Switch_staement;

public class Bitwise {

    // bitwise Operator
    // bitwise (&): it checks always both conditions whether first condition is true or false
    //logical (&&): it checks second condition if first condition is true

    public static void main(String[] args) {

        int a = 400;
        int b = 500;

        System.out.println(b<a & a<b);
        System.out.println(b<a && a<b);
    }
}
