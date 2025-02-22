package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_7 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("hijeet");
        names.add("don");
        names.add("ajinkya");
        names.add("boss");
        names.add("kshay");

        List<Character> firstLetters = names.stream()
                .map(n-> n.charAt(0)).collect(Collectors.toList());

        System.out.println(firstLetters);

    }
}
