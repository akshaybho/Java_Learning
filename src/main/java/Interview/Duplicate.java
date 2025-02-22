package Interview;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

    public static void main(String[] args) {

        int []a = {1, 2, 3, 4, 5, 6, 2, 3, 4};

        Set <Integer> dupli = new HashSet<>();
        Set <Integer> seen = new HashSet<>();

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
        System.out.println(dupli);

    }
}
