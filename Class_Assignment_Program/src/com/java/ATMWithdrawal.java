package com.java;
/* Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an attempted transaction. */
import java.util.Scanner;

public class ATMWithdrawal 
{
	public static void main(String[] args) 
	{	
		
		Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter withdrawal amount: ");
        	int withdrawalAmount = scanner.nextInt();
        	System.out.print("Enter account balance: ");
        	double accountBalance = scanner.nextDouble();
        	final double bankCharge = 0.50;
        	if (withdrawalAmount % 5 == 0 && accountBalance >= (withdrawalAmount + bankCharge)) 
		{
			accountBalance -= (withdrawalAmount + bankCharge);
		}
        	System.out.printf("Account balance after transaction: %.2f", accountBalance);
	}
}
