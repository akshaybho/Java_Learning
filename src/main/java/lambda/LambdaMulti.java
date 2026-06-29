package lambda;

public class LambdaMulti {

    public static void main(String[] args) {

        Multiplicable mul = (int a, int b) -> (a * b);

        int x = 10;
        int y = 20;

        int result = mul.multiply(x, y);

        System.out.println(result); //NOSONAR
    }
}
