package com.bitm.NewToursAutomation.Utils;

import java.util.ArrayList;
import java.util.Iterator;

public class test {
	
	public static void main (String[]args) {
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Tiger");
		
		animals.add("Elephant");
		
		animals.add("Fox");
		
		animals.add("Cat");
		
     // Iterator-java.utils
		Iterator<String> itr = animals.iterator(); 
		
		while (itr.hasNext()) {
			
			String value = itr.next(); 
			
			System.out.println(value);
			
		}
		
		
		
	}

}


