package Day_11_01_2025;

/*
 * Q7. WAP to implement the split() method manually?
 */

import java.util.*;

public class P_Q7_Split_Method_Manually 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		System.out.println("Enter the Regex: ");
		char regex = sc.next().charAt(0);
		
//		char[] ch = str.toCharArray(); 
		
		int count = 1; 
		
        for (char c : str.toCharArray()) 
        {
            if (c == regex) 
            {
                count++;
            }
        }
        
        String[] split =  new String[count];
        StringBuilder temp = new StringBuilder();
	
        int index = 0;
        
        for (char c : str.toCharArray()) 
        {
            if (c == regex) 
            {
            	split[index++] = temp.toString(); // Add the substring to the array
                temp = new StringBuilder();       // Reset for the next substring
            } 
            else 
            {
                temp.append(c); // Add character to the current substring
            }
        }
        
        split[index] = temp.toString();
        
        for(int i=0 ; i<split.length ; i++)
        {
        	System.out.println(split[i]);
        }
	}

}
