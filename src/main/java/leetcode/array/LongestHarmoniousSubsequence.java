package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {

    public static void main(String[] args) {

        int[] arr = {3, 4, 3, 3, 3, 3, 4};

        int result = findLHS(arr);
        System.out.println(result);
    }

    public static int findLHS(int []a)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : a)
        {
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        int maxLen = 0;

        for(int key : map.keySet())
        {
            if(map.containsKey(key+1))
            {
                int length  = map.get(key) + map.get(key+1);
                maxLen = Math.max(maxLen, length);
            }
        }
        return maxLen;
    }
}
