package Assignment_04_09_2024.java;

/*
 6. create the class name as ConvertToUpper with a following methods 
class ConvertToUpper 
{  char c[]; 
void setCharArray(char ch[]) 
{ //here accept the character array and store in instance variable in character array 
c=ch; 
} 
void convertToUpperCase() 
{ //here we need to write the manual logics for converting lower case array 
//to upper case 
} 
} 
public class ConvertToUpperApp 
{ 
public static void main(String x[]) 
{   
//here declare the fix array with a some character e.g char ch[]=new char[]={"good"}; 
//here create the object of ConvertToUpper class  
//call setCharArray() function and pass ch array in setCharArray() function 
//call convertToUpperCase() function and see the result 
} 
} 
 */

import java.util.*;

class ConvertToUpper
{
	char c[]; 
	
	void setCharArray(char ch[])
	{
		c=ch; 
	}
	
	void convertToUpperCase() 
	{
		for(int i=0;i<c.length;i++)
		{
			c[i]=(char) (c[i]-32);
		}
		System.out.println("Convertad String");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
	}
}

public class Q6_Convert_To_Upper_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
//		System.out.println("Enter the size of String");
//		int size=sc.nextInt();
//		sc.nextLine();

		System.out.println("Enter the String");
		String str=sc.nextLine();
		
//		int count=0;
//		for(int i=0;i<str.length();i++)
//		{
//			count++;
//		}	
		
//		char arrConvertToUpper[] = new char[count];
		
		
		char arrConvertToUpper[] = new char[str.length()];
		
		for(int i=0;i<arrConvertToUpper.length;i++)
		{
			arrConvertToUpper[i]=str.charAt(i);
		}
		
		ConvertToUpper obj = new ConvertToUpper();
		obj.setCharArray(arrConvertToUpper);
		obj.convertToUpperCase();
	}

}
