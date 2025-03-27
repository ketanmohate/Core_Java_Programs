package Day_23_01_2025;

/*
 * Q5. Fetch file whose size is more than 2kb?
 */

import java.io.*;
import java.util.*;

public class Q5_Whose_Size_Is 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = "C:\\Users\\ketan\\OneDrive\\Desktop\\File_Handling";
	
		File f = new File(str);
		
		if(f.exists() && f.isDirectory())
		{
			System.out.println("Enter the Size");
			int size = sc.nextInt();
			
			File[] arrF = f.listFiles();
			if(arrF != null)
			{
				for(int i=0 ; i<arrF.length ; i++)
				{
					if(arrF[i].isFile() && arrF[i].length() > size * 1024 )
					{
						System.out.println(arrF[i].getName());
					}
				}
			}
			else
			{
				System.out.println("The directory is empty.");
			}
		}
		else
		{
			System.out.println("Directory is not Present");
		}
			
	}

}
