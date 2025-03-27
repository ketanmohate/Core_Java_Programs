package Assignment_04_09_2024.java;

/*
 9.WAP to create the class name as Seller with a following functions 
class Seller 
{ 
} 
void acceptSellingCostPrice(int sp,int cp) 
{ //here we need to store the sp and sp values in instance variable 
} 
void showProfitLoss() 
{ //here we need to write the logics for profit and loss 
} 
class SellerApp{ 
public static void main(String x[]) 
{  //here we need to create the object of Scanner class  
//declare the two values sp and cp and store values in it using scanner 
//create the object of Seller class 
//call its acceptSellingCostPrice function and pass two values in it 
//call the showProfitLoss() function 
} 
} 
 */

import java.util.*;

class Seller
{
	int sellPrice;
	int costPrice;
	void acceptSellingCostPrice(int sp,int cp)
	{
		this.sellPrice=sp;
		this.costPrice=cp;
	}
	void showProfitLoss()
	{
		System.out.println("----------------------");
		if(sellPrice > costPrice)
		{
			int profit = sellPrice - costPrice;
			System.out.println("Profit:\t"+profit);
		}
		else
		{
			int loss = costPrice - sellPrice;
			System.out.println("Loss:\t"+loss);
		}
		System.out.println("----------------------");
	}
}

public class Q9_Seller_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Selling Price");
		int sellPrice = sc.nextInt();
		
		System.out.println("Enter the Cost Price");
		int costPrice = sc.nextInt();
		
		Seller obj = new Seller();
		obj.acceptSellingCostPrice(sellPrice, costPrice);
		obj.showProfitLoss();
	}

}
