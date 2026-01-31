package leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasket {

    public static int totalFruit(int []fruits){

        int left = 0;
        int maxLen = 0;

        // fruit -> key, count -> value
        Map<Integer, Integer> map = new HashMap<>();

        for(int right = 0; right < fruits.length; right++){

            //add fruit to the basket
            map.put(fruits[right], map.getOrDefault(fruits[right], 0)+1);

            //remove fruits from left side when map size > 2
            while(map.size() > 2){

                map.put(fruits[left], map.get(fruits[left])-1);

                if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }

    public static void main(String[] args) {

        int []fruit = {1,2,3,2,2};
        int result = totalFruit(fruit);
        System.out.println(result);
    }
}
