package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /*Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
     */

    public static int majorityElement(int []nums){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int []a = {2, 2, 1, 1, 1, 2, 2};
        int number = majorityElement(a);
        System.out.println(number);
    }
}
