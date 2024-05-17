package TestJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreqofWords {

    public static void main(String[] args) {


        List<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("banana");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("grapes");

        String []words = fruits.toArray(new String[0]);

        Map<String, Integer> freqMap = new HashMap<>();

        Map <String, Integer> maxfreq = new HashMap<>();

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
        for(String text : freqMap.keySet())
        {

            System.out.println(" fruit "+text+" occures "+freqMap.get(text));


        }

       for(String str : fruits)
       {
           maxfreq.put(str, maxfreq.getOrDefault(str, 0)+1);
       }

       String mostRepeatedString = null;
       int maxFrequency = 0;
       for(Map.Entry<String, Integer> entry: maxfreq.entrySet())
       {
           if(entry.getValue()>maxFrequency)
           {
               mostRepeatedString = entry.getKey();
               maxFrequency = entry.getValue();
           }
       }
        System.out.println("Most repeated string: "+mostRepeatedString);
        System.out.println("Frequency: "+maxFrequency);



    }
}
