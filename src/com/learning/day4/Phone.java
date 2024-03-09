package com.learning.day4;

public class Phone {
	String type;
	String model;
	String os;
	double size;
	int mfgYear;
	String spec;
	String color;
//type; model; os; mfgYear;
	
	public Phone(String inputColor,String inputModel,String inputOs,int inputmfgYear ) {
		
		color= inputColor;
		model = inputModel;
		os = inputOs;
		mfgYear = inputmfgYear;
		
	}
	
	public void  changeColor(String inputColor) {
		
		color = inputColor;
	}
	
	
	
	
	
}
