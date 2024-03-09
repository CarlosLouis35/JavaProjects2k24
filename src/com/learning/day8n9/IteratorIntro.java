package com.learning.day8n9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorIntro {

	public static void main(String[] args) {
		
		
//		It is used to read data from all the collection implementation classes
		
//		We can read and remove the data using iterator.
//		hasNext();
//		next();
//		remove();
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Joy");
		names.add("Ana");
		names.add("Kim");
		names.add("Jack");
		
		Iterator<String> itr = names.iterator();
		
		System.out.println(itr.hasNext()); // it will check whether its has next element or not
		System.out.println(itr.next());	   // value of next element
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		System.out.println("STOOOP!");
		
//		xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		HashMap<String, Integer> personsAgeMap = new HashMap<String, Integer>();
		
		personsAgeMap.put("Adam", 28);
		personsAgeMap.put("Ana", 21);
		personsAgeMap.put("Joy", 32);
		personsAgeMap.put("Roy", 43);
		personsAgeMap.put("Lee", 22);
		personsAgeMap.put(null, 55);
		
		Iterator<String> itr2 = personsAgeMap.keySet().iterator();
		
		while(itr2.hasNext()) {
			
			System.out.println(personsAgeMap.get(itr2.next()));
			
		}
		
		Iterator<Map.Entry<String, Integer>> entryItr = personsAgeMap.entrySet().iterator();	
		
		while(entryItr.hasNext()) {
			
			System.out.println("entryItr.next");
		}


	}

}
