package practice_questions;

import java.util.HashSet;
import java.util.Set;

public class Altimetric_IQ1 {

    public static void main(String[] args) {

        String []a = {"aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah", "allessandra", "allianna",
                "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle", "annebelle"};

        countChar(a);
    }
    public static void countChar(String []names)
    {
        for(String arr : names) {
            if (arr.charAt(0) == 'a' && arr.charAt(1) == 'a') {
                Set<Character> distinictChars = new HashSet<>();
                for (char ch : arr.toCharArray()) {
                    distinictChars.add(ch);
                }
                System.out.println(arr + "===>" + distinictChars.size());
            }
        }
    }
}


