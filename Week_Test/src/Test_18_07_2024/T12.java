package Test_18_07_2024;
public class T12
{
    public static void main(String x[])
    {   
      int b[]=show(new int[]{10,20,30,40,50}); 
	for(int i=0;i<b.length;i++)
	{ System.out.printf("%d\t",b[i]);
	}
    }
    public static int [] show(int []x) 
    {
         for(int i=0;i<x.length;i++){
	   x[i]=x[i]>>1;
	 }
	return x;
    }
}
