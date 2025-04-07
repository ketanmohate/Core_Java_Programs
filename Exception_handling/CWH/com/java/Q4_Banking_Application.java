package com.java;

import java.util.*;

class UserException extends RuntimeException
{
	String foundError()
	{
		return "Balance is not sufficient";
	}
}

class bank
{
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	void withdraw(double amt) 
	{
		if(amt>balance)
		{
			throw new UserException();
		}
		else
		{
			balance = balance - amt;
		}
	}
	
	double balance()
	{
		return balance;
	}
}

public class Q4_Banking_Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		bank b = new bank();
		
		System.out.println("Enter the balance");
		double balance = sc.nextDouble();
		
		b.setBalance(balance);
		
		try
		{
			System.out.println("Enter the Withdraw amount");
			double amt = sc.nextDouble();
	
			b.withdraw(amt);
			
			System.out.println("Balance is:" + b.balance());
		}
		catch(UserException e){
			System.out.println(e.foundError());
			System.out.println("Balance is:" + b.balance());
		}
	}

}
