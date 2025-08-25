package streams;

import java.util.stream.IntStream;

public class PairNumbers {

    public static void main(String[] args) {

        int []a = {1, 2, 7, 8, 9};

        IntStream.range(0, a.length)
                .boxed()
                .flatMap(i->
                        IntStream.range(i+1, a.length)
                                .mapToObj(j->new int[]{a[i], a[j]}))
                .forEach(pair ->{
                    int m = pair[0];
                    int n = pair[1];
                    int product = m*n;
                    String type = (product%2==0) ? "even" : "odd";

                    System.out.println(m + " * " + n + " = " + product);
                    System.out.println(product + " is " + type);
                });
    }
}
