package lambda;

import java.util.ArrayList;
import java.util.List;

public class Stream_2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Pankaj");
        names.add("Anuj");
        names.add("Reshma");
        names.add("Saloni");
        names.add("Akshay");
        names.add("Nahar");

        names.stream()
                .filter(s -> s.length()>5)
                .forEach(s -> System.out.println(s));
    }
}
