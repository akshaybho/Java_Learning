package leetcode.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingWord {

    public static void main(String[] args) {

        String s = "id42 id7 id42 id9 id7 id10";

        LinkedHashMap <String, Integer> lhm = new LinkedHashMap<>();

        String []words = s.split(" ");

        for(String data : words)
        {
            if(lhm.containsKey(data))
            {
                lhm.put(data, lhm.get(data)+1);
            }
            else
            {
                lhm.put(data, 1);
            }
        }

        String []arr = new String[words.length];
        int index = 0;
        for(Map.Entry<String, Integer> entry : lhm.entrySet())
        {
            if(entry.getValue()<2)
            {
                arr[index] = entry.getKey();
                index++;
            }
        }

        System.out.println(arr[0]);
    }
}
