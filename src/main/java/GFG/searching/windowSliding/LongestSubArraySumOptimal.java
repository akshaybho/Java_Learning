package GFG.searching.windowSliding;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArraySumOptimal {

    public static void main(String[] args) {

        int []a = {10, 5, 2, 7, 1, -10};
        int k = 15;
        int res = 0;
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int end = 0; end < a.length; end++){

            sum +=a[end];

            if(sum == k){
                res = end + 1;
            }
            else if (map.containsKey(sum-k)) {

                res = Math.max(res, end - map.get(sum-k));
            }
            if(!map.containsKey(end)){
                map.put(a[end], end);
            }
        }
        System.out.println(res);
    }
}
