package com.learning.day8n9;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsIntro {

	public static void main(String[] args) {
//	Maps => keys and value pairs => pair is known as entry
//		1.Hashtable
//		2.Linked hash map
//		3.Tree Map
		
//		aim to reach 0(1)
		
//		                                        balanced binary trees
//		arrays  >  binary trees     >      avl trees and red black trees >  hash function to reach
//		0(n)        0(log(n)) not 100					0(log(n))                   0(1)
		
//		Hash functions - it defines the relationship between keys and the memory index
		
//		Collisions is inserting multiples vkey values in a single memory index
		
//							avg case			worst case 		
//		search				0(n)				0(n)
//		insertion			0(1)				0(n)
//		deletion			0(1)				0(n)
		
//		HashMap:
//		HashMap<keyDataType, valueDataType> variableName = new HashMap<keyDataType, valueDataType>();
		
		HashMap<String, Integer> personsAgeMap = new HashMap<String, Integer>();
		
		personsAgeMap.put("Adam", 28);
		personsAgeMap.put("Ana", 21);
		personsAgeMap.put("Joy", 32);
		personsAgeMap.put("Roy", 43);
		personsAgeMap.put("Lee", 22);
		personsAgeMap.put(null, 55);

		
		System.out.println(personsAgeMap);
		System.out.println(personsAgeMap.get("Roy"));
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		for(String key: personsAgeMap.keySet()) {
			System.out.println(key);
			System.out.println(personsAgeMap.get(key));
			
		}
		
		for(Map.Entry<String, Integer> entry: personsAgeMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue() );
		
			
		}
		
//		Hashmap will accept null as keys
//		Hashmaps does not follow the insertion order
		
		
//		--------------------------------------------------------------------------------
//		LinkedHashMap
//		uses double linked list
//		needs more memory
//		Hashmap will accept nulls as keys
//		LinkedHashMap follow the insertion order
//		LinkedHashMap<keyDataType, valueDataType> variableName = new LinkedHashMap<keyDataType, valueDataType>();
		
//		--------------------------------------------------------------------------------

//		TreeMap -> sortedMap interface - time complexity = 0(log(n))
//		Balance binary trees - AVL or Red black trees
//		TreeMap<keyDataType, valueDataType> variableName = new TreeMap<keyDataType, valueDataType>();
		
		TreeMap<Double,String > prices = new TreeMap<Double,String>(); 
		// We can store the items in sorted order based on keys
		prices.put(525.5,"Dell" );
		prices.put(112.52,"HP" );
		prices.put(999.99,"Mac" );
		prices.put(658.26,"Asus" );
		
		System.out.println(prices);
		
		System.out.println(prices.firstKey());
		System.out.println(prices.lastKey());
		
//						hashMap 					LinkedHashMap 				TreeMap
//					uses Arrays						doubleLinkedList			Balanced Binary tree
//best case			can achieve 0(1)				can achieve 0(1)			0(log(n)) => 100%
//worst case   	    0(log(n)))						0(log(n))			    	0(log(n))	
//					We can store null values		We can store null values	We can store null values
//					does not follow insertion order	does follow insertion order does follow insertion order 
		
		
		
		
		
	}

}
