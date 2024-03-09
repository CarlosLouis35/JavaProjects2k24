package com.learning.day2;



public class LoopStatements {
	
	public static void main(String[] args) {
		
		//for
		//while
		//do-while
		
		//for loop
		
		//for(statement1; statement2; statement3){}
		//     body -> code
		
		//for (initiatization; condition; increment/decrement) {
		// repeating lines of code
		// }
		
		for (int i = 1; i<=10; i++) {
		
			System.out.println(i);
			
	
		}
		
		System.out.println("----------------------");
		for (int i = 10; i>=1; i--) {
			
			System.out.println(i);
			
	
		}
		
		System.out.println("----------------------");
		
		for (int i = 232; i<=436; i= i + 2) {
			
			System.out.println(i);
			
	
		}
		
System.out.println("----------------------");
		
		for (int i = 1000; i>=500; i= i - 10) {
			
			System.out.println(i);
			
	
		}
		
System.out.println("----------------------");
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.println("Outer Loop ----------" + i);
			
			for (int j = 1; j <= 5; j++) {
				System.out.println("Inner Loop ----- " + j + "---------" + i);	
			}
		}
		
		//--------------
		
System.out.println("-------------------------");

		for(int outer=1; outer<=5; outer++) {
			System.out.println("outer");
			
			for(int inner=1; inner<=5; inner++) {
				System.out.println("...inner...");				
			}
		}
		
System.out.println("-------------------------");

		//While loop

//        while(condition) {
//			body
//          }

//		  Initialization
//		  while(condition) {
//        body

//        increment/decrement
//          }
			// 1, 2 ,3, 4...10

		int i = 1;
		while (i<=10) {
			
			System.out.println(i);
			i++;
			
		}
		
		System.out.println("-------------------------");
		// do while
		
		
		// initialization
		// do {
		//         body code
		//     }
		// while (condition)
		
		int a = 1;
		
		do {
			System.out.println(a);
			a++;
		}
		while(a<=10);
		
		
		System.out.println("-------------------------");
		
		int b = 1000;	
		do {
			System.out.println(b);
			b = b -10;
		}
		while(b>=0);
		
		System.out.println("-------------------------");
		
		//print 1 to 15 and check if the numbers are even
		
		int g = 1;
		while ( g<=50 ) {
			if ((g % 2) == 0) {
				System.out.println(g + " Even");
			} else {
				
			System.out.println(g + " Odd" );
			}
			
			g++; 
			
		}
		
		// print 1000, 999, 998, 997... 1
		// check for multiples of 3 
		System.out.println("-------------------------");
		int k = 1000;
		while ( k>=3 ) {
			if ((k % 3) == 0) {
				System.out.println(k);
			} 
			
			k--; 
			
		}
		
		
		
			
			
		
		
		
		
	
		
		
	

} 
}