package com.durgasoft;

import java.util.ArrayList;

public class DemoClass {
	
	/*
	 * ArrayList<?> ? represents wild card operator so that we can specify any
	 * type to object  when we call this method.  
	 * eg 1. m1( new ArrayList<String>() );
	 *    2. m1( new ArrayList<Integer>() );
	 */	
	public void m1(ArrayList<?> al) {
		System.out.println(al);
	}

}
