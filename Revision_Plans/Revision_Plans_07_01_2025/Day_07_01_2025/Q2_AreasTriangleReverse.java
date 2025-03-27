package Day_07_01_2025;

import java.util.*;

public class Q2_AreasTriangleReverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the sixe");
		int size=sc.nextInt();
		
		int arr[][] = new int[size][3];
		
		
		for(int i=0 ; i<arr.length ; i++)
		{	
			System.out.println("\nEnter the triangles: ");
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			int c = sc.nextInt();
//			arr[i][0] = a;
//			arr[i][1] = b;
//			arr[i][2] = c;
			
			for(int j=0 ; j<arr[i].length ; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		

		int arrArea[] = new int[size];
		int m=0;
		
		for(int i=0;i<arr.length ; i++)
		{
			int sum=0;
			
			for(int j=0 ; j<arr[i].length ; j++)
			{
				sum = sum + arr[i][j];
			}
			
			int area = sum / 2;
			
//			System.out.println(area);

			arrArea[m] = area;
			m++;
		}
		
//		System.out.println("Soft");
//		for(int i=0 ; i<arrArea.length ;i++)
//		{
//			System.out.println(arrArea[i]);
//		}
		
		for(int i=0 ; i<arrArea.length ;i++)
		{
			for(int j=i+1 ; j<arrArea.length ; j++)
			{
				if(arrArea[i] > arrArea[j])
				{
					int temp = arrArea[i];
					arrArea[i] = arrArea[j];
					arrArea[j] = temp;
					
					int []temp1 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp1;

				}
			}
		}
		
		for(int i = 0; i <arr.length;i++)
		{
			for(int j=0 ; j<arr.length ; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
