public class P1
{
	public static void main(String args[])
	{
		String str1 = "listen";
        String str2 = "silent";
		
		if(str1.length() != str2.length())
		{
			System.out.println("The strings are not anagrams.");
            return;
		}
		
		int freq[] = new int[265];
		
		for(int i=0 ; i<str1.length() ; i++)
		{
			freq[str1.charAt(i)]++;
		}
		
		for(int i=0 ; i<str2.length() ; i++)
		{
			freq[str2.charAt(i)]--;
		}
		
		for(int i=0 ; i<freq.length ; i++)
		{
			if(freq[i] != 0)
			{
				System.out.println("The strings are not anagrams.");
                return;
			}
		}
		 System.out.println("The strings are anagrams.");
	}
}