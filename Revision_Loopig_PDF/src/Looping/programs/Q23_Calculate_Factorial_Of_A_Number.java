package Looping.programs;

/*23.	Write a C program to calculate factorial of a number.*/

	import java.util.*;
	
	public class Q23_Calculate_Factorial_Of_A_Number 
	{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Number");
			int num = sc.nextInt();
			
			int factorial = 1;
			
			for(int i=1 ; i<=num ; i++)
			{
				factorial = factorial * i;
			}
			
			System.out.println("Factorial Is:\t" + factorial);
		}
	}
