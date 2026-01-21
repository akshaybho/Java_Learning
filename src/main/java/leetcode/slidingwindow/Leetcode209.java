package leetcode.slidingwindow;
/*Given an array of positive integers nums and a positive integer target,
return the minimal length of a subarray whose sum is greater than or equal to target.
If there is no such subarray, return 0 instead.

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 */

public class Leetcode209 {

    public static void main(String[] args) {

        int []nums = {1,1,1,1,1,1,1,1};
        int target = 11;

        int sum = 0;
        int start = 0;
        int minSubLen = Integer.MAX_VALUE;

        for(int end = 0; end < nums.length; end++) {

            sum += nums[end];

            while(sum >= target){

                minSubLen = Math.min(minSubLen, end-start+1);
                sum -= nums[start];
                start++;
            }
        }
        int result = (minSubLen == Integer.MAX_VALUE) ? 0 : minSubLen;
        System.out.println(result);
    }
}
