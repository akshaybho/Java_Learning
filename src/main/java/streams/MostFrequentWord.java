package streams;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentWord {

    public static void main(String[] args) {

        String text = "I eat apple and mango then apple";

        //split the word and count the frequencies
        Map<String, Long> wordCount = Arrays.stream(text.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //find most frequency word
        Optional<Map.Entry<String, Long>> mostFrequent = wordCount.entrySet()
                .stream().max(Map.Entry.comparingByValue());

        mostFrequent.ifPresent(e ->
                System.out.println("Most frequent word: "+e.getKey()));
    }
}
