package practice_questions;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurenceChar {

    public static char maximumOccurencechar(String s)
    {
        Map<Character, Integer> maxMap = new HashMap<>();

        for(char c : s.toCharArray())
        {
            maxMap.put(c, maxMap.getOrDefault(c, 0)+1);
        }

        char maxChar = ' ';
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : maxMap.entrySet())
        {

            char currentChar = entry.getKey();
            int currentFrequency = entry.getValue();

            if(currentFrequency > maxFrequency)
            {
                maxChar = currentChar;
                maxFrequency = currentFrequency;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        String d = "hello world";
        char max = maximumOccurencechar(d);
        System.out.println("character with maximum occurrence "+max);
    }
}
