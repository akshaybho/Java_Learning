package streams;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateLetters {

    public static void main(String[] args) {

        String s = "akshaybhogale";

        Set<Character> dupli = s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(dupli);
    }
}
