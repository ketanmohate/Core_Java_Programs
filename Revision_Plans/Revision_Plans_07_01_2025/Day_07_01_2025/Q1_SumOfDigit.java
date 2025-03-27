package Day_07_01_2025;

/*Example1:
_________________________________________________________________
Objective

The modulo operator, %, returns the remainder of a division. For example, 4 % 3 = 1 and 12 % 10 = 2. The ordinary division operator, /, 
returns a truncated integer value when performed on integers. For example, 5 / 3 = 1. 
To get the last digit of a number in base 10, use  as the modulo divisor.

Task

Given a five digit integer, print the sum of its digits.
Input Format

The input contains a single five digit number, n

Constraints

10000<=n<=99999

Output Format

Print the sum of the digits of the five digit number.



Sample Input 0

10564
Sample Output 0

16
*/

import java.util.*;

public class Q1_SumOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		
		int temp=num;
		
		int sum=0;
		
		while(temp != 0)
		{
			int rem = temp % 10;
			sum = sum +rem;
			temp = temp/10;
		}
		System.out.println("Sum Of Number:-"+sum);
	}

}
