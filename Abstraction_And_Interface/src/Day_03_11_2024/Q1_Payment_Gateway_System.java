package Day_03_11_2024;

/*
 * Q1. Payment Gateway System 
Objective: Implement a system for processing different types of payments. 
Requirements: 
Define an Interface: 
Create an interface named PaymentMethod with methods processPayment(double 
amount) and refundPayment(double amount). 
Define an Abstract Class: 
Create an abstract class named BasePayment that implements PaymentMethod. 
Provide a concrete implementation of refundPayment() to display a message indicating the 
refund process. 
Leave processPayment(double amount) abstract. 
Implementing Classes: 
Create a class CreditCardPayment that extends BasePayment and implements 
processPayment() to process credit card payments. 
Create a class PayPalPayment that extends BasePayment and implements 
processPayment() to process PayPal payments. 
Demonstration: 
Create an array of PaymentMethod objects. 
Initialize it with instances of CreditCardPayment and PayPalPayment. 
Call processPayment() and refundPayment() for each payment method to demonstrate 
functionality. 
Expected Output: 
Processing payment of $100.00 via Credit Card. 
Refunding payment of $50.00 via Credit Card. 
Processing payment of $75.00 via PayPal. 
Refunding payment of $30.00 via PayPal. 
 */

import java.util.*;

interface PaymentMethod
{
	void processPayment(double amount);
	void refundPayment(double amount);
}

abstract class BasePayment implements PaymentMethod
{
	
	public void processPayment(double amount) 
	{
//		System.out.println("Refunding payment of $" + String.format("%.2f", amount));	
	}
	
	public void refundPayment(double amount)
	{
		
	}
}

class CreditCardPayment extends BasePayment
{
	public void processPayment(double amount) 
	{
		System.out.println("Processing payment of $ " + (amount) + " via Credit Card.");
	}
	
	@Override
	public void refundPayment(double amount) 
	{
		System.out.println("Refunding payment of $ " + (amount) + " via Credit Card.");
	}
	
}

class PayPalPayment extends BasePayment
{
	public void processPayment(double amount) 
	{
		System.out.println("Processing payment of $ " + (amount) + " via PayPalPayment.");
	}

	@Override
	public void refundPayment(double amount) 
	{
		System.out.println("Refunding payment of $ " + (amount) + " via PayPalPayment.");
	}
}

public class Q1_Payment_Gateway_System 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		PaymentMethod[] pm = new PaymentMethod[3];
				
		for(int i=0 ; i<pm.length ; i++)
		{
			System.out.println("Enter the Process Payment");
			int pp = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Refund Payment");
			int rp = sc.nextInt();
			sc.nextLine();
			
			pm[i] = new CreditCardPayment();
			pm[i] = new PayPalPayment();
			
			pm[i].processPayment(pp);
			pm[i].refundPayment(rp);
			System.out.println("------------------------------------");
			
		}
		
	}

}
