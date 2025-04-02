package mock.org;

/*
 * 48. Sum of First N Divisible by 3
Description: Write a program to calculate the sum of the first n numbers divisible by 3.
Input: n = 4


Output: 18
 */

import java.util.*;

public class Q48_Sum_of_First_N_Divisible_by_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		int sum = 0;
		int count = 0;
		
		for(int i=1 ; ; i++)
		{
			if(i%3 == 0)
			{
				sum = sum + i;
				count++;
			}
			if(count == n)
			{
				break;
			}
		}
		System.out.println(sum);
	}

}
