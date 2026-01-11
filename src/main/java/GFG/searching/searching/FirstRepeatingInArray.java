package GFG.searching.searching;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingInArray {

    public static void main(String[] args) {

        int []arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int b : arr){

            if(map.containsKey(b)){

                map.put(b, map.getOrDefault(b, 0)+1);
            }
            else{
                map.put(b, 1);
            }
        }

        for(Map.Entry <Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){

                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
