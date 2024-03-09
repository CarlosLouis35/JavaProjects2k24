package com.learning.day3;

public class TV {

	// TV -> has Attributes -> type, model, os, size, mnfYear, specs, color		
	//    -> has Methods -> changeChannel(), switch(), operations(), volume()
		//       
		//        Methods
		// getType() => return type
		// getOs() => return os
		// getMfgYear() => return
		// updateColor () => update color (input)
		// updateModel () => update model (input)
		
	
	String type;
	String model;
	String os;
	int size;
	int mnfYear;
	String specs;
	String color;
	int channel;
	
	public void changeChannel (int newChannel  ) {
		channel = newChannel;
	}
	
	public String getType() {
		
		return type;
	}
	
	public String getOS() {
		
		return os;
	}
	

	public int getmnfYear() {
	
	return mnfYear;
}
	
	public void changeColor(String updatedColor){
		
		color=updatedColor;
	}
	
	public void changeModel(String updatedModel){
		
		color=updatedModel;
	}
	
}
