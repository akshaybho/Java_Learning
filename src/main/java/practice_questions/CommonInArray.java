package practice_questions;

import java.util.HashSet;
import java.util.Set;

public class CommonInArray {

    public static void main(String[] args) {

        String []a = {"Article", "for", "Geeks", "for", "Geeks"};
        String []b = {"Article", "Geeks", "Geeks"};

        Set<String> commonElements = new HashSet<>();
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<b.length; j++)
            {
                if(a[i].equals(b[j]))
                {
                    commonElements.add(a[i]);

                }
            }
        }
        System.out.println(commonElements);
    }
}
