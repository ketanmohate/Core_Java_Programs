package com.java;

import java.util.*;

class OccurrencesApp
{
	Scanner sc = new Scanner(System.in);
	
	char arr[];
	
	public void accInput(char arr[])
	{
		this.arr=arr;
		System.out.println("Enter the charactor");
		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i]=sc.next().charAt(0);
		}		
	}
	
	public void display()
	{
		System.out.println("display Element");
		
		for(int j='a' ; j<='z' ;j++)
		{
			int count =0;
			
			for(int i=0 ; i<arr.length;i++)
			{
				if(arr[i]== (j))
				{
					count++;
				}
				else
				{
					continue;
				}
			}
			System.out.printf("%c%d",j,count);
			break;
		}
	}
}

public class Q3_String_Occurrences_Of_Each_Character_App 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Charactor");
		int size=sc.nextInt();
		
		char arr[] = new char[size];
				
		OccurrencesApp objOccurrencesApp = new OccurrencesApp();
		
		objOccurrencesApp.accInput(arr);
		objOccurrencesApp.display();
	}
}
