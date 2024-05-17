package string;

import java.nio.charset.Charset;

public class String_L2 {

    public static void main(String[] args) {

        //Construct a new String by decoding the byte array. It uses the platform’s default character set for decoding.

        byte []a = {71, 102, 104, 108, 115};
        String s1 = new String(a);
        System.out.println(s1);

        //Construct a new String by decoding the byte array. It uses the char_set for decoding.
        byte []b = {71, 101, 101, 107, 115};
        Charset cs = Charset.defaultCharset();
        String s2 = new String(b, cs);
        System.out.println(s2);

        String s3 = "akshay112%&^!*@^1995";
        String regex = "[^a-zA-Z0-9]";
        String cleanedString = s3.replaceAll(regex,"");
        System.out.println(cleanedString);

        //substring(): return the substring from ith index character to end
        String s4 = "akshaybhogale";
        String sub = s4.substring(3);
        System.out.println(sub);

        String s5 = "akshaybhogale";
        String s6 = s5.replaceAll("a","b");
        System.out.println(s6);
    }
}
