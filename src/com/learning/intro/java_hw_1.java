package com.learning.intro;

public class java_hw_1 {
 public static void main(String[] args) {

		
	for(int i=1; i <=5; i++) {
			
		for(int j=1; j <=1+(i-1); j++) {
				System.out.print("*");
			}
			System.out.println();


		}

	//2.
	System.out.println("-------------------------------------");

	for (int i = 1; i <= 5; i++) {
	 
	    for (int j = 1; j <= 5 - i; j++) {
	        System.out.print(" ");
	    }

	   
	    for (int k = 1; k <= i; k++) {
	        System.out.print("*");
	    }

	    
	    System.out.println();
	}
	// 3. 
	System.out.println("-------------------------------------");

	for (int i = 1; i <= 5; i++) {
	 
	    for (int j = 1; j <= i - 1 ; j++) {
	        System.out.print(" ");
	    }

	   
	    for (int j = 5-(i-1); j >= 1; j--) {
	        System.out.print("*");
	    }

	    
	    System.out.println();
	}
	//4.
	System.out.println("-------------------------------------");
		
		int year = 2016;
		
	
			if ((year % 4 == 0 && year %100 !=0) || year % 400 == 0) {
				System.out.println(" Leap year");
			} else {
				
			System.out.println( " Not leap year");
			}
			
		
			
		}
	
}

