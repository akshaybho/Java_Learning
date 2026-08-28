package leetcode.string;

import java.util.Arrays;

public class LongestCommonPrefix {

    /*Write a function to find the longest common prefix string amongst an array of strings.
      If there is no common prefix, return an empty string "".*/
    public static String longestCommonPrefix(String[] s)
    {

        StringBuilder result = new StringBuilder();

        //sort the arrays
        Arrays.sort(s);

        String first = s[0];
        String last = s[s.length-1];

        for(int i=0; i<first.length(); i++){

            if(first.charAt(i) != last.charAt(i)) break;

            result.append(first.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String [] b = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(b));
    }
}
