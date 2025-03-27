package Day_18_01_2025;

/*
 * Q1. WAP to create two threads in java Even and Odd and print even numbers between 1 to 10 using Even 
 * thread and Odd values between  1 to 10 using Odd Thread using join method.
 */

import java.util.*;

class Even extends Thread
{
	public void run() 
	{
		try
		{
			for(int i=1 ; i<=10 ; i++)
			{
				if(i%2 == 0)
				{
					System.out.println("Even Number:\t" + i);
					sleep(1000);
				}
			}
		}
		
		catch (InterruptedException e) 
		{
			System.out.println("Error Is"+e);
		}
	}
}

class Odd extends Thread
{
	public void run() 
	{
		try
		{
			for(int i=1 ; i<=10 ; i++)
			{
				if(i%2 != 0)
				{
					System.out.println("Odd Number:\t" + i);
					sleep(1000);
				}
			}	
		}
		catch (InterruptedException e) 
		{
			System.out.println("Error Is"+e);
		}
	}
}

public class Q1_Even_Odd_Using_MultiThreding 
{
	public static void main(String[] args) 
	{
		Even e = new Even();
		e.start();
		try 
		{
			e.join();
		} 
		catch (InterruptedException e1) 
		{
			System.out.println("Error Is"+e1);
		}
		
		Odd o = new Odd();
		o.start();
		
	}

}
