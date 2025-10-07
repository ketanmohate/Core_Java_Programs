package tech.org;
import java.util.*;

public class Q1_Missing_elemen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the Values");
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Missing element");
		for(int i=0 ; i<arr.length-1 ; i++) {
			for(int j=arr[i]+1 ; j<arr[i+1] ; j++) {
				System.out.println(j);
			}
		}
	}

}
