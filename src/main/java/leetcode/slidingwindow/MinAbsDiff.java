package leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsDiff {

    public static void main(String[] args) {

        int []arr = {3,8,-10,23,19,-4,-14,27};

        Arrays.sort(arr);


        List<List<Integer>> second = new ArrayList<>();
        int minDiff = arr[1] - arr[0];

        for(int i=1; i<arr.length-1; i++){

            int diff = Math.abs(arr[i+1] - arr[i]);
            minDiff = Math.min(diff, minDiff);
        }

        for(int i=0; i<arr.length-1; i++){

            int temp = Math.abs(arr[i] - arr[i+1]);
            if(temp == minDiff){

                second.add(Arrays.asList(arr[i], arr[i+1]));
            }

        }

        System.out.println(second);
    }
}
