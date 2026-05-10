package leetcode.array;
/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.


Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]


Constraints:

1 <= nums.length <= 10^5
-2^31 <= nums[i] <= 2^31 - 1
0 <= k <= 10^5
 */

public class RotateArrayLeft {

    public static void main(String[] args) {

        int []arr = {1, 2, 3, 4, 5, 6, 7};
        rotateLeft(arr, 2);

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotateLeft(int []b, int k)
    {
        int n = b.length;
        k = k%n;

        reverse(b, 0, n-1);
        reverse(b, 0, k);
        reverse(b, k+1, n-1);
    }

    public static void reverse(int []a, int start, int end)
    {
        while(start<end)
        {
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;
            start++;
            end--;
        }
    }
}
