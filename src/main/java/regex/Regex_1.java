package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_1 {

    public static void main(String[] args) {

        Pattern p = Pattern.compile(".s");
        //(".s): This creates regular expression pattern that matches any character followed by s.
        Matcher m = p.matcher("as");
        // This creates a Matcher object 'm' by applying the pattern to the input string "as".
        boolean b = m.matches();
        System.out.println(b);

        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b2);

        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b3);
    }
}
