package com.learning.day4;



public class Laptop {

	
		String type;
		String model;
		String os;
		double size;
		int mfgYear;
		String spec;
		String color;
		
		
	//type; model; os; mfgYear;
		
		public Laptop(String inputColor,String inputModel,String inputOs,int inputmfgYear ) {
			
			this.color= inputColor;
			this.model = inputModel;
			this.os = inputOs;
			this.mfgYear = inputmfgYear;
			
		}
		
		public void  changeColor(String inputColor) {
			
			this.color = inputColor;
		}
		
		public void callAllTheMethods () {
			
			method1();
			
		}
		
		public void method1() {
			System.out.println("Method 1");
			method2();
			
		}
		
		public void method2() {
			System.out.println("Method 2");
			method3();
		}
		
		public void method3() {
			System.out.println("Method 3");
		}
		
		public static void method4 () {
			
			System.out.println("This is a static method");
			
			
			
		}
		
	
	
}
