package oop.org;

/*
 * Q2. WAP to create class name as Factorial with two functions 
void setNumber(): this function can accept the number as parameter
void displayFactorial(): this function can display the factorial of number 
 */

import java.util.*;

class Factorial
{
	int num;
	void setNumber(int num)
	{
		this.num = num;
	}
	
	void displayFactorial()
	{
		int fact = 1;
		for(int i=1 ; i<=num ; i++)
		{
			fact = fact * i; 
		}
		
		System.out.println("factorial is:\t" + fact);
	}
}

public class Q2_Display_the_factorial_of_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		Factorial fact = new Factorial();
		
		fact.setNumber(num);
		fact.displayFactorial();
	}

}
