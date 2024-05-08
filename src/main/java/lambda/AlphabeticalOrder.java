package lambda;

import java.util.Arrays;
import java.util.List;

public class AlphabeticalOrder {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("akshay", "saloni", "vijay", "onkar", "sagar", "abhishek");

        names.stream()
                .sorted()
                .forEach(s -> System.out.println(s));

    }
}
