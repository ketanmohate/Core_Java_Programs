package Day_23_01_2025;

/*
 * Q7. WAP to fetch folder within folder and its file from particular path and display output like 
 */

import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

import java.io.*;

public class Q7_ 
{
	public static void main(String agrs[])
	{
		Scanner sc = new Scanner(System.in);
		
		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\File_Handling";
		
		File directory = new File(directoryPath);
		
		if(directory.exists() && directory.isDirectory())
		{
			File[] files = directory.listFiles();
			
			if(files != null) 
			{
				for(int i=0 ; i<files.length ; i++)
				{
					if(files[i].isDirectory() )
					{
						System.out.println(files[i] + "   (Subparent)");
						System.out.println("======================================================================");
						
					}
				}
			}
			else
			{
				System.out.println("Directory Is Null");
			}
		}
		else
		{
			System.out.println("Directory is not valid");
		}
		
	}
}

