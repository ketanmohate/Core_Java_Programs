package mock.org;

/*
 * 32. Multiplication of Numbers from 1 to N
Description: Write a program to find the multiplication of all numbers from 1 to n.
Input: n = 4


Output: 24
 */

import java.util.*;

public class Q32_Multiplication_of_Numbers_from_1_to_N {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		int sum = 1;
		for(int i=1 ; i<=n ; i++)
		{
			sum = sum * i;
		}
		System.out.println(sum);
	}

}
