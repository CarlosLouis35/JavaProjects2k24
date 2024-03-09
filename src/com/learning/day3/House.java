package com.learning.day3;

public class House {
	
	// House > has Attributes -> type, address, norooms, age, owner	
    //		 > has Methods -> rent(), sell(), buy (); remodel()
	
	String type;
	String address;
	int norooms;
	int age;
	String owner;
	double price;
	
	public void rent() {
		
		System.out.println("My house has been rented");
	}
	
	public void sell () {
		
		System.out.println("My house has been sold");
	}
	
	public void buy() {
		
		System.out.println("I bought this house");
	}
	
	public void remodel() {
		
		System.out.println("My house has been remodeled");
	}
	
	public double changePrice(double updatedPrice){
		
		return price=updatedPrice;
	}
	
	
	
}
