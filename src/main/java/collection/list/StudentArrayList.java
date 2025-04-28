package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(12,"akshay",28);
		Student s2 = new Student(13,"onkar",26);
		Student s3 = new Student(14,"sagar",25);
		
		ArrayList <Student> list = new ArrayList <Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Iterator <Student> itr = list.iterator();
		
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st.roll_no+" "+st.name+" "+st.age);
		}
	}

}
