package Day_11_01_2025;

/*
 	Q2. Write a program to calculate the sum of elements in an array of integers using the 
	Integer wrapper class.
	Input: {10, 20, 30, 40}
	Output: Sum = 100
 */

import java.util.*;

public class Q2_Sum_Of_Element_Wrapper_Class 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Integer[] num = {10, 20 , 30, 40};
		
		int sum =0;
		
		for(Integer number : num)
		{
			sum += number;
		}
		System.out.println("Sum : "+ sum);
	}
}

