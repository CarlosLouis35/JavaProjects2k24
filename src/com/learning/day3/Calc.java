package com.learning.day3;


public class Calc {

	public static void main(String[] args) {
		Calc calc1 = new Calc();
		String name0utput = calc1.giveMeYourName();
		
		
		System.out.println(calc1.dobsum(7.3, 6.9));
		System.out.println(name0utput);


		
		// build a method to take 2 int input values, 1 double input and return the int sum of them
	
	}
	
	public int mul() {
		int a = 12;
		int b = 10;
		int mul = a*b;
        return mul;
		
	}
	
	public String giveMeYourName() {
		
		String anything= "Hello ";
		
		String a1 = anything + "Carlos";
		
		return a1;
	}
	
	public int add(int a, int b) {
		
		int sum = a + b;
		return sum;
	}
	
	public int add2(int a, int b) {
		
		int sum = a + b;
		return sum;
	}

	
	// build method to take 2 double input value and return the double sum of them
	public double dobsum(double a, double b) {
		
		double sum = a + b;
		
		return sum;
	}
	
	// build a method to take 2 int input values, 1 double input and return the int sum of them
	public int dobintsum(int a, int b, double c) {
		
		double sum = a + b + c;
		
		return(int) sum;
	}

	
	
	
}
