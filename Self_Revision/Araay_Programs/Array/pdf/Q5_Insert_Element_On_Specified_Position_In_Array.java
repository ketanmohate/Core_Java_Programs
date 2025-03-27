package Array.pdf;

/*5)	WAP to insert the element on specified position in array ?*/

import java.util.*;

public class Q5_Insert_Element_On_Specified_Position_In_Array {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the Elements");
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		 System.out.print("Enter the element to insert: ");
		 int element = sc.nextInt();
	        
		 System.out.print("Enter the position (0-based index): ");
		 int position = sc.nextInt();
		
		 if (position < 0 || position > size) 
		 {
	            System.out.println("Invalid position! It should be between 0 and " + size);
		 }
		 else
		 {
			 for(int i=arr.length-1 ; i>=position ; i--)
			 {
				 arr[i] = arr[i-1];
			 }
			 arr[position] = element;
		 }
		 
		 System.out.println("After inserting");
		 for(int i=0 ; i<arr.length ; i++)
		 {
			 System.out.print(arr[i] +" ");
		 }
	}
}
