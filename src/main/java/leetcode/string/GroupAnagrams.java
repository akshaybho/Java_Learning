package leetcode.string;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String []strs = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List<String>> map = new HashMap<>();

       for(String word : strs)
       {
           char []c = word.toCharArray();
           Arrays.sort(c);
           String data = String.valueOf(c);

          map.computeIfAbsent(data, n-> new ArrayList<>()).add(word);

       }
        List <List<String>> listOfList = new ArrayList<>(map.values());

        System.out.println(listOfList);

    }
}
