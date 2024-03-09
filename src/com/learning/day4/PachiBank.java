package com.learning.day4;

public class PachiBank
{
private BankAccount[] accounts; //Don't name variables with uppercase
private int accountsPointer; //This is going to keep track of how many accounts are there in the array

public PachiBank() //The constructor doesn't need to accept any bank account since it'll start as empty
{
 accounts = new BankAccount[10]; //Here we initialize the array
 accountsPointer = 0; //Here the pointer starts as 0 since the array is empty
}
public void addAccount(BankAccount account){
    accountsPointer++;
    if(accountsPointer<10){ //We test it here so it won't throw an out of bounds exeption
        accounts[accountsPointer-1]=account;//It assigns the account to the next empty space on the array
    }
}

public void createAccount(int bankAccount) {}


}
