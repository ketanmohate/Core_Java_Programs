package Day_12_05_2025;

import java.util.*;

public class Q1_Vector_Example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> vector = new Vector();
		
		System.out.println("Enter the 10 Values");
		for(int i=1 ; i<=10 ; i++) {
			vector.add(sc.nextInt());
		}
		
		for(int value : vector) {
			System.out.println(value);
		}
	}
}
