package optional;

import java.util.Optional;



public class Test {

    public static void main(String[] args) {

        String name = "Akshay";
        Optional <String> optionalName = Optional.ofNullable(null);

        String result = optionalName.orElse("Default Name");

        System.out.println("Result : "+ result);
    }
}
