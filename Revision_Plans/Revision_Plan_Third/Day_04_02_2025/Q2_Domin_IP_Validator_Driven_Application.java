package Day_04_02_2025;

/*
 * Q2.WAP to design applications which help us to validate IP Address as well as Domain of website?

case 1: IP Validation 
Input : "125.512.100.1"
Output : Valid

Input: "12345.6"
Output: Invalid 

case 2: Domain validation?
Input: http://google.com
Output: valid

Input: http://google

Output: Invalid 

Input: google
Output: invalid 

Note: we want to design this application using interface and dynamic polymorphism with loose coupling concept so following the following class diagram.

 */

import java.util.*;

interface ValidateIpDomain
{
	void setString(String s);
	boolean idValidate();
}

class IpValidator implements ValidateIpDomain
{
	String str;
	public void setString(String s)
	{
		this.str = s;
	}
	
	public boolean idValidate() 
	{
		String[] arrayStr = str.split("\\.");
		
		if(arrayStr.length != 4)
		{
			return false;
		}

		int count = 0;
			
		for(int i=0 ;i<arrayStr.length; i++)
		{	
			if(arrayStr[0].length() == 3 && arrayStr[1].length() == 3 && arrayStr[2].length() == 3 && arrayStr[3].length()==1 && i<4)
			{
				count++;
			}
		}
		
		if(count == 4)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	
	
	/* method 2 but this logic is not working in notes example
	Note:- A valid IP address is written in the form of x.x.x.x, 
	where each x is a decimal value between 0 and 255. 
	The periods separate the octets, or segments, of the address. 
	Some examples of valid IP addresses include: 1.2.3.4, 01.102.103.104, and 192.0.2.146. 
	*/
//	public boolean idValidate() 
//	{
//	    String[] arrayStr = str.split("\\.");
//
//	    if (arrayStr.length != 4) 
//	    {
//	        return false;
//	    }
//
//	    for (String part : arrayStr) 
//	    {
//	        try 
//	        {
//	            int num = Integer.parseInt(part);
//	            if (num < 0 || num > 255) 
//	            {  // Each octet should be between 0-255
//	                return false;
//	            }
//	        } 
//	        catch (NumberFormatException e) 
//	        {
//	            return false;  // Not a valid number
//	        }
//	    }
//	    return true;
//	} 

}


class DomainValidator implements ValidateIpDomain
{
	String str;
	public void setString(String s)
	{
		this.str=s;
	}
	
	public boolean idValidate() 
	{
		if((str.startsWith("http://") || str.startsWith("https://")) &&
	       (str.endsWith(".com") || str.endsWith(".org") || str.endsWith(".net")))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class DomainIpValidator
{
	boolean hasCorrect(ValidateIpDomain validator)
	{
		if(validator.idValidate() == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class Q2_Domin_IP_Validator_Driven_Application 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		boolean flag=true;
		
		do
		{
			System.out.println("==========================================");
			System.out.println("Menu List");
			System.out.println("==========================================");
			
			System.out.println("case 1: IP Validation ");
			System.out.println("case 2: Domain validation");
			System.out.println("case 3: Exit");
			System.out.println("------------------------------------------");
			System.out.println("Enter your chioce");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
				case 1:
					
					System.out.println("Enter the String:-");
					String str = sc.nextLine();
					
					IpValidator ipv = new IpValidator();
					ipv.setString(str);
					
					DomainIpValidator div1 = new DomainIpValidator();
//					div.hasCorrect(ipv);
					
					if(div1.hasCorrect(ipv))
					{
						System.out.println("Valid IP");
					}
					else
					{
						System.out.println("Not Valid IP");
					}
					break;
					
				case 2:
					System.out.println("Enter the String:-");
					str = sc.nextLine();
					
					DomainValidator dv = new DomainValidator();
					dv.setString(str);
					
					DomainIpValidator div2 = new DomainIpValidator();
//					div.hasCorrect(ipv);
					
					if(div2.hasCorrect(dv))
					{
						System.out.println("Valid Domain");
					}
					else
					{
						System.out.println("Not Valid Domin");
					}
					
					break;
					
				case 3:
					flag = false;
					break;
					
					default:
						System.out.println("Plz Enter Valid Input");
					
			}
			
		}while(flag == true);
	}

}
