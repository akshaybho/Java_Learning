package practice_questions;

public class TaoDigital {

    public static void main(String[] args) {

        String input = "aabbbcaaabbcc";
        //output = a2b3c1a3b2c2
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                sb.append(input.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(input.charAt(input.length() - 1));
        sb.append(count);

        System.out.println(sb.toString());
    }
    }


