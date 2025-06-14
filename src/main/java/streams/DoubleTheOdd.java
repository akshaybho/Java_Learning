package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleTheOdd {

    public static void main(String[] args) {

        List <Integer> list = Arrays.asList(21, 25, 24, 26, 23, 12, 11, 13, 54, 29);

        List <Integer> oddList = list.stream()
                .filter(n->n%2!=0).map(n->n*2)
                .collect(Collectors.toList());

        System.out.println(oddList);
    }
}
