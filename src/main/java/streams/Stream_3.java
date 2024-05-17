package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Stream_3 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("banana", "cherry", "date", "apple");

        Collections.sort(words);
        words.stream().map(String :: toUpperCase)
                .forEach(s -> System.out.println(s));
    }
}
