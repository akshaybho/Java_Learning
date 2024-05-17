package TestJava;

public class RevSentence {

    public static void main(String[] args) {

        String s = "my name is akshay yaduraj bhogale";

        String []a = s.split(" ");
        String desired = "";
        for(int i=a.length-1; i>=0; i--)
        {
            desired = desired + " "+a[i];
        }
        String n = desired.trim();
        System.out.print(n);
    }
}
