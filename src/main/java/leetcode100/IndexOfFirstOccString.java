package leetcode100;

public class IndexOfFirstOccString {

    public int strStr(String haystack, String needle)
    {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {

        IndexOfFirstOccString l = new IndexOfFirstOccString();
        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(l.strStr(haystack, needle));

        String a = "leetcode";
        String b = "leeto";

        System.out.println(l.strStr(a,b));
    }
}
