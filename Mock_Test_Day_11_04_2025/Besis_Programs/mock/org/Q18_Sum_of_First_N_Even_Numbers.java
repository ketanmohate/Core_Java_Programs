package mock.org;

/*
 18. Sum of First N Even Numbers
Description: Write a program to calculate the sum of the first n even numbers.
Input: n = 4


Output: 20
 */

import java.util.*;

public class Q18_Sum_of_First_N_Even_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
//		int sum = 0;
		
//		for(int i=1 ; i<=n*2 ; i++)
//		{
//			if(i%2 == 0)
//			{
//				sum = sum + i;
//			}
//		}
		
		int sum = n * (n+1);
		
		System.out.println(sum);
	}

}
