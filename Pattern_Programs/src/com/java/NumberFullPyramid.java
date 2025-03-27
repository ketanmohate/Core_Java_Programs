package com.java;

public class NumberFullPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =1;
		int flag=1;
		for(int i=1;i<=5;i++) {
			count=i-1;
			for(int j=1; j<=17; j++) 
			{
				if(j>=10-(i*2-1) && j<=(8+i*2-1) && flag==1)
				{
					
					if(j<10)
					{
						++count;
					}
					else 
					{
						
						count--;
					}
					
				System.out.print(count);
				flag=0;
			}
			else {
				
				System.out.print(" ");
				flag=1;
			}
		}
			System.out.println();
		
		}

	}

}