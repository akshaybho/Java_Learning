package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

       Map<Integer, Integer> map = new HashMap<>();

       for(int i=0; i< nums.length; i++){

           if(map.containsKey(nums[i])){

               int prevIndex = map.get(nums[i]);

               if(i - prevIndex <= k){
                   return true;
               }
           }
           map.put(nums[i], i);
       }
       return false;
    }

    public static void main(String[] args) {

        int []arr = {1,2,3,1};
        boolean status = containsNearbyDuplicate(arr, 3);
        System.out.println(status);
    }
}
