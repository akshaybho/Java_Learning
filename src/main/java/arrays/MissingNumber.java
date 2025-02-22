package arrays;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {

        int []a = {1,2,3,5,7,8,12,13,14,15,17,19,22,23,24,25,27,28};

        int max = a[0];
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<=a.length; j++)
            {
                if(a[i]>max)
                {
                    max = a[i];
                }
            }
        }
       int []b = new int[max];
        for(int k=0; k<b.length; k++)
        {
            b[k] = max--;
        }

        int length = a.length+b.length;
        int []c = new int[length];

        for(int i=0; i<a.length; i++)
        {
           c[i] = a[i];
        }

        for(int j=0; j<b.length; j++)
        {
            c[a.length+j] = b[j];
        }

        Map <Integer, Integer> num = new HashMap<>();

        for(int i=0; i<c.length; i++)
        {
            if(num.containsKey(c[i]))
            {
                num.put(c[i], num.get(c[i])+1);
            }
            else
            {
                num.put(c[i], 1);
            }
        }
        for(int h : num.keySet())
        {
            if(num.get(h)==1)
            {
                System.out.print(h+" ");
            }
        }

    }

}
