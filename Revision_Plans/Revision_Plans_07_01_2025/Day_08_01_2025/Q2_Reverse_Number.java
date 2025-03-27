package Day_08_01_2025;

import java.util.*;

public class Q2_Reverse_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Numebr:");
		int num = sc.nextInt();
		
		int temp=num;
		
		int rev=0;
		
		while(temp != 0)
		{
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp= temp / 10;
		}
		
		System.out.println(rev);
	}

}
