package com.learning.productProject;

import java.util.Scanner;

public class ApplicationV2 {

	public static void main(String[] args) {
		 int option = 2;
		 boolean stopp = false;
		
		 
		System.out.println("Welcome to Giga Walmart");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Do you want to add a product?");
		System.out.println("2. Do you want to exit?");
		option = sc.nextInt();
		
		switch (option) {
		case 1: 
			
			System.out.println("menu");
			
			break;
			
		case 2:
			
			System.out.println("exit");
			break;
		}
		
		
			
		
		
		

	}

}

