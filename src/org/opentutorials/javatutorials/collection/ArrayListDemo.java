package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Object> a1 = new ArrayList<Object>();
		a1.add("one");
		a1.add("two");
		a1.add("three");
		
		for(int i=0; i<a1.size(); i++){
				System.out.println(a1.get(i));
		}
	}

}
