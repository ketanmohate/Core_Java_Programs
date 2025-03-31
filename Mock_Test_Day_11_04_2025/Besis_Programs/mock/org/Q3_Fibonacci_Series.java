package mock.org;

/*
 3. Fibonacci Series
Description: Write a program to print the first n Fibonacci numbers.
Input: n = 5


Output: 0 1 1 2 3
 */

import java.util.*;

public class Q3_Fibonacci_Series {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		for(int i=1 ; i<=num ; i++)
		{
			c = a+b;
			System.out.print(a);
			a = b;
			b = c;
		}
	}
}
