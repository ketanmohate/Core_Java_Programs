package Day_16_01_2025;
import java.util.Scanner;

class Courses1 {
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

class Enquirys1 {
    private int id;
    private boolean status = false;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }
}

public class Q1_Institute_Management_Application_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        Courses1[] arrC = null;
        Enquirys1[] arrE = null;

        do {
            System.out.println("============================================================================");
            System.out.println("Menus");
            System.out.println("============================================================================");

            System.out.println("Case 1: Add New Courses");
            System.out.println("Case 2: Take Enquiry");
            System.out.println("Case 3: Enroll For Admission");
            System.out.println("Case 4: Allocate Batch");
            System.out.println("Case 5: View All Courses");
            System.out.println("Case 8: View All Enquiry");
            System.out.println("Case 9: View All Admission");
            System.out.println("Case 10: View Cancel Enquiry");
            System.out.println("Case 11: Exit");

            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println("---------------------------------------------------------------------------");

            switch (choice) {
                case 1:
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Enter how many Courses to add");
                    int nCourses = sc.nextInt();
                    sc.nextLine();
                    System.out.println("-------------------------------------------------------------------");

                    arrC = new Courses1[nCourses];

                    for (int i = 0; i < arrC.length; i++) {
                        Courses1 c = new Courses1();

                        System.out.println("Enter the Name");
                        String name = sc.nextLine();

                        int id;
                        boolean isDuplicate;
                        do {
                            System.out.println("Enter the Id");
                            id = sc.nextInt();
                            sc.nextLine();

                            isDuplicate = false;
                            for (int j = 0; j < i; j++) {
                                if (arrC[j].getId() == id) {
                                    System.out.println("Duplicate ID! Please enter a unique ID.");
                                    isDuplicate = true;
                                    break;
                                }
                            }
                        } while (isDuplicate);

                        c.setName(name);
                        c.setId(id);
                        arrC[i] = c;
                    }
                    break;

                case 2:
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Enter how many Enquiries to take");
                    int nEnquiry = sc.nextInt();
                    sc.nextLine();
                    System.out.println("--------------------------------------------------------------------");

                    arrE = new Enquirys1[nEnquiry];

                    for (int i = 0; i < arrE.length; i++) {
                        Enquirys1 e = new Enquirys1();

                        int id;
                        boolean isDuplicate;
                        do {
                            System.out.println("Enter the Id");
                            id = sc.nextInt();
                            sc.nextLine();

                            isDuplicate = false;
                            for (int j = 0; j < i; j++) {
                                if (arrE[j].getId() == id) {
                                    System.out.println("Duplicate ID! Please enter a unique ID.");
                                    isDuplicate = true;
                                    break;
                                }
                            }
                        } while (isDuplicate);

                        e.setId(id);
                        arrE[i] = e;
                    }
                    break;

                case 3:
                    if (arrE == null) {
                        System.out.println("No Enquiries found!");
                        break;
                    }
                    System.out.println("================================================================");
                    System.out.println("All Enquiries");
                    System.out.println("================================================================");

                    System.out.println("Enter the Enquiry id which is ready for admission");
                    int eId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("----------------------------------------------------------------");

                    boolean found = false;
                    for (Enquirys1 e : arrE) {
                        if (e.getId() == eId) {
                            e.setStatus(true);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Enquiry ID not found!");
                    }
                    break;

                case 5:
                    if (arrC == null) {
                        System.out.println("No Courses found!");
                        break;
                    }
                    System.out.println("================================================================");
                    System.out.println("All Courses");
                    System.out.println("================================================================");

                    for (Courses1 c : arrC) {
                        System.out.println("Course Name:\t" + c.getName());
                        System.out.println("Course ID:\t" + c.getId());
                        System.out.println("------------------------------------------------------------");
                    }
                    break;

                case 8:
                    if (arrE == null) {
                        System.out.println("No Enquiries found!");
                        break;
                    }
                    System.out.println("=================================================================");
                    System.out.println("All Enquiries");
                    System.out.println("=================================================================");

                    for (Enquirys1 e : arrE) {
                        System.out.println("Enquiry Id:\t" + e.getId());
                        System.out.println("Enquiry Status:\t" + e.getStatus());
                        System.out.println("-------------------------------------------------------------");
                    }
                    break;

                case 9:
                    if (arrE == null) {
                        System.out.println("No Admissions found!");
                        break;
                    }
                    System.out.println("=================================================================");
                    System.out.println("All Admissions");
                    System.out.println("=================================================================");

                    for (Enquirys1 e : arrE) {
                        if (e.getStatus()) {
                            System.out.println("Enquiry Id:\t" + e.getId());
                            System.out.println("-------------------------------------------------------------");
                        }
                    }
                    break;

                case 10:
                    if (arrE == null) {
                        System.out.println("No Enquiries found!");
                        break;
                    }
                    System.out.println("===============================================================");
                    System.out.println("Cancelled Enquiries");
                    System.out.println("===============================================================");

                    for (Enquirys1 e : arrE) {
                        if (!e.getStatus()) {
                            System.out.println("Enquiry Id:\t" + e.getId());
                            System.out.println("Enquiry Status:\t" + e.getStatus());
                            System.out.println("-------------------------------------------------------------");
                        }
                    }
                    break;

                case 11:
                    flag = false;
                    break;

                default:
                    System.out.println("Please enter a valid input!");
            }
        } while (flag);
    }
}
