package com.learning.day8n9;

public class Person implements Comparable<Person>{

	String name;
	int age;
	double salary;
	double netWorth;
	int noOfHouse;
	
	
	public  Person(String name, int age, double salary, double netWorth, int noOfHouses) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.netWorth = netWorth;
		this.noOfHouse = noOfHouse;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + ", netWorth=" + netWorth
				+ ", noOfHouse=" + noOfHouse + "]";
	}





	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
}
