package leetcode.recursion;

//Check if String is Palindrome or Not

public class Palindrome {

    public static void main(String[] args) {

        String s ="aaba";
        boolean res = palindromeCheck(s);
        System.out.println(res);
    }
    public static boolean palindromeCheck(String s){

         return isPalindrome(s, 0, s.length()-1);
    }

    private static boolean isPalindrome(String s, int left, int right){

        if(left >= right) return true;

        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return isPalindrome(s, left+1, right-1);
    }
}
