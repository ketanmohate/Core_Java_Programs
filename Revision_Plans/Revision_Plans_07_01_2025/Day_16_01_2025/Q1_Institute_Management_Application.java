package Day_16_01_2025;

/*
 * Example: Institute Management Application using classes and objects with array of objects concept.
Case 1: Add New Courses (3 course) : using this case we can create new course using Course class array of object
note: course name should be duplicate as well as course id should be duplicated
Case 2: Take Enquiry: you have to create 10 enquiry objects using array of object and enquiry id should not 
duplicate and set all enquiry status by default false and show the all courses to enquiry and allocate course 
to enquiry using course id
Case 3: Enroll For Admission:
In this case you have to show all enquires and input the enquiry id which is ready for admission and change 
enquiry status from false to true  
Case 4: Allocate Batch : you have to input the batch detail using single object and show the all courses 
and ask course id for batch then allocate batch to course and fetch all admission according to that course and 
allocate in batch
Case 5: View All Courses: show the
Case 6: View Course Wise students
Case 7: View Batch Wise Student
Case 8: View All Enquiry
Case 9: View All Admission
Case 10: View Cancel Enquiry
 */

import java.util.*;
	
class Courses 
{

	private int id;
	private String name;
	private int fees;
	private int duration;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setFees(int fees)
	{
		this.fees=fees;
	}
	public int getFees()
	{
		return fees;
	}
	
	public void setDuration(int duration)
	{
		this.duration=duration;
	}
	public int getDuration()
	{
		return duration;
	}
	
}

class Enquirys 
{
	private int id;
	private boolean status = false;
	private String name;
	private String contact;
	private String address;
	private Courses courses;
	
	public void setId(int id)
	{ 
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setStatus(boolean status)
	{
		this.status=status;
	}
	public boolean getStatus()
	{
		return status;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setContact(String contact)
	{
		this.contact=contact;
	}
	public String getContact()
	{
		return contact;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	
	public void setCourses(Courses courses)
	{
		this.courses=courses;
	}
	public Courses getCourses()
	{
		return courses;
	}
	
}

class Admissions
{																																																						
	private Courses courses[];
	private Enquirys enquirys[];
	
	void setCourses(Courses courses[])
	{
		this.courses=courses;
	}
	public Courses[] getCourses()
	{
		return courses;
	}
	
	public void setEnquirys(Enquirys enquirys[])
	{
		this.enquirys=enquirys;
	}	
	public Enquirys[] getEnquirys()
	{
		return enquirys;
	}
	
	
}

class Batchs
{
	
}

public class Q1_Institute_Management_Application 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Admissions ad = new Admissions();
		
		
		boolean flag = true;
		
		Courses[] arrC = null;
		
		Enquirys[] arrE = null ;
		
		do
		{
			System.out.println("============================================================================");
			System.out.println("Menus");
			System.out.println("============================================================================");
			
			System.out.println("Case 1: Add New Courses");
			System.out.println("Case 2: Take Enquiry");
			System.out.println("Case 3: Enroll For Admission");
			System.out.println("Case 4: Allocate Batch");
			System.out.println("Case 5: View All Courses");
			System.out.println("Case 6: View Course Wise students");
			System.out.println("Case 7: View Batch Wise Student");
			System.out.println("Case 8: View All Enquiry");
			System.out.println("Case 9: View All Admission");
			System.out.println("Case 10: View Cancel Enquiry");
			
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("Enter your choise");
			int choise=sc.nextInt();
			sc.nextLine();
			System.out.println("---------------------------------------------------------------------------");
			
			switch(choise)
			{
				case 1:
				
					System.out.println("------------------------------------------------------------------");
					System.out.println("Enter how many Courses to add");
					int nCourses=sc.nextInt();
					sc.nextLine();
					System.out.println("-------------------------------------------------------------------");
					
//					HashSet<Integer> idSet = new HashSet<>();
					
					arrC = new Courses[nCourses];
					
					for(int i=0 ; i<arrC.length ; i++)
					{
						
						System.out.println("Enter the Id");
						int id=sc.nextInt();
						sc.nextLine();
						
//						if (!idSet.add(id)) 
//						{
//			                System.out.println("Duplicate ID! Please enter a unique ID.");
//			            } 
//						else 
//						{
//			                System.out.println("ID added successfully.");
//			            }
						
						System.out.println("Enter the Name");
						String name = sc.nextLine();
						
						System.out.println("Enter the fees");
						int fees=sc.nextInt();
						sc.nextLine();
						
						System.out.println("Enter the Duration");
						int duration =sc.nextInt();
						sc.nextLine();
						
						Courses c = new Courses();
						
						c.setName(name);
						c.setId(id);
						c.setFees(fees);
						c.setDuration(duration);
						
						arrC[i] =c;
						
					}
					
					ad.setCourses(arrC);
					
					break;
					
				case 2:
					
					System.out.println("-------------------------------------------------------------------");
					System.out.println("Enter Take the how many Enquiry ");
					int nEnquiry = sc.nextInt();
					sc.nextLine();
					System.out.println("--------------------------------------------------------------------");
					
					HashSet<Integer> idSet1 = new HashSet<>();
					
					arrE = new Enquirys[nEnquiry];
					
					for(int i=0 ; i<arrC.length ; i++)
					{
						System.out.println("Course ID:\t" + arrC[i].getId());
						System.out.println("Course Name:\t" + arrC[i].getName());
						System.out.println("Course Fee:\t" + arrC[i].getFees());
						System.out.println("Course Duration:\t" + arrC[i].getDuration());
						System.out.println("");
					}
					 
					for(int i=0 ;i<arrE.length;i++)
//					for(int i=0 ;i<ad.getCourses().length;i++)
//					for(int i=0 ;i<arrC.length;i++)
					{
						System.out.println("Enter the Id");
						int id = sc.nextInt();
						sc.nextLine();
						
						if (!idSet1.add(id)) 
						{
			                System.out.println("Duplicate ID! Please enter a unique ID.");
			            } 
						else 
						{
			                System.out.println("ID added successfully.");
			            }
						
						System.out.println("Enter the status");
						boolean status = sc.nextBoolean();
						sc.nextLine();
						
					}
					
					
					
					break;
					
				case 3:
					
					System.out.println("================================================================");
					System.out.println("All Enquires");
					System.out.println("================================================================");
					
					for(int i=0 ; i<arrE.length;i++)
					{
						
							
					}	
					break;
					
				case 4:
					
					System.out.println("================================================================");
					System.out.println("Allocate Batch");
					System.out.println("================================================================");
					
					System.out.println("Enter The Batch ID");
					int bId=sc.nextInt();
					sc.nextLine();
					System.out.println("----------------------------------------------------------------");
					
					System.out.println("================================================================");
					System.out.println("All Courses");
					System.out.println("================================================================");
					
					for(int i=0 ; i<arrC.length ; i++)
					{
						System.out.println("Course Name:\t" + arrC[i].getName());
						System.out.println("Course ID:\t" + arrC[i].getId());
						System.out.println("");
					}
					
					System.out.println("Enter the course id for batch Allocation");
					int cId = sc.nextInt();
					sc.nextLine();
					System.out.println("----------------------------------------------------------------");
					
					
					
					
					
					break;
					
				case 5:
					
					System.out.println("================================================================");
					System.out.println("All Courses");
					System.out.println("================================================================");
					
					for(int i=0 ; i<arrC.length ; i++)
					{
						System.out.println("Course ID:\t" + arrC[i].getId());
						System.out.println("Course Name:\t" + arrC[i].getName());
						System.out.println("Course Fee:\t" + arrC[i].getFees());
						System.out.println("Course Duration:\t" + arrC[i].getDuration());
						System.out.println("------------------------------------------------------------");
					}
					
					break;
					
				case 6:
					
					break;
					
				case 7:
					
					break;
					
				case 8:
					
					System.out.println("=================================================================");
					System.out.println("All Enquiry");
					System.out.println("=================================================================");
					
					for(int i=0 ; i<arrE.length ; i++)
					{
						System.out.println("Enquiry Id:\t" + arrE[i].getId());
						System.out.println("Enquiry Status:\t" + arrE[i].getStatus());
						System.out.println("-------------------------------------------------------------");
					}
					
					break;
					
				case 9:
					
					System.out.println("=================================================================");
					System.out.println("All Admissions");
					System.out.println("=================================================================");
					
					for(int i=0 ; i<arrE.length ; i++)
					{
						if(arrE[i].getStatus() == true)
						{
							System.out.println("Enquiry Id:\t" + arrE[i].getId());
							System.out.println("-------------------------------------------------------------");
						}
					}
					break;
					
				case 10:
					
					System.out.println("===============================================================");
					System.out.println("Cancle Enquirys");
					System.out.println("===============================================================");
					
					for(int i=0 ; i<arrE.length ; i++)
					{
						if(arrE[i].getStatus() == false)
						{
							System.out.println("Enquiry Id:\t" + arrE[i].getId());
							System.out.println("Enquiry Status:\t" + arrE[i].getStatus());
							System.out.println("-------------------------------------------------------------");
						}
					}
					
				case 11:
					
					flag=false;
					break;
					
				default :
					
					System.out.println("Plz... Enter Valid Input!");
					
			}
			
			
		}while(flag==true);	
	}

}
