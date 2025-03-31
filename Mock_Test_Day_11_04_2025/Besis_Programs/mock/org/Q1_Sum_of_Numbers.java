package mock.org;

/*
 * . Sum of Numbers
Description: Write a program to calculate the sum of numbers from 1 to n.
Input: n = 5
Output: 15
 */

import java.util.*;

public class Q1_Sum_of_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		int sum = 0;
	
		for(int i=1 ; i<=n ; i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum Is\t" + sum);
	}

}
