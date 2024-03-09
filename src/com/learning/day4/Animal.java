package com.learning.day4;

public class Animal {

	static int noOfAnimalCreated = 0;
	static int noOfLegs = 4;
	
	String type;
	String name;
	int age;
	
	public Animal(String type, String name, int age) {
		
		this.type = type;
		this.age = age;
		this.name = name;
		
		noOfAnimalCreated++;
	}
	
}
