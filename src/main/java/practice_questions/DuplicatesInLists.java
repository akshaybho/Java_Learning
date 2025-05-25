package practice_questions;

import java.util.*;

public class DuplicatesInLists {

    public static List<String> findDuplicates(List <String> list1, List <String> list2)
    {
        Set<String> unique = new HashSet<>(list1);

        List <String> duplicates = new ArrayList<>();

        for(String n : list2)
        {
            if(unique.contains(n))
            {
                duplicates.add(n);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> list2 = Arrays.asList("banana", "date", "fig", "grape");

        List <String> result = findDuplicates(list1, list2);
        System.out.println("Duplicates : "+result);
    }
}
