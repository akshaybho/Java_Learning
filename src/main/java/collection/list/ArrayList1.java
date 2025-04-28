package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList <String> ();
		
		list.add("Akshay");
		list.add("Onkar");
		list.add("bhogale");
		list.add("robot");
		list.add("cybage");
		
		Iterator <String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(list);
	}

}
