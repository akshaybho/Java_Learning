package GFG.searching.arryas;

import java.util.ArrayList;
import java.util.List;

public class SubArraySum {

    static ArrayList<Integer> subArraySum(int []arr, int target){

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int start = 0;
        for(int end=0; end<arr.length; end++){

                 sum += arr[end];
            while (sum > target && start <= end) {
                sum = sum - arr[start];
                start++;
            }

            if(sum == target){
                list.add(start+1);
                list.add(end+1);
                return list;
            }

        }
        int a = -1;
        list.add(a);
        return list;
    }

    public static void main(String[] args) {
        int []a = {1, 2, 6, 7, 5};
        int goal = 12;
        List <Integer> result = subArraySum(a, goal);
        System.out.println(result);
    }
}
