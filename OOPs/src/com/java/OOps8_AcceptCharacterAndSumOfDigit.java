package com.java;

/* Q3. WAP to create class name as ExtractDigitAndSum with two functions 
void setValue(char[]): this function can accept character array as parameter 
int getSum(): this function can extract digit from number and calculate its sum and return it.
Example: abc123mno45
Output: 1+2+3+4+5 = 15
*/

class AcceptCharacterAndSumOfDigit
{
	char ch[];
	
	void setValue(char chh[])
	{
		ch=chh;
	}
	
	void getSum()
	{
		int sum=0;
		
		for(int i = 0 ; i < ch.length ;i++)
		{
			if(ch[i]>='1' && ch[i]<='9')
			{
				sum = sum + ch[i]-'0';
			}
		}	
		
		for(int i = 0 ; i < ch.length ;i++)
		{
			if(ch[i]>='1' && ch[i]<='9')
			{
				sum = sum + ch[i]-'0';
			}
		}
		
//		This code checks if the character is within the range of '0' to '9' 
//		(which are the ASCII values for the digit characters). 
//		If it is, it subtracts the ASCII value of '0' from the character to get the numeric value,
//		and adds it to the sum.
		
		System.out.println("Sum of:\t"+sum);
		
	}
}

public class OOps8_AcceptCharacterAndSumOfDigit 
{

	public static void main(String[] args)
	{
		char chh[] = new char[] {'a','b','c','1','2','3','m','n','o','4','5'};
		
		AcceptCharacterAndSumOfDigit obj = new AcceptCharacterAndSumOfDigit();
		obj.setValue(chh);
		obj.getSum();

	}

}
