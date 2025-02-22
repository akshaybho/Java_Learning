package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_6 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("abhijeet");
        names.add("don");
        names.add("ajinkya");
        names.add("boss");
        names.add("akshay");

        Collections.sort(names);

        List<String> reverseString = names.stream()
                .map(word->new StringBuilder(word).reverse().toString())
                        .collect(Collectors.toList());

        System.out.println(reverseString);
    }
}
