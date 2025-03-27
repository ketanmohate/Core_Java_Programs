package Assignment_23_09_2024;

import java.util.*;

class AlterMerge 
{
	char word1[];
	char word2[];
	
	AlterMerge(char word1[],char word2[])
	{
		this.word1=word1;
		this.word2=word2;
	}
	
	char[] getMergedArray()
	{		
	
		int size3 = word1.length + word2.length;

		char word3[] = new char[size3];
		
		int k=0;
		

		
		int m=0;
		int j=0;
		for(int i=0;i<word3.length;i++)
		{
			boolean flag =  false;
			
			if(flag == false)
			{
				for(;j<word1.length;)
				{
					word3[k] = word1[j];
					flag = true;
					k++;
					j++;
					break;
				}
			}
			else if(flag == true)
			{
				for(;m<word2.length;)
				{
					word3[k]=word2[m];
					flag = false;
					k++;
					m++;
					break;
				}
			}
		}
		return word3;
	}
}

public class Q1_Merge_Array_Alternate_Order 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first array");
		int size1 = sc.nextInt();
		
		char word1[] = new char[size1];
		for(int i=0;i<word1.length;i++)
		{
			word1[i]=sc.next().charAt(0);
		}
		
		System.out.println("Enter the size of secound array");
		int size2 = sc.nextInt();
		
		char word2[] = new char[size2];
		for(int i=0;i<word2.length;i++)
		{
			word2[i] = sc.next().charAt(0);
		}
		
		AlterMerge obj = new AlterMerge(word1 , word2);
		
		System.out.println("Display Morge array");
		
		for(int i=0;i<obj.getMergedArray().length;i++)
		{
			System.out.println(obj.getMergedArray()[i]);
		}
	}

}
