package com.learning.day2;



public class ConditionalStatements {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 4 conditional statements
		// If
		// If else
		// If else If
		// Switch
		
		// find a senior people whose age is above 50
		
		//if (condition){
		// body -->   we write a code   
		//}
//		int age = 25;
//		if ( age > 50) {
//			System.out.println("Senior");
//		} else if (age < 18) {
//			
//			System.out.println("Minor");
//		} else {
//			System.out.println("Not a minor, not a senior");
//		}
		
		// write a program to fin out the grades based on markes
		
//		100-90 - A		
//		89-80  - B
//		79-70  - c
//		69-60  - D
//		59-50  - E
//		< 49   - F
		
		int marks = 49;
		int total = 455;
		
		
		if ( marks > 90) {
			System.out.println(marks + " A");
		} else if ( marks < 89 && marks >= 80) {
			System.out.println(marks + " B");
		} else if ( marks < 79 && marks >= 70) {
			System.out.println(marks + " C");
		}else if ( marks < 69 && marks >= 60) {
			System.out.println(marks + " D");
		}else if ( marks < 59 && marks >= 50) {
			System.out.println(marks +" E");
		}else{
			System.out.println(marks + " F");
		}  
		
		if (marks >= 50) {
		if (total > 500) {	
			System.out.println("Highest");
		} else {
			System.out.println("Not the highest");
		}
		
		}
		System.out.println("--------------------------------------------");
		
		
		boolean green = true;
		boolean red = false;
		boolean yellow = false;
		
		boolean walkSign = true;
		
		if (green && !walkSign) {
			System.out.println("Cars are moving");
		} else if (!green) {
		  if (red &&walkSign) {
			System.out.println("Start walking and cars has been stopped");
		} else if (yellow && walkSign) {
			System.out.println("Start walking and watch out for cars");
		}
		}
		
		System.out.println("---------------------------");
		int month = 1;
		
		switch (month) {
		case 1: {
			
			System.out.println("It's January");
			break;
		}
		case 2: {
			
			System.out.println("It's February");
			break;
		}
		
		default:
			System.out.println("I don't hace a date right now");
		
		
	}
		
		
		
		System.out.println("-------------------------------------------");
		
		String color = "red";
		switch (color) {
		case "red":
			System.out.println("Its a red color");
			
			break;
			
		case "green":
			System.out.println("Its a green color");
			
			break;
		
		case "blue":
			System.out.println("Its a blue color");
			
			break;

		default:
			System.out.println("I don't know this color");
			
		}
		
		
		
		
		
		
		
		}

}
