package StreamClasses.org;

import java.io.*;
import java.util.*;

public class Q1_Write_File_Using_StreamClass 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\StreamWriteFile.txt";
		
		int arr[] = new int[1024];
		Random rand = new Random();
		
		try{
			
			FileOutputStream fot = new FileOutputStream(directoryPath);

			for (int j = 0; j < arr.length; j++) 
			{
				fot.write(arr[j] = rand.nextInt(1000));
			}
			
			System.out.println("Write Successfully...");
		}
		catch(IOException e)
		{
			System.out.println("Some Problem...");
		}
		
	}

}
