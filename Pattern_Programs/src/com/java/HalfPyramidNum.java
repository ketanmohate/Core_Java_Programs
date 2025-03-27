package com.java;

public class HalfPyramidNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=7;i++) {
			int count=1;
			for(int j=1;j<=7;j++){
				if(j<=i){
					System.out.print(" "+count );
					count = count*(i-j)/j;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}