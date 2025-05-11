package collection.comparator;

import java.util.Arrays;
import java.util.List;

public class LengthDesc {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("banana", "kiwi", "apple", "mangosdv");

        words.sort((a,b)->Integer.compare(b.length(), a.length()));
        //b.length() is greater, b comes before a

        System.out.println(words);
    }
}
