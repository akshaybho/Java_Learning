package streams;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 20, 5, 40, 25);

        int sum = list.stream()
                .reduce(0, (a, b)-> a+b);

        System.out.println(sum);
    }
}
