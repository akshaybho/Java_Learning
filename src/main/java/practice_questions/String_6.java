package practice_questions;

public class String_6{
    int count =0;
    public char[] repeated(String s) {

        char[] c = s.toCharArray();

        int count = 1;
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                   count++;
                    if(count>1){
                        System.out.println(c[i]+" ");
                }

                }
            }
        }
    return c;}

    public static void main(String[] args) {
        String_6 d = new String_6();
        d.repeated("akshay");
    }
}
