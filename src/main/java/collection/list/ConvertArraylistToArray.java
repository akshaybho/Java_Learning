package collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraylistToArray {
	
	public static void main(String[] args) {
		
		ArrayList <String> newlist = new ArrayList <String> (Arrays.asList("Akshay","Sagar","Onkar","Saloni","Akash","Ashish"));
		
		Object []arr = newlist.toArray();
		
		System.out.println(Arrays.toString(arr));
	}

}
