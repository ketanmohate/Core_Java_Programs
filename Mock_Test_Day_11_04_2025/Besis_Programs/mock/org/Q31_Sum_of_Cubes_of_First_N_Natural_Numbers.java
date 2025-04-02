package mock.org;

/*
 * 31. Sum of Cubes of First N Natural Numbers
Description: Write a program to calculate the sum of cubes of the first n natural numbers.
Input: n = 3


Output: 36
 */

import java.util.*;

public class Q31_Sum_of_Cubes_of_First_N_Natural_Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=3 ; j++)
			{
				sum = sum + (i*j);
			}
			
		}
		System.out.println(sum);
	}

}
