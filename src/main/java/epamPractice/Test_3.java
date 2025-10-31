package epamPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_3 {

    public static void main(String[] args) {

        String s = "5768mastercard1342";

        List<Character> numbers = new ArrayList<>();

        for(char c : s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                numbers.add(c);
            }
        }
        Collections.sort(numbers);

        StringBuilder sb = new StringBuilder();
        int index = 0;

        for(char d : s.toCharArray())
        {
            if(Character.isDigit(d))
            {
                sb.append(numbers.get(index));
                index++;
            }
            else
            {
                sb.append(d);
            }
        }
        System.out.println(sb.toString());
    }
}
