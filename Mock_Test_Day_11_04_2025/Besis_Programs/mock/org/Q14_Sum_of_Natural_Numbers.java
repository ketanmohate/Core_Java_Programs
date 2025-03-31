package mock.org;

/*
 * 14. Sum of Natural Numbers
Description: Write a program to find the sum of the first n natural numbers.
Input: n = 5


Output: 15
 */

import java.util.*;

public class Q14_Sum_of_Natural_Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1 ; i<=n ; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
