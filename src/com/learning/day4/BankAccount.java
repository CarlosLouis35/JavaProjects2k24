package com.learning.day4;



public class BankAccount {
	
	private int accountNumber;
	
	public String accountHolderName;
	public int phonenumber;
	public String address;
	
	private double balance;
	private int pin;
	
	public String userName;
	private String password;
	private int SSN;
	
	protected double loanAmount;
	protected double loanRate;

	
	public BankAccount(int accountNumber, double balance, int pin, String userName, String password, int SNN) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.userName = userName;
		this.password = password;
		this.pin = pin;
		this.SSN = SNN;		
	}
	
	public void deposit(double money) {
		this.balance = this.balance + money;
	}
	
	
	public double withdraw(double money) {
		 this.balance = this.balance - money;
		 return money;
		
	}
	
	public double checkBalance() {
		return this.balance;
	}
	
	
	
	public void chnagePin() {
		
	}
	
	
	protected void takeALoan(double loanMoney) {
		this.loanAmount = loanAmount+loanMoney;
	}
	
	
	
}
