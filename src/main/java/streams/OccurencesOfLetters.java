package streams;

import java.util.Map;
import java.util.stream.Collectors;

public class OccurencesOfLetters {

    public static void main(String[] args) {

        String s = "akshayyadurajbhogale";

        Map<Character, Long> freqMap = s.chars() // IntStream of char codes
                .mapToObj(c -> (char)c) //Convert to character stream
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(freqMap);

    }
}
