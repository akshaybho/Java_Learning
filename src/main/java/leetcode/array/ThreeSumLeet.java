package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumLeet {

    public static void main(String[] args) {

        int []a = {-1, 0, 1, 2, -1, -4};
        List <List<Integer>> op = threeSum(a);
        System.out.println(op);
    }

    public static List<List<Integer>> threeSum(int []nums){

        List <List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum > 0){
                    k--;
                } else if (sum < 0) {
                    j++;
                }
                else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while(nums[j] == nums[j-1] && j<k){
                        j++;
                    }
                }
            }
        }
        return result;
    }
}
