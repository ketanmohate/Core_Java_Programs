package Day_16_01_2025;
/*JAVA PROGRAM
Example: Institute Management Application using classes and objects with array of objects concept.
Case 1: Add New Courses (3 course) : using this case we can create new course using Course class array of object
note: course name should be duplicate as well as course id should be duplicated
Case 2: Take Enquiry: you have to create 10 enquiry objects using array of object and enquiry id should not duplicate 
and set all enquiry status by default false and show the all courses to enquiry and allocate course to enquiry using course id
Case 3: Enroll For Admission:
In this case you have to show all enquires and input the enquiry id which is ready for admission and change enquiry status 
from false to true  
Case 4: Allocate Batch : you have to input the batch detail using single object and show the all courses and ask course id
 for batch then allocate batch to course and fetch all admission according to that course and allocate in batch
Case 5: View All Courses: show the
Case 6: View Course Wise students
Case 7: View Batch Wise Student
Case 8: View All Enquiry
Case 9: View All Admission
Case 10: View Cancel Enquiry
*/

import java.util.*;

class Course{
	private String Cname;
	private int Cid;
	
	public void setCourseName(String Cname){
		this.Cname = Cname;
	}
	public String getCourseName(){
		return Cname;
	}
	
	public void setCourseId(int Cid){
		this.Cid = Cid;
	}
	public int getCourseId(){
		return Cid;
	}
	
	public void displayCourse(){
		System.out.println("Course ID: "+Cid + "\t\t" + "Course name: "+Cname);
	}
}
class Enquiry{
	private int Eid;
	private boolean Estatus;
	private int allocatedCId;
	
	public void setEnquiryId(int Eid){
		this.Eid = Eid;
	}
	public int getEnquiryId(){
		return Eid;
	}
	
	public void setEnquiryStatus(boolean Estatus){
		this.Estatus = Estatus;
	}
	public boolean getEnquiryStatus(){
		return Estatus;
	}
	
	public void setAllocatedCId(int allocatedCId){
		this.allocatedCId = allocatedCId;
	}
	public int getAllocatedCId(){
		return allocatedCId;
	}
	public void displayEnquiry(){
		System.out.println("Enquiry Id: "+Eid +  "\t\t" +"Enquiry Status: "+Estatus + "Course Id: "+allocatedCId);
	}
}
class Admission{
	private Enquiry enquiry;
	
	public void setEnquiry(Enquiry e){
		this.enquiry = e;
		e.setEnquiryStatus(true);
	}
	public void displayAdmission(){
		System.out.println("Admission confirmed of Equiry Id: " + enquiry.getEnquiryId());
	}
}
class Batch{
	private int Bid;
	private int courseId;
	
	public void setBatchID(int Bid){
		this.Bid = Bid;
	}
	public int getBatchID(){
		return Bid;
	}
	
	public void setCourseId(int courseId){
		this.courseId = courseId;
	}
	public int getCourseId(){
		return courseId;
	}
	public void displayBatch(){
		System.out.println("Batch ID: "+Bid +"\t\t" +"Course Id: "+ courseId);
	}
}	
public class InstituteManagementApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course[] course = new Course[10];
        Enquiry[] enquiry = new Enquiry[10];
        Admission[] admission = new Admission[10];
        Batch[] batch = new Batch[10];

        int courseCount = 0, enquiryCount = 0, admissionCount = 0, batchCount = 0;
        int choice;

        do {
            System.out.println("\n===== Institute Management Menu =====");
            System.out.println("1. Add New Course");
            System.out.println("2. Take Enquiry");
            System.out.println("3. Enroll For Admission");
            System.out.println("4. Allocate Batch");
            System.out.println("5. View All Courses");
            System.out.println("6. View All Enquiries");
            System.out.println("7. View All Admissions");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1: // Add New Course
                    if (courseCount < course.length) 
                    {
                        course[courseCount] = new Course();
						
                        System.out.print("Enter Course Name: ");
                        String cname = sc.nextLine();
						
                        System.out.print("Enter Course ID: ");
                        int Cid = sc.nextInt();
                        sc.nextLine(); 

                        course[courseCount].setCourseName(cname);
                        course[courseCount].setCourseId(Cid);
                        courseCount++;
						
                        System.out.println("Course Added Successfully!");
                    } 
					else{
                        System.out.println("Course limit reached!");
                    }
                    break;

                case 2: // Take Enquiry
                    if (enquiryCount < enquiry.length){
                        enquiry[enquiryCount] = new Enquiry();
						
                        System.out.print("Enter Enquiry Id: ");
                        int Eid = sc.nextInt();

                        enquiry[enquiryCount].setEnquiryId(Eid);
						
                        enquiry[enquiryCount].setEnquiryStatus(false);

                        System.out.println("Available Courses:");
                        for (int i = 0; i < courseCount; i++) {
                            course[i].displayCourse();
                        }

                        System.out.print("Enter Course ID to allocate enquiry: ");
                        int allocatedCId = sc.nextInt();
						
                        enquiry[enquiryCount].setAllocatedCId(allocatedCId);
                        enquiryCount++;
						
                        System.out.println("Enquiry Taken Successfully!");
                    } 
					else {
                        System.out.println("Enquiry limit reached!");
                    }
                    break;

                case 3: // Enroll For Admission
                    System.out.println("Enquiries Ready for Admission:");
                    for (int i = 0; i < enquiryCount; i++)
                    {
                        if (!enquiry[i].getEnquiryStatus())
                        {
                            enquiry[i].displayEnquiry();
                        }
                    }

                    System.out.print("Enter Enquiry ID for Admission: ");
                    int admitId = sc.nextInt();

                    for (int i = 0; i < enquiryCount; i++) 
                    {
                        if (enquiry[i].getEnquiryId() == admitId && !enquiry[i].getEnquiryStatus())
                        {
                            admission[admissionCount] = new Admission();
                            admission[admissionCount].setEnquiry(enquiry[i]);
                            admissionCount++;
                            System.out.println("Admission Successful!");
                            break;
                        }
                    }
                    break;

                case 4: // Allocate Batch
                    if (batchCount < batch.length){
                        batch[batchCount] = new Batch();
                        System.out.print("Enter Batch ID: ");
                        int batchID = sc.nextInt();
                        batch[batchCount].setBatchID(batchID);

                        System.out.println("Available Courses:");
                        for (int i = 0; i < courseCount; i++){
                            course[i].displayCourse();
                        }

                        System.out.print("Enter Course ID to allocate Batch: ");
                        int batchCId = sc.nextInt();
                        batch[batchCount].setCourseId(batchCId);
                        batchCount++;

                        System.out.println("Batch Allocated Successfully!");
                    } 
					else{
                        System.out.println("Batch limit reached!");
                    }
                    break;

                case 5: // View All Courses
                    System.out.println("All Courses:");
                    for (int i = 0; i < courseCount; i++) {
                        course[i].displayCourse();
                    }
                    break;

                case 6: // View All Enquiries
                    System.out.println("All Enquiries:");
                    for (int i = 0; i < enquiryCount; i++) {
                        enquiry[i].displayEnquiry();
                    }
                    break;

                case 7: // View All Admissions
                    System.out.println("All Admissions:");
                    for (int i = 0; i < admissionCount; i++) {
                        admission[i].displayAdmission();
                    }
                    break;

                case 8:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice! Try again.");
            }
        } while (choice != 8);
    }
}