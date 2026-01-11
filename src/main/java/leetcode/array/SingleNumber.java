package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.getOrDefault(nums[i], map.get(nums[i]))+1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int n : map.keySet()) {

            System.out.println(n+"======>"+map.get(n));

            if(map.get(n) == 1){
                System.out.println(n);
            }
        }


    }
}
