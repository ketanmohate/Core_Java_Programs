package Secound_Section;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

class Account
{
	Scanner sc = new Scanner(System.in);
	
	private String AcNumber;
	private String AcHolderName;
	private double balance;
	
	Account(String AcNumber, String AcHolderName, double balance)
	{
		this.AcNumber=AcNumber;
		this.AcHolderName=AcHolderName;
		this.balance=balance;
	}
	
	String getAcNumber()
	{
		return AcNumber;
	}
	
	String getAcHolderName()
	{
		return AcHolderName;
	}
	
	double getBalance()
	{
		return balance;
	}
	
	public void deposit(double balance) 
	{
		System.out.println("-----------------------------------------------");
	    System.out.println("Do you want to deposit (Y/N)?");
	    String deposit = sc.nextLine();

	    if (deposit.length() > 0 && (deposit.charAt(0) == 'Y' || deposit.charAt(0) == 'y')) 
	    {
	        System.out.println("Enter the deposit amount:");
	        double depositAmt = sc.nextDouble();
	        sc.nextLine();
	        
	        this.balance += depositAmt;
	        System.out.println("Successfully deposited: " + depositAmt);
	    }
	}	
	
	public void withdraw(double balance)
	{
		System.out.println("-----------------------------------------------");
	    System.out.println("Do you want to withdraw (Y/N)?");
	    String withdraw = sc.nextLine();

	    if (withdraw.length() > 0 && (withdraw.charAt(0) == 'Y' || withdraw.charAt(0) == 'y')) 
	    {
	        System.out.println("Enter the withdraw amount:");
	        double withdrawAmt = sc.nextDouble();
	        sc.nextLine();

	        if (withdrawAmt <= this.balance) 
	        {
	        	this.balance -= withdrawAmt; 
	        	System.out.println("Successfully withdrew: " + withdrawAmt);
	        } 
	        else 
	        {
	        	System.out.println("Insufficient Balance. Current balance: " + this.balance);
	        }
	    }
	}
	
	public void displayAccountInfo() 
	{
		System.out.println("===============================================");
		System.out.println("display Account Information");
		System.out.println("===============================================");
		System.out.println("Account No\t\t" + "Holder Name\t\t" + "Balance");
		System.out.println("-----------------------------------------------------------------------------------");
		
		System.out.println(this.AcNumber + "\t\t" + this.AcHolderName +"\t\t" + this.balance );
	}

}

class Bank
{	
	Scanner sc = new Scanner(System.in);
	private Account[] account;
	
	public void addAccount(Account[] account) 
	{
		System.out.println("Account added successfully...");
		this.account=account;
	}
	
	public void removeAccount(String accountNumber)
	{
		boolean found = false;
			
		for(int i=0;i<account.length;i++)
		{
			if(account[i] != null)
			{
				if (account[i] != null && accountNumber.equals(account[i].getAcNumber())) 
				{
					found = true;
					System.out.println("Account Deleted Successfully");
					account[i] = null;
					break;
				}
			}
		}
		if(found == false)
		{
			System.out.println("Account Not Found!");
		}
	}
	
	public void findAccount(String accountNumber)
	{

		boolean found = false;
		
		for(int i=0;i<account.length;i++)
		{
			if (account[i] != null && accountNumber.equals(account[i].getAcNumber())) 
			{
				found = true;
				System.out.println("Account Found:");
				System.out.println("Account No\t\t" + "Holder Name\t\t" + "Balance");
				System.out.println("-----------------------------------------------------------------------------------");
				System.out.println(account[i].getAcNumber() + "\t\t" + account[i].getAcHolderName() + "\t\t" + account[i].getBalance());
				break;
			}
		}
		if(found == false)
		{
			System.out.println("Account Not Found!");
		}
	}
	
	public void totalBalance()
	{
		double totalBal =0;
		boolean found = false;
		
		for(int i=0;i<account.length;i++)
		{
			if(account[i] != null)
			{
				found = true;
				totalBal = totalBal + account[i].getBalance();
			}
		}
		if(found == true)
		{
			System.out.println("Total Balance:");
			System.out.println(totalBal);
		}
		else if(found == false)
		{
			System.out.println("No Any Account!");
		}
	}
	
	public void displayAllAccounts()
	{
		System.out.println("===============================================================");
		System.out.println("Displye All Acounts");
		System.out.println("===============================================================");
		System.out.println("Account No\t\t" + "Holder Name\t\t" + "Balance");
		System.out.println("------------------------------------------------------------------------------------");
		
		boolean found = false;
		
		for(int i=0;i<account.length;i++)
		{
			if (account[i] != null) 
			{
				System.out.println(account[i].getAcNumber() + "\t\t" + account[i].getAcHolderName() + "\t\t" + account[i].getBalance());
				System.out.println("-----------------------------------------------------------------------------------");
				found = true;
			}
		}
		if (found == false) 
		{
			System.out.println("No Accounts Available!");
		}
	}
}

public class Q3_Banking_Applicaton
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		Bank objBank = new Bank();
		
		Account[] ac ;
		
		System.out.println("Enter Add how Many Account");
		int nAc=sc.nextInt();
		sc.nextLine();

		ac = new Account[nAc];
		
		for(int i=0;i<ac.length;i++)
		{
			System.out.println("Enter the Account Number");
			String AcNumber=sc.nextLine();
			
			System.out.println("Enter the Account Holder Name");
			String AcHolderName=sc.nextLine();
			
			System.out.println("Enter the Balance");
			double balance=sc.nextDouble();
			sc.nextLine();	
			
			ac[i] = new Account(AcNumber,AcHolderName,balance);
			System.out.println("---------------------------------");
			
			objBank.addAccount(ac);
			
			ac[i].deposit(balance);
			ac[i].displayAccountInfo();
			
			ac[i].withdraw(balance);
			ac[i].displayAccountInfo();
			
		}
		
		objBank.displayAllAccounts();

		System.out.println("**************************************************************************");
		
		System.out.println("do you want to Remove any Account");
		String withdraw=sc.nextLine();
		
		if(withdraw.length() > 0 && withdraw.charAt(0) == 'Y' || withdraw.charAt(0) == 'y')
		{
			System.out.println("Enter the Account Number");	
			String acNum=sc.nextLine();
			objBank.removeAccount(acNum);
		}
		
		objBank.displayAllAccounts();
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("do you want to find any Account(Y/N)");
		String find=sc.nextLine();
		if(find.length() > 0 && find.charAt(0) == 'Y' || find.charAt(0) == 'y')
		{
			System.out.println("Enter the Account Number");
			String acNum=sc.nextLine();
			objBank.findAccount(acNum);
		}
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		objBank.totalBalance();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		objBank.displayAllAccounts();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}	
}