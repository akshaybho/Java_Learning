package TestJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MasterCardTest {

    public static void main(String[] args) {

        String s = "8976Akshay1234Bhogale";
        System.out.println(sortNumbers(s));
    }
    public static String sortNumbers(String str)
    {
        List<Character> numbers = new ArrayList<>();
        for(char c : str.toCharArray())
        {
            if(Character.isDigit(c))
            {
                numbers.add(c);
            }
        }
        numbers.sort(null);
        System.out.println(numbers+" ");

        StringBuilder result = new StringBuilder();
        int numIndex = 0;

        for(char d : str.toCharArray())
        {
            if(Character.isDigit(d))
            {
                result.append(numbers.get(numIndex++));
            }
            else
            {
                result.append(d);
            }
        }
        return result.toString();
    }

}
