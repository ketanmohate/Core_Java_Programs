package com.java;

/*
 13).WAP to create the class name as PrintMatrix with a two methods void acceptTwoDArray(int 
x[][]) and    showMatrix() sample code given below  
class PrintMatrix 
{  int a[][]; 
void acceptTwoDArray(int x[ ][ ]) 
{ //here we store the two dimensional array in instance variable declared as two d in class e.g a 
a=x; 
} 
void showMatrix() 
{ //here we can display the matrix logics 
} 
} 
public class PrintMatrixApp 
{ 
public static void main(String x[]) 
{ //here we need to declare the two dimensional array with a 3 x 3 and store all values in it using a 
Scanner class 
//create the object of PrintMatrix class and call the acceptTwoDArray() function and pass two d 
matrix in it 
//call the showMatrix() function for display the matrix.} 
}
 */

import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

class PrintMatrix
{
	 int arr[][]; 
	 void acceptTwoDArray(int arr[][]) 
	 {  
		 this.arr=arr;
	 }
	 
	 void showMatrix()
	 {
		 System.out.println("Matrix:");
		 for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
			}
	 }
}

public class Q13_Print_Matrix_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Row size of Matrix");
		int row=sc.nextInt();
		
		System.out.println("Enter the Column size of Matrix");
		int column=sc.nextInt();
		
		int arr[][] = new int[row][column];
		
		System.out.println("Enter the value of Matrix");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			System.out.println("");
		}
		
		PrintMatrix objPrintMatrix = new PrintMatrix();
		objPrintMatrix.acceptTwoDArray(arr);
		objPrintMatrix.showMatrix();
	}

}
