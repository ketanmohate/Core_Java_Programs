package Day_18_01_2025;

/*
 * Q2. Calculate Factorial Using a Thread
Write a program where one thread calculates the factorial of a given number.
Pass the number as an argument to the thread.
Print the result in the thread's run() method.
 */

import java.util.*;

class factorial extends Thread
{
	int n;

	
	factorial(int n) 
	{
		this.n=n;
	}
	
	public void run()
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{

			fact=fact*i;
		}
		System.out.println("Factorial:\t" + fact);
	}
}

public class Q2_Calculate_Factorial_Using_Thread 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		factorial f = new factorial(n);
		f.start();
	}
}
