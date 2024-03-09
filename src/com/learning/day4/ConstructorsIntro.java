package com.learning.day4;

public class ConstructorsIntro {

	public static void main(String[] args) {
//  Special method that is used to initialise the objects/
//  by default constructor method will be called when an object of a class is created.
//  it will be used for set the initial values of object attributes
	
//	it has to use class name	
//	no return types (no void, not other types, it will be blank)	
//  almost we will make it public
		
//  default constructor
		
//	public className()	{
		
//				}
		
// parameterized constructor

// public className(dataType varName,) {		
	
// }	
		
		//type; model; os; mfgYear
		
	Phone apple = new Phone("Pink", "iPhone 15", "iOS 17", 2024);
	
	apple.changeColor("Rose Gold");
	
	System.out.println(apple.color);
	
	System.out.println("--------------------------------------------------------------");
	
//		 Keyword called "this"
//	  -> it is used to eliminate the confusion between class attributes and parameters
//	     with the same name.
	
	Laptop dell = new Laptop("grey","R15", "Windows 11 Pro", 2020 );
	
	dell.method1();
	dell.method2();
	
	Laptop.method4();
	
	Laptop hp = new Laptop("black","dh157", "Windows 11 Home", 2020 );
	
	dell.method1();
	dell.method2();
	
	Laptop.method4();
	
	System.out.println("--------------------------------------------------------------");
	
	Animal dog = new Animal("dog", "qwerty", 2);
	Animal cat = new Animal("cat", "qt", 1);
	
	
	
	
	
	
	
	
	
		
		
	}

}
