package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_4 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Akshay", "Saloni", "Abhijeet");

        List <Integer> length = names.stream()
                .map(String :: length)
                .collect(Collectors.toList());

        System.out.println(length);

    }
}
