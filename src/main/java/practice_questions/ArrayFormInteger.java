package practice_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormInteger {

    public static void getArray(int[]a, int num)
    {
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<a.length; i++)
        {
            sb.append(a[i]);
        }
        String numbers = sb.toString();

        try
        {
            int k = Integer.parseInt(numbers);
            sum = k + num;
        }
        catch(NumberFormatException e)
        {
            e.printStackTrace();
        }
        System.out.println(sum);
        List<Integer> array = new ArrayList<Integer>();
        while(sum>0)
        {
            int b = sum%10;
            sum = sum/10;
            array.add(b);
        }
        Collections.reverse(array);
        System.out.println(array);
    }

    public static void main(String[] args) {

        getArray(new int[]{2,1,5}, 806);
    }
}
