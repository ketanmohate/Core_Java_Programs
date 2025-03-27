package Day_08_01_2025;

import java.util.Scanner;

public class Q3_WordsCount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		int count = 0;
        //boolean inWord = false;
		int flag = 0;
		
		for(int i=0;i<str.length();i++)
		{
			char currentChar = str.charAt(i);
			
			//if(currentChar != ' ' && !inWord)
			if((currentChar != ' ') && (flag == 0))
			{
				count++;
                //inWord = true;
				flag=1;
			}
			else if (currentChar == ' ')
			{
				//inWord = false;
				flag=0;
			}
		}
		System.out.println("Number of words in the string: " + count);
	}

}
