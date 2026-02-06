package leetcode.greedy;

public class CostClimbingStairs {

    public static int minCostClimbingStairs(int [] cost){

        int prev2 = cost[0];
        int prev1 = cost[1];

        for(int i=2; i<cost.length; i++){

            int curr = cost[i] + Math.min(prev2, prev1);
            prev2 = prev1;
            prev1 = curr;
        }

        return Math.min(prev2, prev1);
    }

    public static void main(String[] args) {

        int []nums = {1,100,1,1,1,100,1,1,100,1};
        int result = minCostClimbingStairs(nums);
        System.out.println(result);
    }
}
