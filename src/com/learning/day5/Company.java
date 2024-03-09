package com.learning.day5;

public abstract class Company {
	
	public String name;
	
	public abstract void sales();
	public abstract void operations();
	
	public void profit(){
		System.out.println("This is company profit method");
		
	};

}
