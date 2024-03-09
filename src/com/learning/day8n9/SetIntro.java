package com.learning.day8n9;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetIntro {

	public static void main(String[] args) {

//	Set	
//		1.Hashset        uses-1D array
//		2.LinkedHashSet  uses-HashFunction
//		3.TreeSet        uses-Red black trees
		
//		venn diagram
//		union , intersection
//		Set<DataType> varaibleName = new HashSet<DataType>
//		all the items are unique
		
		Set<String> set1 = new HashSet<String>();
		set1.add("Adam");
		set1.add("Joe");
		set1.add("Roy");
		System.out.println(set1);

		
		Set<String> set2 = new HashSet<String>();
		set2.add("Kim");
		set2.add("Jack");
		set2.add("Roy");
		System.out.println(set2);
		
		
//		set1.retainAll(set2); //Intersection of set1 and set2 and stores in set1
//		
//		System.out.println(set1);
		
		set1.removeAll(set2);
		
		System.out.println(set1);
		
		// HashSet does not follow insertion order
		
//		LinkedHashSet
//		LinkedHashSet follow insertion order
//		It needs more memory than hashset
		
		
//		TreeSet - class, sorted set is a interface
//		Balanced binary tree
//	    time complexity - O(log(n))
		
//		SortedSet<DataType> variableName = new TreeSet<DataType>();
		
		SortedSet<Integer> set5 = new TreeSet<Integer>();
		set5.add(10);
		set5.add(50);
		set5.add(20);
		set5.add(100);
		set5.add(30);
		set5.add(40);
		
		Set<Integer> subSet = set5.subSet(20,40);
		
		System.out.println(set5);
		System.out.println(subSet);
		
		System.out.println(set5.tailSet(40));
		System.out.println(set5.headSet(40));
		
		System.out.println(set5.first());
		System.out.println(set5.last());
		
//		hashSet                        linkedHashSets                treeSet
// 		uses arrays        		     	linkedList					 balanced Binary trees
//		we can achieve 0(1)                0(1)                          0(log(n))
//		worst case run time is 0(log(n))   0(log(n))                     0(log(n))
//		can store null values			   can store null values      cannot store null values
//		Does not follow insertion order	   follows insertion order    follows insertion order
//		
//		
		
		Queue<String> names = new LinkedList<String>();
		
		names.add("Adam");
		names.add("Adam");
		names.add("Adam");
		names.add("Adam");
		
		

	}

}
