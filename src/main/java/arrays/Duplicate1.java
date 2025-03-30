package arrays;

import java.util.HashSet;
import java.util.Set;

public class Duplicate1 {
     
	public static void main(String[] args) {
		
		int []arr = {0,0,1,1,1,2,2,3,3,4};
	
		Set <Integer> seen = new HashSet<>();
		Set <Integer> dupli = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(seen.contains(arr[i])) {
				dupli.add(arr[i]);
			}
			else {
				seen.add(arr[i]);
			}
		}System.out.println("duplicate = "+dupli);
		System.out.println(seen);
	}
}
