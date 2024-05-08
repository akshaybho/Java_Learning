package regex;

import java.util.regex.Pattern;

public class Regex_2 {

    public static void main(String[] args) {

        System.out.println(Pattern.matches(".s", "gs"));
        System.out.println(Pattern.matches("..s", "abs"));
    }
}
