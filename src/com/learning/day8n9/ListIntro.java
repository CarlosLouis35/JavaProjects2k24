package com.learning.day8n9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListIntro {

	public static void main(String[] args) {
		//ArrayList
//		LinkedList
//		Vector
//		Stack
		
// ArrayList		

//  ArrayList<DataType> variableName = new ArrayList<DataType>		
//		1. Add elements at the end of array -> 0(1)
//		Array list are fast, as we can manipulate the last item
		
//		1.Search based on index 0(1)
//		2.Search for arbitary item without intex 0(n)
//		3.Insert at the end 0(1)
//		4.Insert item to arbitary position 0(n)
//		5.Remove last item 0(1)
//		6. remove item to arbitary position 0(n)

		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Joy");
		names.add("Ana");
		names.add("Kim");
		names.add("Jack");
		
		System.out.println("names");
		System.out.println(names.size());
		System.out.println(names.remove(3));
		names.add("Jim");
		
		System.out.println(names);
		
		names.add("Roy");
		
		System.out.println(names.contains("Ana"));
		System.out.println(names.contains("Ana2"));
		
		
//		We have to shift alot whenever we are updating the items in ArrayList

		
//		Linked list		
//		startNode -> headNode
//		node -> data and next
//		all the node can be accessible through head node only
//		LinkedList<DataType> variableName = new LinkedList<DataType>	
		
		LinkedList<Integer> intLinkedList =  new LinkedList<Integer>();
		
		intLinkedList.add(10);
		intLinkedList.add(20);
		intLinkedList.add(30);
		intLinkedList.add(40);
		
		System.out.println(intLinkedList);
		intLinkedList.addFirst(5);
		System.out.println(intLinkedList);
		System.out.println(intLinkedList.getFirst());
		System.out.println(intLinkedList.getLast());
		
		System.out.println(intLinkedList.remove(2));
		System.out.println(intLinkedList);
		System.out.println(intLinkedList.isEmpty());
		
		
//		Items are not stored next to each other, so it's not a random indexing
//		1.Search first item 0(1)
//		2.Search for arbitary item 0(n)
//		3.insert at end 0(1)
//		4.insert item to arbitary position 0(n)
//		5.remove last item 0(1)
//		6.remove item from arbitary position 0(n)
		
//		Linked list is used when there are more updations
		
		
//		Vector
		
//		It's similar to arrayList
//		it's synchronized -> every operation we need to lock the resource and unlock after the operation
//		It's expensive
		
//		Stacks
//		LIFO structure - Last In First Out
//		pop()- remvoe top element
//		push()- add element at top of ds
//		peek()- value of top element
		
//		Stack memory is special location RAM
//		Stack<DataType> variableName = new Stack<DataType>
		
		Stack<String> students = new Stack<String>();
		
		students.add("Adam");
		students.add("Joe");		
		students.add("Ana");
		
		System.out.println(students);
		System.out.println(students.peek());
		
		System.out.println(students.pop() );
		System.out.println(students);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
