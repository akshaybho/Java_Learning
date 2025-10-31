package tricky;

public class Demo_2 {

    public static void main(String[] args) {

        String s = "helloworldmadam";

        String result = longestPalindrome(s);
        System.out.println(result);
    }

    public static String longestPalindrome(String str)
    {
       int start = 0, end = 0;
       for(int i=0; i<str.length(); i++)
       {
           int len1 = expandFromCentre(str, i, i);
           int len2 = expandFromCentre(str, i, i+1);
           int maxLen = Math.max(len1, len2);
           if(maxLen > end - start)
           {
               start = i - (maxLen -1)/2;
               end = i + maxLen/2;
           }
       }
       return str.substring(start, end+1);
    }
    public static int expandFromCentre(String b, int left, int right)
    {
        //dabad
        while(left >=0 && right<b.length() && b.charAt(left) == b.charAt(right))
        {
            left --;
            right ++;
        }
        return right-left-1;
    }
}
