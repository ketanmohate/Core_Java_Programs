package com.java;
import java.util.*;
public class demointerview
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string");
		String s=sc.nextLine();
		
		int sum=0;
		String s1[]=s.split("_");
		
		for(int i=0;i<s1.length;i++)
		{
//			char ch[]=s1[i].toCharArray();
//			String sum="";
//			
//			for(int j=0;j<ch.length;j++){
//				if(ch[j]>=48 && ch[j]<=57){
//					sum=sum+ch[j];
//					//System.out.println(sum);
//				}
//				else{
//					sum="";
//					break;
//				}
//				
//			}
//			if(!sum.isEmpty()){
//			int sum2 = Integer.parseInt(sum);
////			System.out.println(sum2);
//			sum1+=sum2;
//			}
			
			try {
				sum = sum + Integer.parseInt(s1[i]); 
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
		System.out.println(sum);
		
		
	}
}