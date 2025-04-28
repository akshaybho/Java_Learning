package collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
	
	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList <String>();
		list.add("mango");
		list.add("banana");
		list.add("apple");
		list.add("dates");
		list.add("grapes");
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
