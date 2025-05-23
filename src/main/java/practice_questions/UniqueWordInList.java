package practice_questions;

import java.util.*;

public class UniqueWordInList {

    public static List<String> getUniueSotedWords(List <String> words)
    {
        //use TresSet to remove duplicates and sort alphabetically
        Set <String> uniqueSorted = new TreeSet<>(words);
        //convert back to list
        return new ArrayList<>(uniqueSorted);
    }

    public static void main(String[] args) {

        List <String> inputWords = Arrays.asList("bubble", "enjoy", "bhiku", "chomya", "tarmalya", "dhinchak");

        List <String> result = getUniueSotedWords(inputWords);

        System.out.println(result);
    }
}
