package practice_questions;

public class CogniWalkIn {

    public static void main(String[] args) {

        System.out.println(expand("a1b2c4"));
        System.out.println(expand("a12b3c4"));

    }

    public static String expand(String input) {
        if (input == null) return "";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            int j = i + 1;
            StringBuilder number = new StringBuilder();

            while (j < input.length() && Character.isDigit(input.charAt(j))) {
                number.append(input.charAt(j));
                j++;
            }

            int h = 0;
                try {
                    int count = Integer.parseInt(number.toString());
                    h = count;
                } catch (NumberFormatException e) {

                }


            for (int k = 0; k < h; k++) {
                result.append(ch);
            }

            i = j - 1;
        }

        return result.toString();
    }
}