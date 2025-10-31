package practice_questions;

public class Incedo_Q {

    public static void main(String[] args) {

        String s = "abcdef";
        int part = 3;


        for(int i=0; i<=s.length()-part; i++)
        {
            System.out.println(s.substring(i, i+part));
        }
    }
}
