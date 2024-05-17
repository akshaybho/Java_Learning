package TestJava;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void duplicates(int []a)
    {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dupli = new HashSet<>();
        for(int i=0; i<a.length; i++)
        {
            if(seen.contains(a[i]))
            {
                dupli.add(a[i]);
            }
            else
            {
                seen.add(a[i]);
            }
        }
        System.out.print(dupli+" ");
    }

    public static void main(String[] args) {

        int []b = {1,2,3,5,6,3,7,9,1,4,6,5};
        duplicates(b);
    }
}
