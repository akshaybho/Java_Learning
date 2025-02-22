package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda_2 {
	
	public static void main(String[] args) {
		
		List <String> names = new ArrayList<>();
		names.add("akshay");
		names.add("vishal");
		names.add("charu");
		names.add("aakriti");
		names.add("sunil");
		names.add("anamika");
		names.add("kajol");
		names.forEach((n)->{System.out.println(n);});
		System.out.println();
		
		names.sort(Comparator.comparing(s->s));
		System.out.println(names);
	}

}
