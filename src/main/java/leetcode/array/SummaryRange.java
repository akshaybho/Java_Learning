package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange {

    public static List<String> summaryRanges(int []nums){

        List<String> summary = new ArrayList<>();

        for(int i=0; i<nums.length;){

            int start = i, end = i;
            while (end + 1 < nums.length && nums[end]+1 == nums[end+1]){
                end++;
            }
            if(end > start){
                summary.add(nums[start] + "-->" + nums[end]);
            } else if (start == end) {
                summary.add(String.valueOf(nums[start]));
            }
            i = end + 1;
        }
        return summary;
    }

    public static void main(String[] args) {

        int []arr = {0,2,3,4,6,8,9};
        List<String> list = summaryRanges(arr);
        System.out.println(list);
    }
}
