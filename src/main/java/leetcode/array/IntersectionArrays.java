package leetcode.array;

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
