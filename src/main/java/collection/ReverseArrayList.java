package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
       
	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList <String>();
		
		list.add("mango");
		list.add("apple");
		list.add("banana");
		list.add("grapes");
		list.add("dates");
		

		
		Collections.reverse(list);
		
		System.out.println(list);
	}
}
