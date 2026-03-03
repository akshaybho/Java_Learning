package leetcode.array;

public class MoveZeros {

    public static void main(String[] args) {

        int []nums = {0, 0, 0, 1, 3, -2};

        int index = 0;
        for(int i=0; i<nums.length; i++){

            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i=index; i<nums.length; i++){
            nums[i]=0;
        }
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
