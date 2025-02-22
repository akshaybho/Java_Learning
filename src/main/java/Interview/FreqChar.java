package Interview;

import java.util.HashMap;
import java.util.Map;

public class FreqChar {

    public static void main(String[] args) {

        String s = "casbasvmdfvbvbfvfvjbfjvhbjbvjbjh";

        Map <Character, Integer> freqMap = new HashMap<>();

        char[] a = s.toCharArray();

        for(char c: a)
        {
            if(freqMap.containsKey(c))
            {
                freqMap.put(c, freqMap.get(c)+1);
            }
            else
            {
                freqMap.put(c, 1);
            }
        }

        for(char b : freqMap.keySet())
        {
            System.out.println("character "+b+" repeats ="+freqMap.get(b));
        }


    }
}
