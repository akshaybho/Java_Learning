package string;

public class LeetCode_1 {

    public int strStr(String haystack, String needle)
    {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {

        LeetCode_1 l = new LeetCode_1();
        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(l.strStr(haystack, needle));

        String a = "leetcode";
        String b = "leeto";

        System.out.println(l.strStr(a,b));
    }
}
