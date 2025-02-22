package practice_questions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FISInterview {

    public static void main(String[] args) {

        String s = "AaBbCCDd";

        String a = s.toUpperCase();
        Set <Character> seen = new HashSet<>();
        Set <Character> dupli = new HashSet<>();

        for(int i=0; i<a.length(); i++)
        {

            if(seen.contains(a.charAt(i)))
            {
                dupli.add(a.charAt(i));
            }
            else
            {
                seen.add(a.charAt(i));
                System.out.print(a.charAt(i));
            }
        }

    }
}
