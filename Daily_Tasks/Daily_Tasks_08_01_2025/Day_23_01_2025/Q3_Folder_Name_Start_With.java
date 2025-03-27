package Day_23_01_2025;

/*
 * Q3. Fetch folder whose name start with m from particular path
 */

import java.io.File;
import java.util.*;

public class Q3_Folder_Name_Start_With 
{
	public static void main(String[] args) 
	{
		
//		String str = "M";
		Scanner sc = new Scanner(System.in);
		
		File f = new File("C:\\Users\\ketan\\OneDrive\\Desktop\\File_Handling\\");
		
//		System.out.println(f);
		
		if(f.exists() && f.isDirectory())
		{
			System.out.println("Enter the Charactor");
			String s=sc.nextLine();
			
			File[] arrf = f.listFiles();
			
			if(arrf != null)
			{	
				System.out.println("Folders starting with 'M':");
				for (File file : arrf) 
				{
                    if (file.isDirectory() && file.getName().startsWith(s)) 
                    {
                        System.out.println(file.getName());
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
