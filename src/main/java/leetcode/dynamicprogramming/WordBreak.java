package leetcode.dynamicprogramming;

import java.util.*;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {

        Set<String> wordSet = new HashSet<>(wordDict);

        int maxLen = 0;
        for(String word : wordDict){

             maxLen = Math.max(maxLen, word.length());
        }

        int n = s.length();
        boolean []dp = new boolean[n+1];

        dp[0] = true;

        for(int i=1; i<=n; i++){
            for(int j=i-1; j>=Math.max(0, i-maxLen); j--){
                if(dp[j] && wordSet.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        /*We are trying to split the string into two parts:
          prefix | current word
          0..j-1 | j..i-1
          We want:
         prefix is already valid
          current part is a dictionary word*/
        return dp[n];
    }

    public static void main(String[] args) {

        String str = "catsandog";
        List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");
        boolean status = wordBreak(str, wordDict);
        System.out.println(status);

    }
}
