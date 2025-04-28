package collection.Map;

import java.util.HashMap;

public class Hashmap {
	
	public static void main(String[] args) {
		
		HashMap <String , Integer> ages = new HashMap <>();
		ages.put("akshay", 29);
		ages.put("sagar", 26);
		ages.put("onkar", 28);
		
		System.out.println("size of hashmap="+ages.size());
		
		int akshayage = ages.get("akshay");
		System.out.println("akshay age : "+akshayage);
		
		if(ages.containsKey("onkar")) {
			System.out.println("onkar is in the hashmap");
		}
		for(String name : ages.keySet()) {
			int age = ages.get(name);
			System.out.println(name + " is " + age + " years old");
		}
	}

}
