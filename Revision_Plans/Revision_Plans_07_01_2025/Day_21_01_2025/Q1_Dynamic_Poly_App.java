package Day_21_01_2025;

import java.util.*;

interface Num
{
	void setValue(int value);
	int getResult();
}

class Reverce implements Num
{
	private int num;
	private int reverce;
	
	public void setValue(int value) 
	{
		this.num=value;
	}
	
	public int getResult() 
	{
		int temp = num;
		
		while(temp != 0)
		{
			int rem = temp % 10;
			reverce = reverce * 10 + rem;
			temp = temp /10;
		}
		
		return reverce;
	}
	
}

class CountDigit implements Num
{
	private int num;
	private int count;
	
	public void setValue(int value) 
	{
		this.num=value;
	}
	public int getResult() 
	{
		int temp=num;
		
		if (num == 0) 
		{
            count = 1;
		}
		else
		{
			while(temp != 0)
			{
				temp = temp/10;
				count++;
			}
		}
		
		return count;
	}
	
}

class NumberHelper 
{
	void performOperation(Num n)
	{
		 System.out.println("Result: " + n.getResult());
	}
}
public class Q1_Dynamic_Poly_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num = sc.nextInt();

		NumberHelper h = new NumberHelper();
		
		boolean flag = true;
		
		do
		{
			System.out.println("===============================================");
			System.out.println("Choose Operation:");
			System.out.println("===============================================");
			
	        System.out.println("1. Reverse the number");
	        System.out.println("2. Count the digits");
//	        System.out.println("3. Exit");
	        System.out.println("-----------------------------------------------");
	        
	        
	        System.out.println("Enter the choice");
	        int choice = sc.nextInt();
	        
	        Num operation = null;
	        
	        switch (choice) 
	        {
            	case 1:
            		operation = new Reverce();
            		break;
            		
            	case 2:
            		operation = new CountDigit();
            		break;
            		
//            	case 3:
//            		flag=false;
//            		break;
            		
            	default:
            		System.out.println("Invalid choice!");
            		return;
	        }
	        
	        operation.setValue(num);
	        h.performOperation(operation);
			
		}while(flag);

		
	}

}
