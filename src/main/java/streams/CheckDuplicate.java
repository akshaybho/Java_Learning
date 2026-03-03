package streams;

// Check duplicate character in given string if found then true else false
public class CheckDuplicate {

    public static void main(String[] args) {

        String s = "abcde";
        boolean hasDuplicate = s.chars()
                .distinct()
                .count() != s.length();
        System.out.println(hasDuplicate);
    }
}
