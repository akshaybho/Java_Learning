package collection;

import java.util.HashMap;

public class Hashmap1 {
	
	public static void main(String[] args) {
		
		HashMap <Integer, String> map = new HashMap <Integer, String>();
		map.put(1, "akshay");
		map.put(2, "saloni");
		map.put(3, "amit");
		map.put(3, "neha");
		
		for(Integer boss : map.keySet()) {

			int num = Integer.parseInt(map.get(boss));

			System.out.println();
		}
	}

}
