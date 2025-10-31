package practice_questions;

public class BankOfAmerica {

    public static void main(String[] args) {

        String A = "abc";
        String B = "fdh";
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<A.length(); i++)
        {
            sb.append(A.charAt(index));
            sb.append(B.charAt(index));
            index++;
        }

        System.out.println(sb.toString());
    }
}
