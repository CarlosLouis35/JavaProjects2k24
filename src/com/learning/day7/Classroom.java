package com.learning.day7;

import java.util.Scanner;

public class Classroom {

	public static void main(String[] args) {


//		take a
//		name
//		id
//		course
//		marks
//		input from user
		
//		output
//		Joy with id : 12 enrolled in a course : Fullstack Developer and received 90 marks
		String name;
		int id;
		String course;
		int mark;
		boolean yes = true;
		
		Scanner stu = new Scanner(System.in); //It will enable input and will scan it for output and storaging values

		
		while (yes = true) {
		

		System.out.println("Enter your name:");
			name  = stu.nextLine();
		
		System.out.println("Enter student ID:");
			id = stu.nextInt();
		stu.nextLine();   //Line needed to move to the next line because int has no next line
		
		System.out.println("Enter your Course:");
		 course = stu.nextLine();
		
		System.out.println("Enter student mark:");
		 mark = stu.nextInt();
		stu.nextLine();   //Line needed to move to the next line because int has no next line
		
		
		
		
		
		String m1 = " with Student ID ";
		String m2 = " enrolled in a course ";
		String m3 = " and received ";
		
		System.out.println(name+m1+id+m2+course+m3+mark);
		
		System.out.println("Start again?");
		
		yes = stu.nextBoolean();
		stu.nextLine();
		
		if(!yes) {
			System.out.println("Stopping");
		break;}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
