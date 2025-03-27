package Day_11_01_2025;

/*
Q1. Demonstrate manual boxing and unboxing for all primitive types in Java. 
Write methods for each type, such as converting a double into a Double.
Example:

    Double dObj = Double.valueOf(12.5);
    double d = dObj.doubleValue();
 */

import java.util.*;

public class Q1_Convert_Primitive_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Double dObj = Double.valueOf(12.5);
		double d = dObj.doubleValue();
		System.out.println("Double: "+d);
		
		Integer aObj = Integer.valueOf(5);
		int a = aObj.intValue();
		System.out.println("Integer: "+a);
		
		Float fObj = Float.valueOf(12.4f);
		float f = fObj.floatValue();
		System.out.println("Float: " + f);
		
		Short sObj = Short.valueOf((short) 10);
		short s = sObj.shortValue();
		System.out.println("Short: " + s);
		
		Character cObj = Character.valueOf('k');
		char ch = cObj.charValue();
		System.out.println("Character: "+ch);
		
		Long lObj = Long.valueOf(9595);
		long l = lObj.longValue();
		System.out.println("Long: "+l);
		
		Byte bObj = Byte.valueOf((byte) 25);
		byte b = bObj.byteValue();
		System.out.println("Byte: "+b);
		
		Boolean BoolObj = Boolean.valueOf(true);
		boolean Bool = BoolObj.booleanValue();
		System.out.println("Boolean: "+Bool);

	}

}
