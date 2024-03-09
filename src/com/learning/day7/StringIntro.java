package com.learning.day7;



public class StringIntro {

	public static void main(String[] args) {
		
//	String is a variable that contains a collection of characters	
//	String are immutable -> Once a string object is created, its value cannot be changed	
//		When you modify a string -> it will actually create a new string
		
		
//	-> Java memory	
//		1. Heap memory
//		   -> Java Objects will be stored in heap, 
//		       which is a portion of memory dedicated to storing objects and arrays.
//		   -> Heap is shared among all threads in JVM		
		
//		2. Stack memory
//		   -> Java uses stack memory to store local variables and method call information.
//		   -> Each thread in JVM has its own stack, which is used for method calls and local variables.
				

		String s1 = "Hello World";
		String s2 = "Hello World";
		
		String s4 = "Hello World";
		String s5 = "Hello World";
		String s6 = "Hello World";
		String s7 = "Hello World";
		String s8 = "Hello World";
		String s9 = "Hello World";

		
		String s3 = new String("Hello World");
		String s10  = new String("Hello World");

		System.out.println(s2 == s3);
		System.out.println (s1 == s2);
		System.out.println(s3 == s10);
		
		s1 = "hello";
		
		s1 = "hello world";
		s1 = "hello worl";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(6));
		
		System.out.println(s1.indexOf('w'));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(3,5));
		
		System.out.println(s3 == s10);
		System.out.println(s3.equals(s10)); // In deep comparison, the = operator is used to check if two reference points 
		
		String s15 = "hello";
		String s16 = "hello";
		
		String s17 = "hi";
		
		String s18 = "hi";
		String s19 = new String("hi");
		
		String name = "Joy";
		
		
		// stringVar.contat(anotherStringVar or string value)
		System.out.println(s18 + " " + name); // String concatenation, we use operator +
		
		String output = s18.concat(" ").concat(name);
		System.out.println(output);
		
		// StringBuilder and SringBuffer -> mutable
//		        -> This classes will allow you to modify strings without creating new objects each time.
//				-> Both classes will procide sililar function, but they differ in their thread safety.
		
//			StringBuilder -> It is not thread safe
//				-> Which means it is not suitable for use in multithread enviroments
//				-> However it is more efficient that StringBuffer
		
		
			StringBuilder sb = new StringBuilder();
			sb.append("Hello");
			sb.append(" ");
			sb.append("World");
		
			System.out.println(sb); // the output is the type of StringBuilder
			
//			String str1 = sb.toString();
			
			String str = sb.toString();
			
			System.out.println(str);
			
//			StringBuffer -> It is thread safe
//			-> Which means it is suitable for use in multithread enviroments
//			-> However it is less efficient that StringBuffer
			
			StringBuffer strBuf = new StringBuffer();
			
			strBuf.append("Hello");
			strBuf.append(" ");
			strBuf.append("World");
			
			System.out.println(strBuf);
			
//			String str2 = strBuf; (Not work)
			String str2 = strBuf.toString();
			
			System.out.println(str2);
			
			
			
			
			
		
		
	}

}
