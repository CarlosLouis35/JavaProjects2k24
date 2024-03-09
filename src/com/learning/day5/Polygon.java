package com.learning.day5;

public class Polygon extends Shape{

	@Override
	public int area(){
		
		return calcArea1()+calcArea11()-calcArea2();
		
		
	}
	private int calcArea1() {
		return 5;
		}
	
	private int calcArea11() {
		return 4;
		}
	
	private int calcArea2() {
		return 10;
		}
	
	

}
