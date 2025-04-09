package tech.org;

import java.io.*;
import java.util.*;

public class Q2_Write_File {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String pathDirectory = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\demo.txt";
		
		try {
			FileWriter fileWrite = new FileWriter(pathDirectory);
			
			System.out.println("Write Here");
			fileWrite.write(sc.nextLine());
			
			fileWrite.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		

	}

}
