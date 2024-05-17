package TestJava;

import java.util.HashMap;

public class FreqofChar {

    public static void main(String[] args) {

        String s = "akshay bhogale";
        HashMap <Character, Integer> freqMap = new HashMap<>();
        for(char c : s.toCharArray()) {

                if (freqMap.containsKey(c)) {
                    freqMap.put(c, freqMap.get(c) + 1);
                } else {
                    freqMap.put(c, 1);
                }

        }
        for(char b : freqMap.keySet())
        {
            System.out.println("character "+ b + " occures "+freqMap.get(b));
        }
    }
}
