package com.learning.day8n9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;



public class QueuesIntro {
	
	public static void main(String[] args) {
		
	

//	Queues
	
//	FIFO - First in First Out
	
//	Arrays and linkedList
	
//	enqueue()- insert an item
//	dequeue()- delete an item
//	peek()-    return the value
	
//	Throws exceptions			//---------Return a value
//	add()                          offer()
//	remove()                       poll()
//	element()                      peek
	
//	queues are useful when a resource is shared with serveral consumers
//	queues are very important in CPU schedule
	
//	Queue<datatype> variableName = new LinkedList<datatype>();
//	Queue<datatype> variableName = new ArrayList<datatype>();
	
	Queue<String> names = new LinkedList<String>();
	
	names.add("Adam");
	names.add("Adam");
	names.add("Adam");
	names.add("Adam");
	
	
	System.out.println(names);
	
	System.out.println(names.remove());
	System.out.println(names.poll());
	System.out.println(names);
	
	System.out.println(names.element());
	System.out.println(names.peek());

//--------------------------------------------------------------------------------
//  Priority queue	
//		it will sort the queue based on priority
//		elements with high priority will server before low priority elements
	
//--------------------------------------------------------------------------------	
//  DoubleEndedQueue-  Deque
	
//	Deque<Integer> queue = new ArrayDeque<Integer>();
	
//	addFirst();
//	addLast();
//	removeFirst();
//	removeLast();

//	Deque<Integer> stack = new ArrayDeque<Integer>();
	
// stack (arrayDeque) is faster than normal stack data structure
//	because stack is a synchronized as its extends vectors, thats why arrayDeque is faster than normal stacks ds
	
	
	
	
	
	
	
	}
	
	
}
