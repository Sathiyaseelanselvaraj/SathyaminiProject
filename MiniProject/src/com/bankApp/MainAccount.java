package com.bankApp;

import java.util.Scanner;

public class MainAccount {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter new AccNo & Send Min AccBal :");
      int acno=sc.nextInt();
      double acbal=sc.nextDouble();
		SavingAccount sal = new SavingAccount(acno,acbal);

		sal.balanceEnquiry();
		
		System.out.println("Enter deposit Amount :");
		double d_amt=sc.nextDouble();
		sal.deposit(d_amt);
		
		System.out.println("Enter withdraw Amount :");
		double w_amt=sc.nextDouble();
		sal.withdraw(w_amt);
	}

}
