package Assignment_26_09_2024;

import java.util.*;

class Bill
{
	int totalBill=0;
	
	public int getBill(int qty,int rate)
	{
		totalBill = qty * rate;
		return totalBill;
	}	
}

class RegularCustomer extends Bill
{
	int totalBill=0;
	
	public int getBill(int qty,int rate)
	{
		totalBill = super.getBill(qty, rate);
		totalBill = (totalBill * 20 / 100);
		return totalBill;
	}
}

class BulkPurchseCustomer extends Bill
{
	int totalBill=0;
	
	public int getBill(int qty,int rate)
	{
		totalBill = super.getBill(qty, rate);
		totalBill = (totalBill * 10 / 100);
		return totalBill;
	}
}

public class Q2_GST_App 
{
	public static void main(String[] args) 
	{                                                                                  
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Quantity");
		int qty = sc.nextInt();
		
		System.out.println("Enter the Rate");
		int rate = sc.nextInt();
		
//		Bill objBill = new Bill();
//		
//		objBill.getBill(qty, rate);
		
		RegularCustomer regularCustomer = new RegularCustomer();
        int regularBill = regularCustomer.getBill(qty, rate); 
        
        System.out.println("Regular Customer Bill after 20% discount: " + regularBill);

       
        BulkPurchseCustomer bulkCustomer = new BulkPurchseCustomer();
        int bulkBill = bulkCustomer.getBill(qty, rate); 
        
        System.out.println("Bulk Purchase Customer Bill after 10% discount: " + bulkBill);
		
	}

}
