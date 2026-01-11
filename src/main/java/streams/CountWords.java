package streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWords {

    public static void main(String[] args) {

        String input = "akshay is akshay is that what are you doing";

        Map<String, Long> map = Arrays.stream(input.split("\\s+"))
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));

        System.out.println(map);
    }
}
