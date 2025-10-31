package leetcode.array;

public class JumpGame {

    public static void main(String[] args) {

        int []a = {2, 3, 1, 1, 4};
        boolean status = canJump(a);
        System.out.println(status);
    }

    public static boolean canJump(int []nums){

        int goal = nums.length - 1;

        for(int i = nums.length-2; i>=0; i--){

            if(i + nums[i] >= goal){
                goal = i;
            }
        }
        if(goal == 0){
            return true;
        }
        return false;
    }
}
