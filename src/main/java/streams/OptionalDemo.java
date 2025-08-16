package streams;

import java.util.Optional;

public class OptionalDemo {


    public static void main(String[] args) {

        String s = null;
        //System.out.println(s.length()); throws null pointer exception

        Optional<String> optionalS = Optional.ofNullable(s);

        int length = optionalS.map(String::length).orElse(0);

        System.out.println(length);
    }
}
