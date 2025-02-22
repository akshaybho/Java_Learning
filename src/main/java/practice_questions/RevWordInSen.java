package practice_questions;

public class RevWordInSen {
    static String reverseSent(String s)
    {
        String []words = s.split(" ");

        String rev = "";

        for(String data : words)
        {
            for(int i=data.length()-1; i>=0; i--)
            {
                rev = rev + data.charAt(i);

            }
            rev = rev +" ";

        }
        System.out.println(rev+" ");
        return rev;
    }

    public static void main(String[] args) {
        reverseSent("akshay yaduraj bhogale");
    }
}
