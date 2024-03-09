package com.learning.day3;

public class Car {
	
    //	Car > has Attribute ->   name, color, model, mnfYear, milleage
	//      > has Methods ->  drive(), stop();
	
	
	String name;
	String color;
	String model;
	int mfgYear;
	int milleage;
	double price;
	
	// public void methodName(){
	
	// body of a method

    // }
	
public void drive() {
	
	System.out.println("My car is in drive mode");
}

public void stop() {
	
	System.out.println("My car is in stop mode");
}

public void changeColorToRed(){
	
	color="red";
}

public void changeColor(String updatedColor){
	
	color=updatedColor;
}

public void changePrice(double updatedPrice){
	
	price=updatedPrice;
}







	
	

}
