package mock.org;

/*
 * 20. Sum of Squares of First N Natural Numbers
Description: Write a program to calculate the sum of squares of the first n natural numbers.
Input: n = 3


Output: 14
 */

import java.util.*;

public class Q20_Sum_of_Squares_of_First_N_Natural_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1 ; i<=n ; i++)
		{
			sum  = sum + (i*i);
		}
		
		System.out.println(sum);
	}

}
