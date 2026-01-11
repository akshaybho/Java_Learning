package streams.specialCase2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Akshay", Arrays.asList("Cricket", "Music", "Travel")),
                new Person("Ram", Arrays.asList("Music", "Reading")),
                new Person("Suresh", Arrays.asList("Cricket", "Chess", "Reading"))
        );

        Map<String, Long> hobbyCount = persons.stream()
                .flatMap(p -> p.hobbies.stream())
                .collect(Collectors.groupingBy(
                        hobby -> hobby,
                        Collectors.counting()
                ));

        System.out.println(hobbyCount);
    }
}
