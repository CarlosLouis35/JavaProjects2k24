package com.learning.intro;



public class Datatypes {
	public static void main(String[] args) {
	// In java 2 datatypes
	//           -Primitive
	//           -Non Primitives
	
	// 8 Primitives datatypes
	
	//1. byte     - 1 byte       -128 to 127
	//2. short    - 2 bytes      -32768 to 32767
	//3. int      - 4 bytes      -2,147,483,648 to 2,147,483,647
	//4. long     - 8 bytes      -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	//5. float    - 4 bytes       store up to 6 to 7 decimal digits
	//                           ex: 12.1234567
	//6.double    - 8 bytes       store up to 15 decimal digits
	//							 ex: 12.123456789012345
	//7. boolean  - 1 bit          true or fals
	//8. char     - 2 bit         single character, need single quotes
	
	// Non Primitive data type
	// -String
	
	// Syntax of variable
	
	// type name = value
		// If final added to the datatype, it becomes from a variable to constant
	
	byte count = 120;
	boolean option = true;
	int a = 100000;
	long b = 142777;
	double c = 10.57;
	float d = 10.67f;
	char e = 'g';
	short f = 123;
	
	System.out.println(count);
	
	count = 127;
	System.out.println(count);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(option);
	
	// type casting
	
	// wideing casting - automatically -> converting smaller type to larger type
	//byte -> short -> int -> long -> float -> double

	byte value = 10;

	int anothervalue = value;
	
	System.out.println(value);
	System.out.println(anothervalue);
	
	 value = 20;
	
	System.out.println(value);
	System.out.println(anothervalue);
	
	// narrowing casting - manually -> larger type to smaller type
	//byte <- short <-  int <-  long <-  float <- double
	
	int person1_money = 1000;
	int person2_money = 2500;
	
	int total = person1_money + person2_money;
	
	System.out.println("-----------------Before-------------");
	System.out.println(total);
	
	person1_money=3500;
	
	System.out.println("-----------------after-------------");
	total = person1_money + person2_money;
	
	System.out.println(total);
	
	byte smallvalue = 126;
	
	int largervalue = smallvalue; //2b
	// 126
	
	largervalue = 10000;
	//10000
	
	smallvalue = (byte) largervalue;
	
	System.out.println(smallvalue);
	
	
	
	byte studentcount = 12;
	
	short studentFee = 1000;
	
	int totalSt = studentcount * studentFee;
	
	System.out.println(totalSt);
	
	int studentcount2 = 2;
	short studentFee2 = 5;
	
	byte total2 = (byte) ((byte) studentcount2 * (byte) studentFee2);
	System.out.println(total2);
	
	
	
	}
	
 }
