package Day_15_01_2025;

/*
 * Q2.Program to Validate an IP address
Input : "125.512.100.1"
Output : Invalid

192.168.123.132
 */

import java.util.*;

public class Q2_Validate_IP_Address 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		char[] ch = str.toCharArray();
		

		int finalcount=0;
		
		for(int i=0 ; i<ch.length ; i+=4)
		{
			int count=0 ;
			if(ch[i]>=48 && ch[i]<=57 && ch[0] != '0')
			{
				for(int j=i ; j<ch.length ; j++)
				{
					if(ch[j]>='0' && ch[j]<='9' && ch[0] != '0')
					{
						count++;
					}
					else if(ch[j] =='.')
					{
						count=0;
					}
				}
				
				System.out.println(count);
				
				if(count==3)
				{
					finalcount++;
				}
			}
			
		}
		
		if(finalcount==4)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("In Valid");
		}

	}

}
