package com;

public class AbhiTestPattern 
{
	public static void main(String[] args) 
	{
		int flag = 0;
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=9 ; j++)
			{
				if(j>=6-i && j<=5 && flag == 0)
				{
					System.out.print("* ");
					flag=1;
				}
				else if( j>5 && j<=4+i && flag == 0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
					flag=0;
				}
			}
			System.out.println();
		}
	}
}
