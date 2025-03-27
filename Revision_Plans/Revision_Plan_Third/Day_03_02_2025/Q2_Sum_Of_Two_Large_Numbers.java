package Day_03_02_2025;

/*
 Q2. Program to Find the Sum of Two Large Numbers.
Input  : str1 = "7777555511111111", 
             str2 =  "3332222221111"
Output : 7780887733332222
 */

import java.util.*;

public class Q2_Sum_Of_Two_Large_Numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String:-");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the secound String:-");
		String str2 = sc.nextLine();
				
		long sum = Long.parseLong(str1) + Long.parseLong(str2);
		
		System.out.println("Sum id:\t"+sum);
	}
}
