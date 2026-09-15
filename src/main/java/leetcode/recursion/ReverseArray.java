package leetcode.recursion;

public class ReverseArray {

    public static void main(String[] args) {

        int []arr = {1, 2, 3, 4, 5};

        int []result = reverseArray(arr);

        for(int i=0; i<result.length; i++){

            System.out.print(result[i]+" ");
        }
    }

    public static int[] reverseArray(int []nums){

        reverse(nums, 0, nums.length-1);

        return nums;
    }

    private static void reverse(int []nums, int left, int right){

        if(left >= right){
            return;
        }

        //swap
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        reverse(nums, left+1, right-1);
    }
}
