package streams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDupliChar {

    public static void main(String[] args) {

        String s = "akshaybhogale";

        Set<Character> set = new HashSet<>();

        Set<Character> dupli = s.chars()
                .mapToObj(c->(char)c)
                .filter(n -> !set.add(n))
                .collect(Collectors.toSet());

        System.out.println(dupli);
    }
    }

