package practice_questions;

import java.util.HashMap;
import java.util.Map;

class FirstNonRepeatingChar {

    public static void nonRepeated(String s)
    {
        Map<Character, Integer> freqMap = new HashMap<>();

        char []c = new char[s.length()];
        for(char d : s.toCharArray())
        {
            if(freqMap.containsKey(d))
            {
                freqMap.put(d, freqMap.get(d)+1);
            }
            else
            {
                freqMap.put(d, 1);
            }
        }
        for(char b : freqMap.keySet())
        {

            if(freqMap.get(b)<2)
            {

            }
        }


    }

    public static void main(String[] args) {
        nonRepeated("swiss");
    }
}
