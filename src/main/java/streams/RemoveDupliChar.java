package streams;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupliChar {

    public static void main(String[] args) {
        String s = "mynameisakshay";

        List<Character> unique = s.chars()
                .mapToObj(c->(char)c)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unique);
    }
}
