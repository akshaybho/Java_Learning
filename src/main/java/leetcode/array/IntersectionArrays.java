package leetcode.array;
/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArrays {

    public static void main(String[] args) {

        int[] a = {1, 2, 2, 1};
        int[] b = {2, 2};

        int[] result = intersection(a, b);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersection(int []nums1, int []nums2)
    {
        Set <Integer> first = new HashSet<>();
        for(int num : nums1)
        {
            first.add(num);
        }
        Set <Integer> second = new HashSet<>();
        for(int num : nums2)
        {
            if(first.contains(num))
            {
                second.add(num);
            }
        }
        int []output = new int[second.size()];
        int index = 0;
        for(int num : second)
        {
            output[index++] = num;
        }
        return output;
    }
}
