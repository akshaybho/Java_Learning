package streams;

import java.util.stream.Collectors;

public class FirstNonRepeated {

    public static void main(String[] args) {

        String s = "swiss";

        System.out.println(s.chars()
                .mapToObj(c->(char)c).filter(c-> s.indexOf(c) == s.lastIndexOf(c)).collect(Collectors.toList()));
    }
}
