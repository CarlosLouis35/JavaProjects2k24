package com.learning.day5;



public class Calculator {
	
	
	
	
	
	public int sum(int a, int b){
		
		return a+b;
		
	}
	
	public int div(int a, int b){
		
		return a/b;
		
	}
	
	public int mul(int a, int b){
		
		return a*b;
		
	}
	
	public int sub(int a, int b){
		
		return a*b;
		
	}
	
	public int getArea(int side, int base, int noOfSided){
		
		int area = 0;
		
		if (noOfSided == 3) {
			area = areaofTriang(noOfSided, base);
		} else if ( noOfSided == 4) {
			area = areaofSq(side);
		}
		return area;
	
	}
	
	private int areaofTriang(int side, int base){
		int area = mul(side, base);
		return area;
		
	}
	
	private int areaofSq(int side){
		int area = 0;
		return area;
		
	}
	
	
	
	
	
	
	

}
