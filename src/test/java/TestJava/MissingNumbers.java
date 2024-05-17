package TestJava;

import java.util.HashSet;
import java.util.Set;

public class MissingNumbers {

    public static void miss(int []a)
    {
        Set<Integer> set = new HashSet<Integer>();
        for(int num :a)
        {
            set.add(num);
        }
        int n = a.length+10;
        for(int i=0;i<n;i++)
        {
            if(!set.contains(i))
            {

                System.out.print(i+" ");
            }
        }

    }

    public static void main(String[] args) {
        int []b = {1,3,5,9,11,13,16};
        miss(b);
    }
}
