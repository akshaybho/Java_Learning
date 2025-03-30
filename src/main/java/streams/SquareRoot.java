package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareRoot {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 9, 16, 25, 36, 49, 64, 81);

        List <Double> sqrt = numbers.stream().map(s->Math.sqrt(s)).collect(Collectors.toList());

        System.out.println(sqrt);
    }
}
