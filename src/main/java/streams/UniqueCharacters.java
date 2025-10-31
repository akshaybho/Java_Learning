package streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueCharacters {

    public static void main(String[] args) {
        String s = "Banana pineapple pudding";

        Set<Character> set = new HashSet<>();

        List<Character> unique = s.chars()
                .mapToObj(c-> (char)c)
                .filter(n-> set.add(n) && n!=' ')
                .collect(Collectors.toList());

        System.out.println(unique);
    }
}
