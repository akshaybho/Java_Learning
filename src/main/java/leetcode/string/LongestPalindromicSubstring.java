package leetcode.string;

public class LongestPalindromicSubstring {


    public static String longestPalindrome(String str){

        if(str == null && str.length() < 2) return str;

        int start = 0, end =0;

        for(int i=0; i<str.length(); i++)
        {
            //Odd length palindrome
            int len1 = expandFromCenter(str, i, i);

            //Even length palindrome
            int len2 = expandFromCenter(str, i, i+1);

            int len = Math.max(len1, len2);

            if(len > end - start){

                start = i - (len - 1)/2;
                end = i + len/2;
            }

        }
        return str.substring(start, end + 1);

    }

    private static int expandFromCenter(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1; // length of the palindrome
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // bab or aba
        System.out.println(longestPalindrome("cbbd"));  // bb
        System.out.println(longestPalindrome("a"));     // a
        System.out.println(longestPalindrome("ac"));    // a
    }
}
