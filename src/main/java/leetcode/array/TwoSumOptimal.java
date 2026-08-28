package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimal {

    public static void main(String[] args) {

        int []arr = {3, 2, 4};
        int aim = 6;

        int []result = twoSum(arr, aim);

        for(int i=0; i<result.length; i++){

            System.out.print(result[i]+" ");
        }
    }

    public static int[] twoSum(int []nums, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            int complement = target - nums[i];

            if(map.containsKey(complement)){

                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalStateException("No solution found");
    }
}
