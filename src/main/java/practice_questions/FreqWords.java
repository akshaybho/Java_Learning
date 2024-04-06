package practice_questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreqWords {
    public static void main(String[] args) {


        List<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("mango");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("banana");
        fruits.add("apple");

        String []words = fruits.toArray(new String[0]);

        Map<String, Integer> freqMap = new HashMap<>();
        for(String data : words)
        {
            if(freqMap.containsKey(data))
            {
                freqMap.put(data, freqMap.get(data)+1);
            }
            else
            {
                freqMap.put(data, 1);
            }
        }
        for(String b : freqMap.keySet())
        {
            System.out.println("word "+b+" occures "+freqMap.get(b));
        }

    }
}