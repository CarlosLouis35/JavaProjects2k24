package com.learning.day6;

public class ObjectClass {
	
//  It's a root/parent class for all the objects that are created inside a java
	
	
//	-> toString();
//	        	-> It will return the string representation of the object
//	-> equals(Object obj);
//				-> It will be used to indicate whether some other object is equal tho this one.
//				-> By default it will check whether both belongs to same memory location or not.
//	-> hashCode();
//				-> It will return the hash code value of object.
//	-> getClass();
//				-> This will return an instance of the "Class" class, which provides information about the class.
//	-> clone();
//				-> It will create the copy of the object and returns it.
//	-> finalize();
//				-> It will be called by garbage collector on an object when garbage collection determines
//					that are no more references to that object. 
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Object obj = new Object();
		Object obj2 = new Object();
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());		
		System.out.println(obj.getClass());
		
		System.out.println(obj2.getClass());
		System.out.println(obj.equals(obj2));
		
		Student student1 = new Student(1, "Joy");
		Student student2 = new Student(2, "Ana");
		Student student3 = new Student(3, "Joy");
		
		System.out.println(student1.equals(student3));
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		
		
		
	}
//	
//	
//	
	
	
	
	
	

}
