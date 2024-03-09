package com.learning.day8n9;

public class ExceptionsIntro {
	public static void main(String[] args) {

//	Exception: Abnormal termination of a program
	
//  Type of Exceptions	
//			Checked Exceptions
//					-> Checked at compile time, extends the "Exception" class
//					-> Method that might throw a checked Exception must declare it in their "Throws" clause.
//					-> Handle it using try/catch
//			Unchecked Exceptions
//					-> Not checked at compile time, extends the "RuntimeException" class	
//					-> Methods that might throw a UnCHecked Exception no need declare it in their "Throws" clause.
//					-> Caught Explicity
	
//	Exception handling: In order to stop abnormal termination of program, we use exception handling
//						try, catch and finally

//		Exceptions handling hierarchy
//		Throwable - mainclass
//		Exceptions - subclass
//		RuntimeException -subclass
//		IO
//		SQL
//		ClassNotFoundExeption
//		ArrayIndexOutOfBoundException
//		StringIndexOutOfBoundException
		
//		Error
//		OutOfMemoryError
//		StackOverflowError
//		VirtualMachineError
//		
		
	
	
	try {
		System.out.println(divide(10, 5));
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e);
		e.printStackTrace();
		
	}
	
	ATM myAtm = new ATM();
	try {
		myAtm.withdraw(99);
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	
	
	
	}	
	
	public static int divide(int a, int b) {
		if (b==0) {
			
				throw new ArithmeticException("Division by zero is NOT POSSIBLE");
		}
			return a/b;
			
			
			
		}
		
	}

	