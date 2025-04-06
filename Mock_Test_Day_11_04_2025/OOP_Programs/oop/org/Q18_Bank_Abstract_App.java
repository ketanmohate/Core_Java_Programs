package oop.org;

/*
 * Q18. Bank Abstract Class
Problem: Create an abstract class Bank with the following methods:
deposit(double amount) — allows depositing an amount.
withdraw(double amount) — allows withdrawing an amount.
getBalance() — returns the current balance.
Then, create two subclasses:
SavingsBank — charges a fixed fee of $2 per transaction.
CurrentBank — charges a fixed fee of $5 per transaction.
Write a program that deposits and withdraws money from both types of banks and displays the 
balance after each transaction.
Explanation:
The abstract class Bank defines the common structure for the deposit, withdraw, and balance methods.
Each subclass applies a different transaction fee.
Logical operation: Use method overriding to show different transaction fees for each type of bank.

 */

abstract class Bank 
{
	double balance;
	
	public Bank(double balance)
	{
		this.balance = balance;
	}
	
	public abstract void deposit(double amount);
	
	public abstract void withdraw(double amount);
	
	public double getBalance()
	{
		return balance;
	}
}

class SavingsBank extends Bank
{

	public SavingsBank(double balance) {
		super(balance);

	}

	public void deposit(double amount) {

		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}
	
}

class CurrentBank extends Bank
{

	public CurrentBank(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Q18_Bank_Abstract_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
