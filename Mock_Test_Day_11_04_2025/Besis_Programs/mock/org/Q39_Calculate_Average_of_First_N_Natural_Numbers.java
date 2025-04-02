package mock.org;

/*
 * 39. Calculate Average of First N Natural Numbers
Description: Write a program to calculate the average of the first n natural numbers.
Input: n = 5
Output: 3.0
 */

import java.util.*;

public class Q39_Calculate_Average_of_First_N_Natural_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		double sum = 0;
		for(int i=1 ; i<=n ; i++)
		{
			sum = sum + i;
		}
				
		double ave = sum / n;

		System.out.println(ave);
	}

}
