package Day_23_01_2025;

/*
 * Fetch files whose extension is .png or jpeg etc
 */

import java.io.*;
import java.util.*;

public class Q6_Whose_Extension_Is_1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = "C:\\Users\\ketan\\OneDrive\\Desktop\\File_Handling";
		
		File f = new File(str);
		
		
		
		if(f.isDirectory() && f.exists())
		{
			System.out.println("Enter the Extension");
			String ext = sc.nextLine() ;
			
			 File[] arrF = f.listFiles();
			 if(arrF != null)
			 {
				 for(int i=0 ; i<arrF.length ; i++)
				 {
					if(arrF[i].isFile() && (arrF[i].getName().endsWith(ext) || arrF[i].getName().endsWith(ext)))
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
			System.out.println("The specified path is not a valid directory.");
		}
		
	}

}
