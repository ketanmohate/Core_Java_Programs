package mock.org;

import java.util.Scanner;

/*
 * 

17. Sum of First N Odd Numbers
Description: Write a program to calculate the sum of the first n odd numbers.
Input: n = 4


Output: 16
 */

public class Q17_Sum_of_First_N_Odd_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1 ; i<=n*2 ; i++)
		{
			if(i%2 != 0)
			{
				sum = sum + i;
			}
		}
		
//		int sum = n * n;
		
		System.out.println(sum);
	}

}
