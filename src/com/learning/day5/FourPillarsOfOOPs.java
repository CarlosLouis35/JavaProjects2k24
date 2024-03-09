package com.learning.day5;

public class FourPillarsOfOOPs {

	public static void main(String[] args) {
		
//	1. Encapsulation	
//	2. Inheritance	
//	3. Polymorphism	
//	4. Abstraction
					
//	Encapsulation :	
		
//	Encapsulation is to make sure that "Sensitive" data is hidden from the users.	
//		1. declare class variables/attributes as private.
//		2. we will create a set or get methods to access or update the values of private variables/attributes.
		
		Health myHealth = new Health();
		
		myHealth.setName("Pancho");
		
		String nameOfApplicantString = myHealth.getName();
		System.out.println("--------------------------------------");

//      Inheritance		
//		It is possible to inherit attributes and methods from one class to another class
//		1. sub class or child class -> class than inherits from [another class] <- (This will be the parent class or "super class" for this child or sub class)
//                                                                     ^		
//                                                                     |		
//		2. super class or parent  --------------------------------------           
		
//		To inherit from one class to another class, we will use keyboard called "Extends"
		
//		For all the objects in java, parent class is object class
		
		
//		Bank Accounts -> account, routing number, name
//		Checking
//		Saving
		
		CheckingAccount ca = new CheckingAccount();
		SavingAccount sa = new SavingAccount();
		
//		I. Single Inheritance          A -> B
//		II. Multi-Level Inheritance     A -> B -> C
//		III. Multiple Inheritance        A -> B, C
//		                               B -> A
//		                               C -> A
//                                     D <-	B, C
		
//      IV. Hierarchical Inheritace    		
//      V. Hybrid Inheritance -=> This will alos not work		
		
//		Polymorphism
		
//		Polymorphism  -> Poly = Many/Multiple Morphism => forms
//      manyforms
			
		
		GrandChild gc = new GrandChild();
		
		gc.style();
		
//		animal -> sound()   -> This animal makes a sound
//		cat    -> sound()   -> This animal makes a sound of meow
//      dog    -> sound()   -> This animal makes a sound of bark
		
		FourPillarsOfOOPs oop = new FourPillarsOfOOPs();
		oop.createAllAnimals();
			
//		Abstraction
//		 Abstraction is a process of hiding the certain details and showing only essential information to the user.
//		 Abstraction -> hiding the implementation
		
//      1. By using abstract classes		
//   	2. Interface
		
//		Abstract Class -> we will use keyboard abstract
//		   1. we can not create the object by using of abstract Class
//  	   2. Abstract methods can only be used inside of a Abstract class -> abstract methods will not have a body
//		   3. Abstract classes can have both regular and abstract methods.	
//		   4. Whatever class that is extending from abstract class needs to provide the implementation for abstract methods.		
		
		
	}
	
	public void createAllAnimals() {
		
		Parent p = new Parent();
		Child c = new Child();
		Parent gc = new GrandChild();
		p.style();
		c.style();
		gc.style();
		anotherMethod();
		
	}
	
	public void anotherMethod(){
		System.out.println("It's another method");
		
	}

}
