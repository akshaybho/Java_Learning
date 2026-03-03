package leetcode.array;

public class MaxConsecutiveOnes {

    public static int findMaxOnes(int []nums){

        int maxCount = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){

            if(nums[i] == 1){
                count++;
                maxCount = Math.max(count, maxCount);
            }
            else {
                count = 0;
            }

        }
        return maxCount;
    }

    public static void main(String[] args) {

        int []arr = {1, 0, 1, 1, 1, 0, 1, 1, 1};
        int result = findMaxOnes(arr);
        System.out.println(result);
    }
}
