package leetcode.recursion;

public class SortedArray {

    public static void main(String[] args) {

        int []arr = {1, 2, 3, 6, 5};
        boolean result = sortedArray(arr, 0, 1);
        System.out.println(result);
    }

    public static boolean sortedArray(int []nums, int left, int right){

        //if we reach to end of the array then the array is sorted
        if(right >= nums.length){
            return true;
        }

        //if our left side is greater than right side then obviously array is not sorted
        if(nums[left] >= nums[right]){
            return false;
        }

        //move to the next pair of elements
        return sortedArray(nums, left+1, right+1);
    }
}
