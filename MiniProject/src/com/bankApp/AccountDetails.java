package com.bankApp;

public abstract class AccountDetails {

	int accNo;
	double accBal;
	public AccountDetails(int accNo, double accBal) {
		super();
		this.accNo = accNo;
		this.accBal = accBal;
		System.out.println("-------------Welcome-------------");
		System.out.println("Your Account Created Succesfully...");
	}
	
	abstract void deposit(double amt);
	abstract void withdraw(double amt);
	//get Balance
	final void balanceEnquiry() {
		System.out.println("Your Account Balance : "+accBal);
		System.out.println("------------Thank You------------");
	}
}
