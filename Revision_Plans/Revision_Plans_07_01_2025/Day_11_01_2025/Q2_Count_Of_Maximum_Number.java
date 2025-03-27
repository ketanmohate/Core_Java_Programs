package Day_11_01_2025;

import java.util.*;

public class Q2_Count_Of_Maximum_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter Araay Element");
		for(int i=0 ; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		int currentCount1 = 0;
		int maxCount1 = 0;
		int currentCount2 = 0;
		int maxCount2 = 0;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if (arr[i] == 1) 
			{
                currentCount1++;
                
                if (currentCount1 > maxCount1) 
                {
                    maxCount1 = currentCount1;
                }
            } 
			
			else 
			{
                currentCount1 = 0;
            }
			
			if(arr[i] == 0) 
			{
                currentCount2++;
                
                if(currentCount2 > maxCount2) 
                {
                    maxCount2 = currentCount2;
                }
            } 
			else 
			{
                currentCount2 = 0; 
            }
			
//			System.out.println("Count1:"+count1);
//			System.out.println("Count2:"+count2);
		}

		if(maxCount1 > maxCount2)
		{
			System.out.println("The maximum number of consecutive 1’s in the array is:- "+maxCount1);

		}
		else
		{
			System.out.println("The maximum number of consecutive 0’s in the array is:- "+maxCount2);
		}
		
	}

}
