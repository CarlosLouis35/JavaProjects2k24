package com.learning.day4;

public class Assessmodifiers {
	
	public static void main(String[ ]Args) {
		//Assess Modifiers - controls the access level
		
//		public    --- This will be accessible for all classes
//		private   --- This will be accessible with in that declared class (Where is declared)
//		default   --- This will be accessible with in the same package, if you don't specify a modifier 
//		              Java will assign a default modifier.
//		protected --- This will be accessible with in the same package and subclasses.
		
		BankAccount carlosAccount = new BankAccount(123456789, 10.12, 9022, "Carlos69", "KnowDaWae2020", 333222111);
		
		System.out.println(carlosAccount.checkBalance());
		
		carlosAccount.deposit(2500);
		System.out.println(carlosAccount.checkBalance());
		
		carlosAccount.withdraw(24.25);
		System.out.println(carlosAccount.checkBalance());
		
	}

}
