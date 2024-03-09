package com.learning.day6;

import java.util.Scanner;

public class ScannerIntro {

	public static void main(String[] args) {
		
//     Scanner class is used to get user input
//	   It's imported from java.util
//		Scanner object    -> system.in
//		-> nextLine() -> String
//		-> nectBoolean();
//		-> nectInt();
//		ect
//		..... -> next()
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = scanner1.nextLine();
		
		System.out.println("Enter your last name:");
		String lname = scanner1.nextLine();
		
		// rest of practice inputs
		
		System.out.println("Enter your phone number:");
		long phoneNum = scanner1.nextLong();
		
		scanner1.nextLine();
		
		System.out.println("Enter your email:");
		String email = scanner1.nextLine();
		
		System.out.println("Enter your date of birth (mm/dd/yyyy):");
		String dob = scanner1.nextLine();
		
		System.out.println("Enter your age:");
		int age = scanner1.nextInt();
		
		scanner1.nextLine();
		
		System.out.println("Enter your address:");
		String address = scanner1.nextLine();

		System.out.println("------------------------------------");
		
		System.out.println("First name: "+name);
		System.out.println("Last name: "+lname);
		// rest of practice inputs output
		System.out.println("Phone number: "+phoneNum);
		System.out.println("eMail: "+email);
		System.out.println("Date of Birth (mm/dd/yyyy): "+dob);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
		
		

		
		System.out.println("------------------------------------");
		
//   Take a input
//		name
//		last name
//		phone number
//		email
//		dob
//		age
//		address
//		
		
		
		
		
		
		

	}

}
