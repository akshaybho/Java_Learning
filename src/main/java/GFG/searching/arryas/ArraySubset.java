package GFG.searching.arryas;

import java.util.HashMap;
import java.util.Map;

public class ArraySubset {

    public static void main(String[] args) {

        int []c = {11, 7, 1, 13, 21, 3, 7, 3};
        int []d = {11, 3, 7, 1, 7};
        boolean result = isSubset(c, d);
        System.out.println(result);
    }

    public static boolean isSubset(int []a, int []b){

        Map<Integer, Integer> freq = new HashMap<>();

        for(int i=0; i<a.length; i++){

                freq.put(a[i], freq.getOrDefault(a[i], 0)+1);
        }

        for(int i=0; i<b.length; i++){

          if(!freq.containsKey(b[i]) || freq.get(b[i])==0){
             return false;
           }
            freq.put(b[i], freq.get(b[i]) - 1);
        }
        return true;
    }
}
