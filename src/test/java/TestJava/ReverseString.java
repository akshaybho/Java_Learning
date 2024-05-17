package TestJava;

public class ReverseString {


    public static String rev(String s)
    {
        String rev = "";
        for(int i=s.length()-1; i>=0; i--)
        {
             rev = rev + s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String b = rev("akshay");
        System.out.println(b);
    }
}
