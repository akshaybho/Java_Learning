package practice_questions;

import java.util.HashMap;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String s = "I am giving interviews";
        HashMap <Character, Integer> freqMap = new HashMap<>();

        //Iterate through each character of the string
        for(char c : s.toCharArray())
        {
            //Check if the character is already in the map
            if(freqMap.containsKey(c))
            {
                //If it is, increment its count
                freqMap.put(c, freqMap.get(c)+1);
            }
            else
            {
                //If its not,add it to the map with count 1
                freqMap.put(c, 1);
            }
        }
        //print frequency of each character
        for(char b : freqMap.keySet())
        {
            System.out.println(" Character " + b + " occures " + freqMap.get(b));
        }

        StringBuilder result = new StringBuilder();

        for(int d : freqMap.values())
        {
            result.append(d);
        }
        System.out.println(result.toString());
    }
}
