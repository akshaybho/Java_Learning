package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {

        int []input = {2, 3, 6, 7};
        int goal = 7;
        List<List<Integer>> output = combinationSum(input, goal);
        System.out.println(output);

    }
    public static List<List<Integer>> combinationSum(int []candidates, int target){
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, 0, 0, target, new ArrayList<>(), result);
        return result;
    }

    public static void helper(int []candidates, int ind, int sum, int target,
                       List<Integer>arr, List<List<Integer>>list){


        if(sum == target){
            list.add(new ArrayList<>(arr));
            return;
        }
        for(int i=ind; i<candidates.length; i++){
            if (sum + candidates[i] > target) break;
            arr.add(candidates[i]);
            helper(candidates, i, sum+candidates[i], target, arr, list);// Inside the recursion has its own for loop
            arr.remove(arr.size()-1);
        }
    }
}
