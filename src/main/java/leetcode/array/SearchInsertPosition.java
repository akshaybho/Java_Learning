package leetcode.array;

import java.util.Arrays;

public class SearchInsertPosition {

    public static void main(String[] args) {

        int []nums = {1, 3, 5, 6};
        int target = 2;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==target)
            {
                System.out.println(i);
            }
        }

        int []a = new int[nums.length+1];
        a[0] = target;
        int index = 0;
        for(int i=1; i<=nums.length; i++)
        {
            a[i] = nums[index];
            index++;
        }

        Arrays.sort(a);

        for(int i=0; i<a.length; i++)
        {
            if(a[i]==target)
            {
                System.out.println(i);
            }
        }
    }
}
