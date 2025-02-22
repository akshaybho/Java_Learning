package Interview;

import java.util.HashMap;
import java.util.Map;

public class FreqWords {

    public static void main(String[] args) {

        String s = "it shall not attach any it liability on the originator or Zensar Technologies not Limited or it affiliates";

        Map <String, Integer> freqWords = new HashMap<>();

        String[] words = s.split(" ");

        for(String data : words)
        {
            if(freqWords.containsKey(data))
            {
                freqWords.put(data, freqWords.get(data)+1);
            }
            else
            {
                freqWords.put(data, 1);
            }
        }
        for(String word : freqWords.keySet())
        {
            System.out.println("word : "+word+" "+"repeats : "+freqWords.get(word));
        }
    }
}
