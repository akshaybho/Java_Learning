package streams;

public class CheckDuplicate {

    public static void main(String[] args) {

        String s = "abcde";
        boolean hasDuplicate = s.chars()
                .distinct()
                .count() != s.length();
        System.out.println(hasDuplicate);
    }
}
