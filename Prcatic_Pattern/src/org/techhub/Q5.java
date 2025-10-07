package org.techhub;

public class Q5 {
	public static void main(String[] args) {
		for(int i=1 ; i<=9 ; i++) {
			for(int j=1 ; j<=9 ; j++) {
				if(j==1 || i==1 || j==10-i) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}