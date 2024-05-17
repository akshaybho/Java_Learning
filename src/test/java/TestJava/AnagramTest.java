package TestJava;

import java.util.Arrays;

public class AnagramTest {

    public static void main(String[] args) {

        String s1 = "Silent";
        String s2 = "Listen";


        if (s1.length() != s2.length()) {
            System.out.println("Not");
        } else {

            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if (Arrays.equals(c1, c2)) {
                System.out.println("Strings are in Anagram");
            } else {
                System.out.println("String are not Anagram");
            }
        }
    }
    }


