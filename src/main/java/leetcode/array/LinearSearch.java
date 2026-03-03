package leetcode.array;

public class LinearSearch {

    public static int linearSearch(int []nums, int target){

        int firstOccurence = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){

            if(nums[i] == target){

                firstOccurence = Math.min(firstOccurence, i);

                return firstOccurence;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int []arr = {1, 3, 5, -4, 1};
        int goal = 1;
        int result = linearSearch(arr, goal);
        System.out.println(result);
    }
}
