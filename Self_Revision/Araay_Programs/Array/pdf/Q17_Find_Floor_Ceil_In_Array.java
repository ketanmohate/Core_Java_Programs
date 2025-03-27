package Array.pdf;

import java.util.*;

/*17)Write a program in C to find the Floor and Ceil of the number 0 to 10 from a sroted array.*/

public class Q17_Find_Floor_Ceil_In_Array{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Taking array input
        System.out.print("Enter the size of the sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        //sort array
        for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

        // Taking the number input
        System.out.print("Enter the number to find floor and ceil: ");
        int x = sc.nextInt();

        int floor = -1, ceil = -1;

        // Finding Floor (largest element <= x)
        for (int num : arr) 
        {
            if (num > x) break;
            floor = num;
        }

        // Finding Ceil (smallest element >= x)
        for (int num : arr) 
        {
            if (num >= x) 
            {
                ceil = num;
                break;
            }
        }

        System.out.println("Number: " + x + " -> Floor: " + floor + ", Ceil: " + ceil);
    }
}
