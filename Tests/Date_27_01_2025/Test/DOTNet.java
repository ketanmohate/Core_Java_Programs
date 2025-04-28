using System;

public class HelloWorld
{
    public static void Main(string[] args)
    {
        string str = "ketanxx";
        string newStr = "";
        
        bool[] b =new bool[256];
        
        for(int i=0 ; i<str.Length ; i++)
        {
            int index = (int) (str[i]);
            
            if(b[index] == false){
                b[index] = true;
                newStr = newStr + str[i];
            }
        }
        Console.WriteLine(newStr); 
    }
}