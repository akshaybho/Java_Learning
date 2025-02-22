package practice_questions;

public class Interview_1 {

    public static void main(String[] args) {


        String s = "7821";
        int sum = 0;
        try {
            for (int i = 0; i < s.length(); i++) {

                int n = Integer.parseInt(String.valueOf(s.charAt(i)));
                sum = sum + n;

            }
            System.out.println(sum);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
