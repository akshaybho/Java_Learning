package TestJava;

import java.util.HashSet;
import java.util.Set;

public class RepeatedChar {

    public void repe() {
        String s = "aabghhhkkisssmllhahsylsopsj";

        Set<Character> seen = new HashSet<>();
        Set<Character> dupli = new HashSet<>();

        for(int i=0; i<s.length(); i++)
        {
            if(seen.contains(s.charAt(i)))
            {
                dupli.add(s.charAt(i));
            }
            else
            {
                seen.add(s.charAt(i));
            }
        }
        System.out.print("repeated characters = "+dupli+" ");
        System.out.print("unique characters = "+seen+" ");
    }

    public static void main(String[] args) {
        RepeatedChar r = new RepeatedChar();
        r.repe();
    }

}
