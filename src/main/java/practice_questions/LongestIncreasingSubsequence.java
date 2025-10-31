package practice_questions;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        int []a = {10, 22, 9, 33, 21, 50, 41, 60, 80};

        List<Integer> list = new ArrayList<>();

        if(a[0]<a[1])
        {
            list.add(a[0]);
        }

        for(int i=0; i<a.length-1; i++)
        {

            if(a[i]<a[i+1]) {
                list.add(a[i+1]);

            }
        }

        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
