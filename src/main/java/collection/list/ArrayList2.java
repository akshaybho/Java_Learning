package collection.list;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
		
    	ArrayList <String> list = new ArrayList <String>();
    	list.add("mango");
    	list.add("apple");
    	list.add("banana");
    	list.add("grapes");
    	
    	System.out.println("Return element ="+list.get(1));
    	
    	list.set(2, "dates");
    	for (String fruit : list) {
    		System.out.println(fruit);
    	}
	}
}
