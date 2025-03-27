package Looping.programs;

/*10.	Write a C program to count number of digits in a number.*/

import java.util.*;

public class Q10_Count_No_Of_Digit_In_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int count=0;
		while(num !=0)
		{
			count++;
			num = num/10;
		}
		
		System.out.println("Number Of Count In Digit:\t" + count);
	}
}
