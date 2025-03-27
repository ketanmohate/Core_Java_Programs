package com.java;
public class PatternUpPyranid{
	public static void main(String arg[]) {
		int count=11;
		int count1=0;
		int j=9;
		for(int i=1;i<=5;i++)
		{ 
			count=count-2;
		
			count1=0;
			for( j=1;j<=9;j++)
			{
				if(j<=count) 
				{
					
					if(j<=6-i)
					{
						System.out.print(++count1);
						
					}
					else if(j>=6-i)
					{
						
						System.out.print(--count1);
					}
				}
			}
			System.out.println();

		}
	}
}