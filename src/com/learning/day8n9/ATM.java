package com.learning.day8n9;

public class ATM {
	
	public void withdraw (int amount) throws Exception {
		if(amount < 100) {
			throw new Exception("Enter amount (Min. $100)");
		}
		
		
	}
	
	

}
