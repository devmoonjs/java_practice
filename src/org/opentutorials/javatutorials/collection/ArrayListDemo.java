package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;


public class ArrayListDemo {

	public static void main(String[] args) {
		HashSet<Object> a1 = new HashSet<Object>();
		ArrayList<Object> a2 = new ArrayList<Object>();
		
		a1.add("one");
		a1.add("two");
		a1.add("three");
		a1.add("three");
		a1.add("three");
		a1.add("three");
		a1.add("ten");
		
		a2.add("one");
		a2.add("two");
		a2.add("three");
		a2.add("three");
		a2.add("three");
		a2.add("three");
		a2.add("ten");
			
		Iterator<Object> it = a1.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
		}
		
		Iterator<Object> it2 = a2.iterator();
		while(it2.hasNext()) {
			String str2 = (String)it2.next();
			System.out.println(str2);
		}			
	}
}
