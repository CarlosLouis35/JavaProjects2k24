package com.learning.day4;

public class ArraysIntro {

	public static void main(String[] args) {
	
		// Array size is fixed		
		// Same datatype can only be stored.
		// It will give you certain methods to do certain action.
				
		// dataType[] arrayVariableName = new dataType[sizeOfArray];
		
		int[] intArray = new int[5];
		
		intArray[0]=100;
		intArray[1]=200;		
		intArray[2]=300;
		intArray[3]=400;
		intArray[4]=500;
		
	
		// index =(length-1) 0,1,2,3,4
		// dataType[] arrayVariableName = { elements... };		
		int[] intArray2  =  {1,2,3,4,5};
		
		
		String[] nameAry = {"Ana", "Joe", "Kim", "Roy", "Rose"};
		
		System.out.println(nameAry.length);
		
		for (int index = 0; index < nameAry.length; index++) {
			System.out.println(nameAry[index]);
		}
		
		System.out.println("-----------------------------------------------------");
		
		int[] ary1 = {1,2,3,4,5};
		int[] ary2 = {10,20,30,40,50};
		
		int [][] combinedArray = { //       0  1  2  3  4  
				{1,2,3,4,5},       // -> 0 {1, 2, 3, 4, 5}
				{10,20,30,40,50}   // -> 1 {10,20,30,40,50}
		};
		
		System.out.println(combinedArray[1][2]);
		System.out.println(combinedArray[0][4]);
		
		for (int i = 0; i < combinedArray.length; i ++) {
			System.out.println("index -"+ i);
			
			int [] temp = combinedArray[i];
			
			for (int j = 0; j < temp.length; j ++) {
		    
				 System.out.println(" " + i + " " + j);
			
			}
		};
		System.out.println("---------------------------------");
		
		
	     
		// Bank class -> accountsAry, accountposition=0 => attribute, 
//		              -> openAccount -> method -> create a object and it will add it to accountsAry
//		                               -> accountposition++
//		              -> closeAccount-> remove the object from array and chnage to null.
//		              -> getMyaccountByPosition -> inputposition.

		   Bank bank1 = new Bank();
		   
		   bank1.openAccount(1234567, 1000,1234, "qwert", "asdfgh", 123456789); //0
		   bank1.openAccount(1234, 500,1234, "qwt", "agh", 123789);   //1
		   bank1.openAccount(34567, 2500,1234, "ert", "asdfgh", 126789); // 2
		   bank1.openAccount(1234567, 1000,1234, "qwert", "asdfgh", 123456789); //3
		   bank1.openAccount(1234, 500,1234, "qwt", "agh", 123789);   //4
		   bank1.openAccount(34567, 2500,1234, "ert", "asdfgh", 126789); //5
		   bank1.openAccount(1234567, 1000,1234, "qwert", "asdfgh", 123456789); //6
		   bank1.openAccount(1234, 500,1234, "qwt", "agh", 123789);   //7
		   bank1.openAccount(34567, 2500,1234, "ert", "asdfgh", 126789); // 8
		   bank1.openAccount(1234567, 1000,1234, "qwert", "asdfgh", 123456789); //9
		   
		  BankAccount myaccount =  bank1.getMyaccountByPosition(1);
		 
		  System.out.println(myaccount.checkBalance());
		
		
	
		
		

	} }


