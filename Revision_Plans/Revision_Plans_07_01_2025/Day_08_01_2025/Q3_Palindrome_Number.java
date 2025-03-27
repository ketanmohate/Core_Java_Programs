package Day_08_01_2025;

import java.util.*;

public class Q3_Palindrome_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		
		int temp = num;
		
		if(temp>0)
		{
			int rev=0;
			
			while(temp != 0)
			{
				int rem = temp % 10;
				rev = rev * 10 + rem;
				temp= temp / 10;
			}
			
			if(num==rev)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("False");
			}
			
		}
		else
		{
			System.out.println("False");
		}
		
	}

}
