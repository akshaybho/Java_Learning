package leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

Example 1:
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
 */

public class FindAllAnagrams {

   public static List<Integer> findAnagrams(String s, String p){

       int []sCount = new int[26];
       int []pCount = new int [26];
       List<Integer> result = new ArrayList<>();

       for(char c : p.toCharArray()){

           pCount[c - 'a']++;
       }

       for(int i=0; i<s.length(); i++){

           sCount[s.charAt(i) - 'a']++;

           if(i >= p.length()){

               sCount[s.charAt(i - p.length()) - 'a']--;
           }

           if(Arrays.equals(sCount, pCount)){
               result.add(i - p.length() + 1);
           }
       }
       return result;
   }

    public static void main(String[] args) {

       String str = "cbaebabacd";
       String part = "abc";
       List <Integer> list = findAnagrams(str, part);
        System.out.println(list);
    }
}
