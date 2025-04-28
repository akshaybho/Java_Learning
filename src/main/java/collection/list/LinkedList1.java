package collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String[] args) {
		LinkedList <String> a = new LinkedList <String>();
		System.out.println("linkedlist of elements: "+a);
		a.add("akshay");
		a.add("saloni");
		a.add("onkar");
		a.add("anmol");
		//adding a specific element at specific position
		a.add(1, "pandu");
		System.out.println("list is="+a);
		LinkedList <String> ak = new LinkedList <String>();
		ak.add("sagar");
		ak.add("ranu");
		//add list2 elements in list1
		a.addAll(ak);
		System.out.println("now list is="+a);
		LinkedList <String> aks = new LinkedList <String>();
		aks.add("jhon");
		aks.add("rahul");
		//add list3 element in list1 at specific position
		a.addAll(1, aks);
		System.out.println("now the list becomes="+a);
		//reverse the list
		Iterator itr = a.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
