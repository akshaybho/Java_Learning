package practice_questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {

        String s = "abcdabcbb";

        int start =0, end =0;
        int max =0;

        List<Character> list = new ArrayList<>();

        while(end<s.length())
        {
            if(!list.contains(s.charAt(end)))
            {
                list.add(s.charAt(end));
                end++;
                max = Math.max(max, list.size());
            }
            else
            {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        System.out.println(max);


    }
}
