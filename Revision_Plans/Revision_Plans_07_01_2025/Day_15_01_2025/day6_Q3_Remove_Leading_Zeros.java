package Day_15_01_2025;
import java.util.*;
class RemoveLeadingZero
{
	private String str;
	void  setString(String str)
	{
		this.str=str;
	}
	void removeLeadingZero()
	{
		char [] ch = str.toCharArray();
		char [] c1=new char[ch.length];
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			
				if(ch[i]=='0')
				{
					count++;
				}
				else{
					break;
				}			
		}
		
		for(int i=count;i<ch.length;i++)
		{
			c1[i]=ch[i];
		}
		System.out.println(new String(c1));
		
	}
	
}
public class day6_Q3_Remove_Leading_Zeros
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		
		String s=sc.nextLine();
		
		RemoveLeadingZero r= new RemoveLeadingZero();
		r.setString(s);
		r.removeLeadingZero();
	}
}