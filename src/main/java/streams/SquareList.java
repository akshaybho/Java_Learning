package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareList {

    public static void main(String[] args) {

        List <Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        List <Integer> square = numbers.stream().map(s->s*s).collect(Collectors.toList());

        System.out.print(square+" ");
    }
}
