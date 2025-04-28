package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIterator {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<11; i++)
        {
            System.out.println("Enter numbers");
            list.add(i);
        }
        for(int i =0; i<list.size(); i++)
        {
            System.out.print(i+" ");
        }
    }
}
