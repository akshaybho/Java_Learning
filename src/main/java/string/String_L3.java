package string;

public class String_L3 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Akshay");
        sb.append("Bhogale");
        System.out.println(sb);

        sb.insert(1, "Boss");
        System.out.println(sb);

        StringBuffer sr = new StringBuffer("akshaybhogale");
        sr.reverse();
        System.out.println(sr);

    }
}
