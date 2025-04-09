package FileClass.org;

import java.util.*;
import java.io.*;

public class Q1_mkdir_Using_Flder_Create 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\";
		
		File file = new File(directoryPath,"newFolder");
		
		if(file.mkdir())
		{
			System.out.println("Folder Create Successfully...");
		}
		else
		{
			System.out.println("Some Problem is thire");
		}
	}
}
