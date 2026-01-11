package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EYQStream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Akshay Bhogale", "Ram Kapoor", "Abhishek Gupta");

        List<String> sortedSurname = list.stream()
                .sorted(Comparator.comparing(s-> s.substring(
                        s.lastIndexOf(" ")
                ))).collect(Collectors.toList());

        System.out.println(sortedSurname);
    }
}
