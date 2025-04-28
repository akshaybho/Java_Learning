package collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

    public static void main(String[] args) {

        HashMap <Integer, String> map = new HashMap<>();

        map.put(1, "Mango");
        map.put(2, "Banana");
        map.put(3, "Grapes");
        map.put(4, "Orange");
        map.put(5, "Apple");
        map.put(5, "Watermelon");


        map.remove(5);
        map.replace(2, "Pinapple");
        for(Map.Entry <Integer, String> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }

}
