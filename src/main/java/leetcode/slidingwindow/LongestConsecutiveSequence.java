package leetcode.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int []arr){

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){

            set.add(arr[i]);
        }

        int longest = 0;
        for(int num : set){

            if(!set.contains(num -1)){

                int current = num;
                int length = 1;
                while(set.contains(current+1)){

                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }

    public static void main(String[] args) {

        int []nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(nums);
        System.out.println(result);
    }
}
