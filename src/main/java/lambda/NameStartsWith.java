package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameStartsWith {

    public static void main(String[] args) {

        List <String> names = Arrays.asList("Akshay", "Banana", "Dog", "Cat", "Tiger", "Nature", "Bouncer", "Cricket");

        List <String> namesStartsWithC = names.stream().
                filter(name -> name.startsWith("C")).
                collect(Collectors.toList());

        System.out.println(namesStartsWithC);



    }
}
