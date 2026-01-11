package GFG.searching.searching;

import java.util.ArrayList;
import java.util.List;

public class LargestThree {

    /*Given an array arr[], the task is to find the top three largest distinct integers present in the array.
      Note: If there are less than three distinct elements in the array,
      then return the available distinct numbers in descending order.

      Input: arr[] = [10, 4, 3, 50, 23, 90]
      Output: [90, 50, 23]

      Input: arr[] = [10, 9, 9]
      Output: [10, 9]
      There are only two distinct elements

      Input: arr[] = [10, 10, 10]
      Output: [10]
      There is only one distinct element

      Input: arr[] = []
      Output: []
     */
    public static List<Integer> get3largest(int[] numbers) {

        int fst = Integer.MIN_VALUE, sec = Integer.MIN_VALUE, thd = Integer.MIN_VALUE;

        for (int x : numbers) {

            if (x > fst) {

                thd = sec;
                sec = fst;
                fst = x;
            } else if (x > sec && x != fst) {
                thd = sec;
                sec = x;
            } else if (x > thd && x != sec && x != fst) {
                thd = x;
            }
        }

        List<Integer> res = new ArrayList<>();
        if (fst == Integer.MIN_VALUE) return res;
        res.add(fst);
        if (sec == Integer.MIN_VALUE) return res;
        res.add(sec);
        if (thd == Integer.MIN_VALUE) return res;
        res.add(thd);

        return res;
    }

    public static void main(String[] args) {

        int []arr = {10, 4, 3, 50, 23, 90};
        List <Integer> result = get3largest(arr);
        for(int num : result){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
