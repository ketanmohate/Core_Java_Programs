package com.java;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 1;
		for(int i =1;i<=7 ;i++)
		{
			int cnt1 = 0;
			for(int j = 1 ;j<=cnt;j++ )
			{
				if(i<=4)
				{
					if(j!=1 && cnt!=j)
					{
						System.out.print(cnt1 +" ");
					}
					else
					{
						System.out.print("* ");
					}
				}
				else 
				{ 
					if(j!=1 && cnt!=j)
					{
						System.out.print(cnt1 +" ");
					}
					else
					{
						System.out.print("* ");
					}
				}
				if(j<4)
				{
					cnt1=cnt1+1;
				}
				else
				{
					cnt1 = cnt1-1;
				}
			}
			if(i<4)
			{
				cnt = cnt +2;
			}
			else
			{
				cnt = cnt -2;
			}
			System.out.println();
		}
	}
}
