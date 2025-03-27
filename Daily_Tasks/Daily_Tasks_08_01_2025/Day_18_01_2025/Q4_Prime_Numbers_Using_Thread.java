package Day_18_01_2025;

/*
 * Q4. Write a program where each thread calculates the prime numbers within a given range (e.g., 1 to 100). 
 * The main thread should wait for all threads to complete using the join() method and then display the results.
 */

import java.util.*;

class PrimeNumber extends Thread
{
	int num;
	
	PrimeNumber(int num)
	{
		this.num=num;
	}
	
	public void run()
	{

		System.out.println("Prime Numbers:");
		for(int i=2 ; i<=num ; i++)
		{
			int count=0;
			for(int j=1 ; j<=i ; j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.println(i);
			}
		}
	}
}

public class Q4_Prime_Numbers_Using_Thread 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		PrimeNumber pn  = new PrimeNumber(num);
	
		pn.start();
		
		try 
		{
			pn.join();
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Error Is:" + e.getMessage());
		}
	}
}
