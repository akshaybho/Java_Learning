package practice_questions;

import java.util.ArrayList;
import java.util.List;

public class CommonEle {

    public void common(int []a, int[]b){

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i=0; i<a.length; i++)
        {
            list1.add(a[i]);
        }

        for(int i=0; i<b.length; i++)
        {
            if(list1.contains(b[i])){
                list2.add(b[i]);
            }
        }

        System.out.println(list2);

    }

    public static void main(String[] args) {
        CommonEle c = new CommonEle();
        int []d = {1,5,10,15,25};
        int []e = {5,6,9,15,1,8};
        c.common(d, e);
    }
}
