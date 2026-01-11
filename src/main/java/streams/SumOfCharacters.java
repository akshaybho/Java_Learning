package streams;

import java.util.Arrays;
import java.util.List;

public class SumOfCharacters {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "reduce", "stream");

        int count = list.stream()
                .map(String::length)
                .reduce(0, (a,b)->a+b);

        System.out.println(count);
    }
}
