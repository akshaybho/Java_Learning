package collection.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionArray {

    public static void main(String[] args) {

        int []c = {1,2,3,2,1};
        int[] d = {3, 2, 2, 3, 3, 2};

        ArrayList <Integer> list = findUnion(c, d);
        for(int number : list)
        {
            System.out.println(number+" ");
        }
    }

    static ArrayList<Integer> findUnion(int[]a, int []b)
    {
        HashSet <Integer> st = new HashSet<>();

        for(int num: a)

            st.add(num);


        for(int num: b)

            st.add(num);


        ArrayList <Integer> res = new ArrayList<>();

        for(int it: st)

            res.add(it);

        return res;
    }
}
