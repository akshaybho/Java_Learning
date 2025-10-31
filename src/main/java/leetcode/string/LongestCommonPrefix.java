package leetcode.string;

import java.util.Arrays;

public class LongestCommonPrefix {

    /*Write a function to find the longest common prefix string amongst an array of strings.
      If there is no common prefix, return an empty string "".*/
    public static String longestCommonPrefix(String[] s)
    {
        if(s == null || s.length == 0)
        {
            return "";
        }
        //sort the arrays
        Arrays.sort(s);

        String first = s[0];
        String last = s[s.length-1];

        int i =0;
        while( i < first.length() && i<last.length() && first.charAt(i) == last.charAt(i))
        {
            i++;
        }
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String [] b = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(b));
    }
}
