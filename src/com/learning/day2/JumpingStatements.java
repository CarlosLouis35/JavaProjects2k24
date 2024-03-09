package com.learning.day2;

import java.util.Iterator;

public class JumpingStatements {
	public static void main(String[] args) { 
	
	// break, continue
		// break -> stop the loop
		// continue -- skip the current i
	
	//don't print after 53
	
	for(int i = 0; i <=100; i++) {
		
		System.out.println(i);
		
	 if(i == 53) {
		 break;	 
	 }
	}
	
	System.out.println("-------------------------------------");
	
	for(int i = 0; i <=100; i++) {
		

	 if(i % 5 == 0) {
		 continue;	 
	 }
	 
	 System.out.println(i);
	}
	
	System.out.println("-------------------------------------");
	System.out.print("hello");
	System.out.print("world");
	System.out.println();
	System.out.println("hello");
	System.out.println("world");
	
	
	// ***** row-1 => 0 missing (row-1)
	// ****	 row-2 => 1 
	// ***	 row-3 => 2
	// **	 row-4 => 3
	// *	 row-5 => 4
	
 
	
	for(int i=1; i <=5; i++) {
		
		for(int j=1; j <=5-(i-1); j++) {
			System.out.print("*");
		}
		System.out.println();

	}
	
	// hw
	
	// *
	// **
	// ***
	// ****
	// *****
	//---------------
	//     *
	//    **
	//   ***
	//  ****
	// *****
	//---------------
	//    *****
	//     ****
	//      ***
	//       **
	//        *
	//---------------
	//WAP to find given year is leap year or not
	
	//1.
	System.out.println("-------------------------------------");
	
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

for (int i = 1; i <= 6; i++) {
 
    for (int j = 1; j <= 6 - i; j++) {
        System.out.print("*");
    }

   
    for (int k = 1; k <= i; k++) {
        System.out.print(" ");
    }

    
    System.out.println();
}
//4.
System.out.println("-------------------------------------");
	
	int year = 1990;
	
	while ( year<=2024 ) {
		if ((year % 4) == 0) {
			System.out.println(year + " Leap year");
		} else {
			
		System.out.println(year);
		}
		
		year++; 
		
	}
	}
	
	

	
	
}
		
	


