package Day_02_02_2025;

/*
Q3. WAP to perform following operation on string 
Java String Program to Remove Leading Zeros
Input: 000012356098
Output: 12356098
Explanation: Removing all the elements from the beginning of String which doesn't add any value to the number. 

Your Task is:  you have to create class name as RemoveLeaningZero with two methods 

void setString(String s): this method accept string as parameter 
String getStringWithoutZero(): this method can remove zero and return string after removing leading zero.
 */

import java.util.*;

class RemoveLeadingZero
{
	String str ;
	void setString(String str)
	{
		this.str = str;
	}
	
	String getStringWithoutZero()
	{
		char [] charArray = str.toCharArray();
		int count=0;
		
		for(int i=0 ; i<charArray.length ; i++)
		{
			if(charArray[i] == '0') 
			{
				count++;
			}
			else
			{
				break;
			}
		}
		
//		System.out.println("Count"+count);
//		
//		int length = charArray.length - count;
//		
//		System.out.println("Length"+length);
//		
//		char[] arr = new char[length];
//		int k=0;
//		
//		for(int i=count ; i<charArray.length;i++)
//		{
//			arr[k++] = charArray[i];
//		}
//			
//		String rZero = new String(arr);
//		return rZero;
		
		//methos 2
		
		// Return the substring starting from the first non-zero character
		
        String result = "";
        for (int j = count; j < charArray.length; j++) 
        {
            result = result + str.charAt(j); // Concatenating manually
        }
        
        return result;
	}
}

public class Q4_Remove_Zeros_From_Leading 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:-");
		String str = sc.nextLine();
		
		RemoveLeadingZero rz = new RemoveLeadingZero();
		rz.setString(str);
		
		System.out.println("String Is:-" + rz.getStringWithoutZero());
	}
}

