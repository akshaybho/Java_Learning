package practice_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MasterCard {

    public static void main(String[] args) {

        String s = "1234master87569";
        System.out.println(sortNumbersDescending(s));
    }

    public static String sortNumbersDescending(String str)
    {
        //Extract all numbers from the string
        List<Character> numbers = new ArrayList<>();
        for(char c : str.toCharArray())
        {
            if(Character.isDigit(c))
            {
                numbers.add(c);
            }
        }
        numbers.sort(Collections.reverseOrder());
        System.out.print(numbers+" ");
        System.out.println();


        StringBuilder sb = new StringBuilder();
        int numIndex = 0;

        for(char c : str.toCharArray())
        {
            if(Character.isDigit(c)) {
                sb.append(numbers.get(numIndex++));

            }
            else
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
