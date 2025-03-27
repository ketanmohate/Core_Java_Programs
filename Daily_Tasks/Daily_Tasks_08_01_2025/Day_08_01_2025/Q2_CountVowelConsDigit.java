package Day_08_01_2025;

import java.util.Scanner;

public class Q2_CountVowelConsDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		
		int vCount=0;
		int cCount=0;
		int dCount=0;
		int sCount=0;
		
		
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i] <='z' || ch[i]>='A' && ch[i] <='Z')
			{
				if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O')
				{
					vCount++;
					//vowels
				}
				else
				{
					cCount++;
					//constant
				}
			}
			
			else if(ch[i]>= 48 && ch[i] <=57)
			{
				//digit
				dCount++;
			}
			
			else
			{
				sCount++;
				// special characters
			}
		}
					
			System.out.println("Vowels Is:\t"+vCount);
			System.out.println("constant Is:\t"+cCount);
			System.out.println("Digit Is:\t"+dCount);
			System.out.println("Special Characters Is:\t"+sCount);
	}

}
