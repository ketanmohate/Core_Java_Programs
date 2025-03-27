package Assignment_26_09_2024;

/*
 Q. WAP to Create parent class name as Bank with one method name as 
public float getMonthlyEmiUsingSimpleInterest(int loanAmont,int duration)
: this method can calculate the monthly emi using simple interest rate 9%
Note: you have to create two more child class name as Cooperative and Nationalize 
and you have to inherit Bank class in Cooperative and Nationalize class and override 
getMonthlyEmiUsingSimpleInterest(int loanAmont,int duration) in both classes and 
Cooperative class calculate monthly EMI using interest rate 10% and Nationalize 
class calculate monthly EMI using 7% interest.
 */

import java.util.*;

class Bank
{
	public float getMonthlyEmiUsingSimpleInterest(int loanAmont,int duration)
	{
	    float rate = 9; // 9% interest rate
	    float simpleInterest = (loanAmont * rate * duration) / 100;
	    float totalAmount = loanAmont + simpleInterest;
	    float emi = totalAmount / (duration * 12);
	    return emi;
	}
}

class Cooperative extends Bank
{
	public float getMonthlyEmiUsingSimpleInterest(int loanAmont,int duration)
	{
	    float rate = 10; // 10% interest rate
	    float simpleInterest = (loanAmont * rate * duration) / 100;
	    float totalAmount = loanAmont + simpleInterest;
	    float emi = totalAmount / (duration * 12); 
	    return emi;
	}
}

class Nationalize extends Bank
{
	public float getMonthlyEmiUsingSimpleInterest(int loanAmont,int duration)
	{
	    float rate = 7; // 7% interest rate
	    float simpleInterest = (loanAmont * rate * duration) / 100;
	    float totalAmount = loanAmont + simpleInterest;
	    float emi = totalAmount / (duration * 12);
	    return emi;
	}
}

public class Q1_Emi_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Bank bank = new Bank();
		
		System.out.println("Enter the loan Amont");
		int loanAmont = sc.nextInt();
		
		System.out.println("Enter the duration");
		int duration = sc.nextInt();
		
		//Nationalize objNationalize= new Nationalize();
		bank = new Nationalize();
		System.out.println("Monthly Emi Using Simple Interest:\t"+bank.getMonthlyEmiUsingSimpleInterest(loanAmont, duration));
		
		//Cooperative objCooperative= new Cooperative();
		bank = new Cooperative();
		System.out.println("Monthly Emi Using Simple Interest:\t"+bank.getMonthlyEmiUsingSimpleInterest(loanAmont, duration));
		
		bank = new Bank();
		System.out.println("Monthly Emi Using Simple Interest:\t"+bank.getMonthlyEmiUsingSimpleInterest(loanAmont, duration));
		
	}

}
