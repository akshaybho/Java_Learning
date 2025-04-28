package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_1 {

    public static void main(String[] args) {

        List <Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(18);
        list.add(2);
        list.add(15);

        int minimum = Collections.min(list);
        int maximum = Collections.max(list);

        if(minimum == maximum)
        {
            System.out.println("All elements are equal");
        }
        else
        {
            System.out.println("Min value of our list : "+minimum);
            System.out.println("Max value of our list : "+maximum);
        }
    }
}
