package com.learning.intro;

public class Operators {
	
	public static void main(String[] args) {
	
		//   5 types of operators
		
		// 1. Arithmetic Operators
		//               +, -, *, /, ++, --, %
		
		// 2. Assignment Operators
		//               =, +=, -=, /=, &=, |=, ^=, >>=, <<=
		
		// 3. Comparison Operators
		//               ==, !=, >, <, >=, <=
		
		// 4. Logical Operators
		//               &&, ||, !
		
		// 5. bitwise Operators
		//
		
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
		
		int sub = a - b;
		System.out.println(sub);
		
		int mul = a * b;
		System.out.println(mul);
		
		double div = (double)a / b;
		System.out.println(div);
		
	//	a++;
	//	
	//	System.out.println(a);
		
	//	b--;
		
		
		double rem=a%b;
		
		System.out.println(rem);
		
		
		int c = 5;
		int d = 10;
		
	    d += 10;  // d= d+10
	    System.out.println(d);
	    
	    d -= 5; // d= d-5
	    System.out.println(d);
	    
		d *= 2;// d= d*2
		System.out.println(d);
		
	    d /= 3;    // d= d/3
		System.out.println(d);
		
		System.out.println(c == d); // Equal
		System.out.println(c != d); //Not equal
		System.out.println(c < d); //Lesser than
		System.out.println(c > d); //Greater than
		System.out.println(c >= d); //Equal or greater
		System.out.println(c <= d); //Equal or lesser
		
		
		// and     &&
		// or      ||
		// not     !
		
		System.out.println("--------------");
		// and &&       condition1 && condition2  => true
		//                 true          true
		
		System.out.println((c==d) && (c>d) ); // false
		System.out.println((c<=d) && (c<d) ); // true
		System.out.println((c>=d));
		
		
		
		
		System.out.println((c==d)|| (c<d) );
		System.out.println((c<=d)|| (c<d) );
		System.out.println((c>=d)|| (c>d) );
		System.out.println((c<=d)|| (c<d) || (c==d));
		
		System.out.println(((c==d) || (c<d)) && (c<=d) );
		System.out.println(((c<=d) && (c>d)) || (c<=d) );
		System.out.println(((c<=d) || (c>d)) && (c<=d) );
		
		
		
		
	}

}
