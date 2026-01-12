package leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public static void main(String[] args) {

        int []a = {10, 1, 2, 7, 6, 1, 5};
        int goal = 8;
        List<List<Integer>> output = generateSubsets(a, goal);
        System.out.println(output);

    }

    public static List<List<Integer>> generateSubsets(int []candidates, int target){

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

        for(int i = ind; i< candidates.length; i++){

            if(sum + candidates[i] > target) break;

            if(i > ind && candidates[i] == candidates[i-1]) continue;
            arr.add(candidates[i]);
            helper(candidates, i+1, sum+candidates[i], target, arr, list);
            arr.remove(arr.size()-1);
        }
    }
}
