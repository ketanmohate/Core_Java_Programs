package ArrayPDF;

/*48)Write a program in C to check whether a given matrix is an identity matrix.  
Test Data : 
Input number of Rows for the matrix :3 
Input number of Columns for the matrix :3 
Input elements in the first matrix : 
element - [0],[0] : 1 
element - [0],[1] : 0 
element - [0],[2] : 0 
element - [1],[0] : 0 
element - [1],[1] : 1 
element - [1],[2] : 0 
element - [2],[0] : 0 
element - [2],[1] : 0 
element - [2],[2] : 1 
Expected Output : 
The matrix is : 
1 0 0 
0 1 0 
0 0 1 
The matrix is an identity matrix. */

import java.util.*;

public class Q48_Identity_Matrix 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int[4][3];
		
		System.out.println("Enter the value of array");
		for(int i = 0 ; i < a.length ;i++)
		{
			for(int j = 0 ; j <a[i].length ;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("print array");
		for(int i = 0 ; i < a.length ;i++)
		{
			for(int j = 0 ; j <a[i].length ;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
