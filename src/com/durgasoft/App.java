package com.durgasoft;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		
		DemoClass class1 = new DemoClass();
		
		// created the arraylist of string object
		ArrayList<String> list = new ArrayList<String>();
		
		// adding string objects to arraylist object
		list.add("Nagoor Babu");
		list.add("Durga Sir");
		list.add("Syed");
		list.add("Asad");
		list.add("Khaleeq");
		
		// passing arraylist of string to m1 method.
		class1.m1(list);
		
		// creating arrayist object of integer object.
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		// adding integer object to arraylist object.
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(new Integer(40));
		list1.add(50);
		
		// passing arraylist of integer to m1 method.
		class1.m1(list1);
	}
}
