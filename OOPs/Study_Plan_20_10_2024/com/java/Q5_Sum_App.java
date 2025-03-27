package com.java;

/*
 5.WAP program create the class name as Sum with a following methods  
class Sum 
{ void calSum(int ...x) //method with var-args 
{//here we need to calculate the sum of all elements 
} 
} 
public class SumApplication 
{  public static void main(String x[]) 
{//here we need to create the object of Sum class and call the calSum() method and pass  
//parameter in it  
} 
} 
 */
import java.util.*;

class Sum
{
	 void calSum(int ...x)
	 {
		 int sum=0;
		 for(int i=0;i<x.length;i++)
		 {
			 sum=sum+x[i];
		 }
		 System.out.println("Sum Of elements:\t"+sum);
	 }
}

public class Q5_Sum_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No of elements");
		int noElem=sc.nextInt();
		
		int[] arrSum = new int[noElem];
		
		for(int i=0;i<arrSum.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" elements");
			arrSum[i]=sc.nextInt();
		}
		
		Sum SumObj = new Sum();
		SumObj.calSum(arrSum);
	}

}
