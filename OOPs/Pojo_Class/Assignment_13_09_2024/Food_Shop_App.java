package Assignment_13_09_2024;

/*
 Q 1. Write a java to Create class name as Food with using data member  fid ,fname ,fprice ,fcategory using do while and switch case. 
create array of object of size 5 ,store the food details in it and perform following operations.
case 1 : Add All Food details.
case 2 : Display All Food details.
case 3 : Display food details whose price range between 500 to 1000.
case 4 : Search Food  details using by id.
case 5 : Update Food  details using by name. 
case 6 : Delete Food details using by price.
case 7 : Purchase Food Items.
case 8 : Display Bill Details :
			Case 1 :  Bill Without Gst.
			Case 2 : Bill With Gst.
case 9 : Display Food Details Start first letter is 'P' and ends with 'A'.
case 10 : Exit The Code.

 */

import java.util.*;

class Food
{
	private int fId;
	private String fName;
	private int fPrice;
	private String fCategory;
	
	public void setfId(int fId)
	{
		this.fId=fId;
	}
	public int getfId()
	{
		return fId;
	}
	
	public void setfName(String fName)
	{
		this.fName=fName;
	}
	public String getfName()
	{
		return fName;
	}
	
	public void setfPrice(int fPrice)
	{
		this.fPrice=fPrice;
	}
	public int getfPrice()
	{
		return fPrice;
	}
	
	public void setfCategory(String fCategory)
	{
		this.fCategory=fCategory;
	}
	public String getfCategory() 
	{
	    return fCategory;
	}

}

public class Food_Shop_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		boolean flag=true;
		Food[] FoodItems = null;
		
		do {
			
			System.out.println("=========================================================================");
			System.out.println("Food list");
			System.out.println("=========================================================================");
			
			System.out.println("1 : Add All Food details.");
			System.out.println("2 : Display All Food details.");
			System.out.println("3 : Display food details whose price range between 500 to 1000.");
			System.out.println("4 : Search Food  details using by id.");
			System.out.println("5 : Update Food  details using by name.");
			System.out.println("6 : Delete Food details using by price.");
			System.out.println("7 : Purchase Food Items.");
			System.out.println("8 : Display Bill Details.");
			System.out.println("9 : Display Food Details Start first letter is 'P' and ends with 'A'.");
			System.out.println("10 : Exit The Code.");
			
			System.out.println("=========================================================================");
			
			System.out.println("Enter your choise");
			int choise = sc.nextInt();
			sc.nextLine(); 
			System.out.println("-------------------------------------------------------------------------");
			
			switch(choise)
			{
			case 1:
				
				System.out.println("Enter the No of Food");
				int nFood = sc.nextInt();
				
				FoodItems = new Food[nFood];// array of object
				
				for(int i=0 ; i<FoodItems.length;i++)
				{
					System.out.println("=========================================================================");
					System.out.println("Enter the " + (i+1) + " Food Detail");
					System.out.println("=========================================================================");
					System.out.println("Enter the Id");
					int id = sc.nextInt();
					
					sc.nextLine();
					
					System.out.println("Enter the Name");
					String name = sc.nextLine();
					
					System.out.println("Enter the Price");
					int price = sc.nextInt();
					
					sc.nextLine();
					
					System.out.println("Enter the Catagory");
					String catagory = sc.nextLine();
					
					Food f = new Food();
					
					f.setfId(id);
					f.setfName(name);
					f.setfPrice(price);
					f.setfCategory(catagory);
					
					FoodItems[i] = f;
	
				}
				break;
				
			case 2:
				System.out.println("=========================================================================");
				System.out.println("Disply All Food Details");
				System.out.println("=========================================================================");
				
				boolean found = false;
				if (FoodItems != null)
				{
					for(int i=0 ; i<FoodItems.length;i++)
					{
						Food f = FoodItems[i];
						if (FoodItems[i] != null) 
						{
							System.out.println("Id \t\t" + f.getfId());
							System.out.println("Name\t\t" + f.getfName());
							System.out.println("Price\t\t" + f.getfPrice());
							System.out.println("Category\t" + f.getfCategory());
							System.out.println("-----------------------------------");
							found = true;
						}
//						else 
//					    {
//					        System.out.println("Not any Detail");
//					    }
					}
				    if (!found) 
				    {
				        System.out.println("Not any Detail");
				    }
				}
				else 
				{
                    System.out.println("No food details found.");
                }
				break;
				
			case 3:
				System.out.println("=========================================================================");
				System.out.println("Display food details whose price range between 500 to 1000");
				System.out.println("=========================================================================");
			
				boolean found1 = false; // to check if any item is found in the range
				if (FoodItems != null)
				{
					for(int i=0 ; i<FoodItems.length;i++)
					{
						if(FoodItems[i] != null)
						{
							Food f = FoodItems[i];
							if(f.getfPrice()>=500 && f.getfPrice()<= 1000)
							{
								System.out.println("Id \t\t" + f.getfId());
								System.out.println("Name\t\t" + f.getfName());
								System.out.println("Price\t\t" + f.getfPrice());
								System.out.println("Category\t" + f.getfCategory());
								System.out.println("-----------------------------------");
								found1 = true;	
							}
						}
					}
				    if (!found1) 
				    {
				        System.out.println("No food items found in the price range between 500 and 1000.");
				    }
				}
				else 
				{
                    System.out.println("No food details found.");
                }
				break;
				
			case 4:
				System.out.println("=========================================================================");
				System.out.println("Search Food  details using by id");
				System.out.println("=========================================================================");
				
				System.out.println("Enter the Id");
				int id = sc.nextInt();
				System.out.println("-------------------------------------------------------------------------");
				
				boolean found2 = false;
				if (FoodItems != null)
				{
					for(int i=0; i<FoodItems.length;i++)
					{
						if(FoodItems[i] != null)
						{
							Food f = FoodItems[i];
							if(f.getfId()==id)
							{
								System.out.println("Id \t\t" + f.getfId());
								System.out.println("Name\t\t" + f.getfName());
								System.out.println("Price\t\t" + f.getfPrice());
								System.out.println("Category\t" + f.getfCategory());
								System.out.println("-----------------------------------");
								found2=true;
							}
						}	
					}
				    if (!found2) 
				    {
				        System.out.println("No food Id found in the Search Element");
				    }
				}
				else 
				{
                    System.out.println("No food details found.");
                }
				break;
				
			case 5:
				System.out.println("=========================================================================");
				System.out.println("Update Food  details using by name");
				System.out.println("=========================================================================");

				System.out.println("Enter the Food Name");
				String name = sc.nextLine();
				System.out.println("-------------------------------------------------------------------------");
				
				boolean found3 = false;
				if (FoodItems != null) 
				{
					for(int i=0; i<FoodItems.length;i++)
					{
						if(FoodItems[i] != null)
						{
							Food f = FoodItems[i];
							if(f.getfName().equals(name) && FoodItems[i] != null)//////////////// larn
							{
								found3 = true;
								System.out.println("How to Update in Food Details");
								System.out.println("-------------------------------------------------------------------------");
								System.out.println("1:Id");
								System.out.println("2:Name");
								System.out.println("3:Price");
								System.out.println("4:Category");
								System.out.println("-------------------------------------------------------------------------");
								int update = sc.nextInt();
								sc.nextLine();
								System.out.println("-------------------------------------------------------------------------");
								
								switch(update)
								{
									case 1:
										System.out.println("Enter the New Id");
										int newId = sc.nextInt();
										sc.nextLine();
										f.setfId(newId);
										break;
										
									case 2:
										System.out.println("Enter the New Name");
										String newName = sc.nextLine();
										f.setfName(newName);
										break;
										
									case 3:
										System.out.println("Enter the New Price");
										int newPrice=sc.nextInt();
										sc.nextLine();
										f.setfPrice(newPrice);
										break;
										
									case 4:
										System.out.println("Enter the New Category");
										String newCategory=sc.nextLine();
										f.setfCategory(newCategory);
										break;
										
									default:
										System.out.println("Plz Valid Inpute...");
								}
								System.out.println("-------------------------------------------------------------------------");
								System.out.println("After update");
								System.out.println("-------------------------------------------------------------------------");
								System.out.println("Id \t\t" + f.getfId());
								System.out.println("Name\t\t" + f.getfName());
								System.out.println("Price\t\t" + f.getfPrice());
								System.out.println("Category\t" + f.getfCategory());
								System.out.println("-----------------------------------");
							}
						}
					}
				    if (!found3) 
				    {
				        System.out.println("Not found food Name");
				    }
				}
				else 
				{
                    System.out.println("No food details found.");
				}
				break;
				
			case 6:
				System.out.println("=========================================================================");
				System.out.println("Delete Food details using by price");
				System.out.println("=========================================================================");

				System.out.println("Enter the price");
				int price = sc.nextInt();
				sc.nextLine();
				System.out.println("--------------------------------------------------");
				
				boolean found4 = false;
				if (FoodItems != null) 
				{
					for(int i = 0; i < FoodItems.length; i++) 
				    {
				        if(FoodItems[i] != null && FoodItems[i].getfPrice() == price) 
				        {
				            FoodItems[i] = null; 
				            
				            System.out.println("Food item with price " + price + " has been deleted.");
				            found4=true;
				        }
				    }
				    if (!found4) 
				    {
				        System.out.println("Not found food Price");
				    }
				}
				else 
				{
                    System.out.println("No food details found.");
				}
				break;
				
			case 7:
				System.out.println("=========================================================================");
				System.out.println("Purchase Food Items");
				System.out.println("=========================================================================");

				double total = 0;
				char choice;
				do
				{
					System.out.println("Enter The ID Of Purchase Food Items");
					int pId = sc.nextInt();
					sc.nextLine();
					System.out.println("-------------------------------------------------------------------------");
					
					boolean found5 = false;
					if (FoodItems != null) 
					{
						for(int i=0; i<FoodItems.length;i++)
						{
							if(FoodItems[i] != null)
							{
								if(FoodItems[i].getfId()==pId)
								{
									total = total + FoodItems[i].getfPrice();
									System.out.println("added to the cart");
									System.out.println("------------------------------------");
									System.out.println("Id \t\t" + FoodItems[i].getfId());
									System.out.println("Name\t\t" + FoodItems[i].getfName());
									System.out.println("Price\t\t" + FoodItems[i].getfPrice());
									System.out.println("Category\t" + FoodItems[i].getfCategory());
									System.out.println("-------------------------------------------------------------------------");
									found5 = true;
								}
							}
						}
					    if (!found5) 
					    {
					        System.out.println("Not found food Id");
					    }
					    System.out.println("-------------------------------------------------------------------------");
					}
					else 
					{
	                    System.out.println("No food details found.");
					}
					
					System.out.print("Do you want to add another item? (y/n): ");
		            choice = sc.next().charAt(0);
		            System.out.println("----------------------------------------");
		            
				}while (choice == 'y' || choice == 'Y');
		        System.out.println("Total Bill: " + total);
		        System.out.println("----------------------------------------");
		        break;
		        
		    
			case 8:
				System.out.println("=========================================================================");
				System.out.println("Display Bill Details");
				System.out.println("=========================================================================");
				
				System.out.println("");
				
				System.out.println("=========================================");
				System.out.println("Bill Type");
				System.out.println("=========================================");
				System.out.println(" 1 :  Bill Without Gst");
				System.out.println(" 2 :  Bill With Gst");
				System.out.println("=========================================");
				
				System.out.println("Enter the choice");
				int billChoice = sc.nextInt();
				sc.nextLine();
				System.out.println("-------------------------------------------------------------------------");
				
				double totalBill =0;
				boolean found6 = false;
				if (FoodItems != null) 
				{
					for(int i=0 ;i<FoodItems.length;i++)
					{
						if(FoodItems[i] != null)
						{
							totalBill = totalBill + FoodItems[i].getfPrice();
							found6 = true;
						}
					}
					if (!found6) 
				    {
				        System.out.println("Not found food detail");
				    }
					switch(billChoice)
					{
						case 1:
							System.out.println("Bill Without Gst");
							System.out.println(totalBill);
							break;
							
						case 2:
							System.out.println("Bill With Gst");
							double GSTBill = (totalBill*0.18);
							System.out.println(totalBill + GSTBill);
							break;
							
						default:
							System.out.println("Invalid Option.");
					}
				}
				else 
				{
                    System.out.println("No food details found.");
				}
				break;
				
			case 9:
				System.out.println("=========================================================================");
				System.out.println("Display Food Details Start first letter is 'P' and ends with 'A'");
				System.out.println("=========================================================================");
				
				boolean foundItem = false;
				if (FoodItems != null) 
				{
					for(int i=0;i<FoodItems.length;i++)
					{
						if(FoodItems[i] != null)
						{
							String sName = FoodItems[i].getfName();  // Use getter method
				            
				            char firstChar = sName.charAt(0);  // Get the first character
				            char lastChar = sName.charAt(sName.length() - 1); 
				            
				            if(firstChar == 'P' && lastChar == 'A') 
				            {
				                System.out.println("Id \t\t" + FoodItems[i].getfId());
				                System.out.println("Name\t\t" + sName);
				                System.out.println("Price\t\t" + FoodItems[i].getfPrice());
				                System.out.println("Category\t" + FoodItems[i].getfCategory());
				                System.out.println("-------------------------------------------------------------------------");
				                foundItem = true;
				            }
						}
					}
				    if (!foundItem) 
				    {
				        System.out.println("No food items found with the specified conditions.");
				    }
				}
				else 
				{
                    System.out.println("No food details found.");
				}
			    break;
			    
			case 10:
				flag=false;
				break;
				
			default:
				System.out.println("Plz Enter Valid Inpute...");
			}
			
		}while(flag==true);
	}
}