package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_3 {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("akshay");

        Matcher m = p.matcher("akshayismyfriendakshay");

        while(m.find())
        {
            System.out.println("Pattern found from "
            +m.start()+" to "
            +(m.end()-1));
        }
    }
}
