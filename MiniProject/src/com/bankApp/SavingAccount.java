package com.bankApp;

public class SavingAccount extends AccountDetails{
	
	SavingAccount(int accNo,double accBal){
		super(accNo,accBal);
		System.out.println("Your Saving Account Opended...");
	
	}
	
	 //deposit
	
	public void deposit(double amt) {
		System.out.println("Your A/C depositing Amount : "+amt);
		accBal=accBal+amt;
		System.out.println("Your Balance in Saving Account : "+accBal);
		System.out.println("------------Thank You------------");
	}
	
	//withdraw
	
	public void withdraw(double amt) {
		
		if(amt<=accBal && amt>0) {
		System.out.println("Your A/C Withdrawing Amount : "+amt);
		accBal=accBal-amt;
		System.out.println("Your Balance in Saving Account : "+accBal);
		System.out.println("------------Thank You------------");
		}
		else {
			System.out.println("Transaction Cancelled Due To Insufficient Balance...");
		}
 }

}
