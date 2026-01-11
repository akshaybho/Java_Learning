package GFG.searching.arryas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLeaders {

    public static void main(String[] args) {

        int []a = {16, 17, 4, 3, 5, 2};

        List<Integer> list = new ArrayList<>();

        int n = a.length;
        int maxRight = a[n-1];
        list.add(maxRight);

        for(int i=n-2; i>=0; i--){

            if(a[i] > maxRight){
                maxRight = a[i];
                list.add(maxRight);
            }
        }
        Collections.reverse(list);


        System.out.println(list);
        }
    }

