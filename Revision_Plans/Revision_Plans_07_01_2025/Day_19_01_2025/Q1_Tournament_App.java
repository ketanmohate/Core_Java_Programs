package Day_19_01_2025;

import java.util.*;

class Players
{
	private int id;
	private String name;
	private int age;
	private int run;
	
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
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setRun(int run)
	{
		this.run=run;
	}
	public int getRun()
	{
		return run;
	}
}

class Teams
{
	Scanner sc = new Scanner(System.in);
	private int id;
	private String name;
	
	Players[] players;
	
	int alocateP[] = null;
	
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
}

class Mathche
{
	private int numOfOvers;
	private int matchId;
	private String matchName;
	private String location;
	
	Teams[] t;
	
	public void setNumOfOvers(int numOfOvers)
	{
		this.numOfOvers=numOfOvers;
	}
	public int getNumOfOvers()
	{
		return numOfOvers;
	}
	
	public void setMatchId(int matchId)
	{
		this.matchId=matchId;
	}
	public int getMatchId()
	{
		return matchId;
	}
	
	public void setMatchName(String matchName)
	{
		this.matchName=matchName;
	}
	public String getMatchName()
	{
		return matchName;
	}
	
	public void setLocation(String location)
	{
		this.location=location;
	}
	public String getLocation()
	{
		return location;
	}
	
}

public class Q1_Tournament_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		Players[] arrP = null;
		Teams[] arrT = null;
		Mathche[] arrM = null;
		
		do
		{
			System.out.println("======================================================================");
			System.out.println("Oprations");
			System.out.println("======================================================================");
			
			System.out.println("Case 1: Add Players");
			System.out.println("Case 2: Add New Teams");
			System.out.println("Case 3: Add Players in team");
			System.out.println("Case 4: Create Match");
			System.out.println("Case 5: allocate team to match");
			System.out.println("Case 6: View all teams");
			System.out.println("Case 7: Show team wise player list");
			System.out.println("Case 8: show player wise run");
			System.out.println("Case 9: team wise player run aggregate");
			System.out.println("Case 10: decide the winner");
			System.out.println("Case 11: show the over count played by team");
			System.out.println("Case 12: Exit");
			
			System.out.println("======================================================================");
			
			
			System.out.println("Enter Your Choise:");
			int choise = sc.nextInt();
			sc.nextLine();
			System.out.println("----------------------------------------------------------------------");
			
			switch(choise)
			{
			
				case 1:
					
					System.out.println("How Many Player Add");
					int nPlayers = sc.nextInt();
					sc.nextLine();
					System.out.println("--------------------------------------------------------------");
					
					arrP = new Players[nPlayers];
					
					for(int i=0 ; i<arrP.length ; i++)
					{
						System.out.println("Enter the Id");
						int id = sc.nextInt();
						sc.nextLine();
						
						System.out.println("Enter the Name");
						String name = sc.nextLine();
						
						System.out.println("Enter the Age");
						int age = sc.nextInt();
						sc.nextLine();
						
						System.out.println("Enter the Run");
						int run = sc.nextInt();
						sc.nextLine();
						
						System.out.println("---------------------------------------------------------------");
						
						Players p = new Players();
						
						p.setId(id);
						p.setName(name);
						p.setAge(age);
						p.setRun(run);
						
						arrP[i] = p;
						
					}
					break;
					
					
				case 2:
					
					System.out.println("How Many Teams Add");
					int nTeams = sc.nextInt();
					sc.nextLine();
					System.out.println("--------------------------------------------------------------");
					
					arrT = new Teams[nTeams];
					
					for(int i=0 ; i<arrT.length ; i++)
					{
						System.out.println("Enter the Id");
						int id = sc.nextInt();
						sc.nextLine();
						
						System.out.println("Enter the Name");
						String name = sc.nextLine();
						
						System.out.println("---------------------------------------------------------------");
						
						Teams t = new Teams();
						
						t.setId(id);
						t.setName(name);
						
						arrT[i] = t;
					}
					break;
					
				case 3:
					
					System.out.println("====================================================================");
					System.out.println("Team List");
					System.out.println("====================================================================");
					
					for(int i=0 ; i<arrT.length ; i++)
					{
						System.out.println("Team Id:\t " + arrT[i].getId());
						System.out.println("Team Name:\t " + arrT[i].getName());
						System.out.println("----------------------------------------------------------------");
					}
					
					System.out.println("====================================================================");
					System.out.println("Add Playes");
					System.out.println("====================================================================");
					
					System.out.println("Enter The Team Id To Add Playes");
					int tId=sc.nextInt();
					sc.nextLine();
					System.out.println("--------------------------------------------------------------------");
					
					
					int allocateP[] = new int[15];
					
					for(int i=0 ; i<arrT.length ;i++)
					{
						if(tId == arrT[i].getId())
						{
							System.out.println("------------------------------------------------------------------------");
							System.out.println("Players List");
							System.out.println("------------------------------------------------------------------------");
							
							for(int j=0 ; j<arrP.length ; j++)
							{
								System.out.println("Id:\t" + arrP[j].getId());
								System.out.println("Name:\t" + arrP[j].getName());
								System.out.println("Age:\t" + arrP[j].getAge());
								System.out.println("Run:\t" + arrP[j].getRun());
								System.out.println("-------------------------------------------------------------------");
							}
							
							System.out.println("********************************************************************");
							System.out.println("Add 15 Players In Team");
							System.out.println("********************************************************************");
							
							int m=0;
							for (int k = 0; k < allocateP.length ; k++) 
							{
                                System.out.println("Enter Player " + (k + 1) + " Id:");
                                int pId = sc.nextInt();

                                boolean validId = false;
                                for (int j = 0; j < arrP.length; j++) 
                                {
                                    if (pId == arrP[j].getId()) 
                                    {
                                        validId = true;
                                        break;
                                    }
                                }

                                if (validId) 
                                {
                                    allocateP[m++] = pId;
                                } 
                                else 
                                {
                                    System.out.println("Please enter a valid Player Id");
                                }
                            }
                             
							break;
						}
						else
						{
							System.out.println("Pls Enter Valid Id");
						}
					}
					
					break;
					
				case 4:
					
					System.out.println("=========================================================================");
					System.out.println("Create Match");
					System.out.println("=========================================================================");
					
					arrM = new Mathche[1];
					
					for(int i=0 ; i<arrM.length ; i++)
					{
						System.out.println("Enter The Number Of Overs");
						int numOfOvers = sc.nextInt();
						sc.nextLine();
						
						System.out.println("Enter The Match Id");
						int mId=sc.nextInt();
						sc.nextLine();
						
						System.out.println("Enter The Match Name");
						String mName = sc.nextLine();
						
						System.out.println("Enter The Location");
						String location = sc.nextLine();

						Mathche m = new Mathche();
						
						m.setNumOfOvers(numOfOvers);
						m.setMatchId(mId);
						m.setMatchName(mName);
						m.setLocation(location);
						
						arrM[i] = m;
					}
					
					break;
					
				case 5:
					
					System.out.println("=========================================================================");
					System.out.println("Matches List");
					System.out.println("=========================================================================");
					
					for(int i=0 ; i<arrM.length ; i++)
					{
						System.out.println("Num Of Overs\t" + arrM[i].getNumOfOvers());
						System.out.println("Match Id\t" + arrM[i].getMatchId());
						System.out.println("Match Name\t" + arrM[i].getMatchName());
						System.out.println("Match Location\t" + arrM[i].getLocation());
					}
					
					System.out.println("=========================================================================");
					System.out.println("allocate team to match");
					System.out.println("=========================================================================");
					
					System.out.println("Enter the Match Id");
					int mId = sc.nextInt();
					sc.nextLine();
					System.out.println("-------------------------------------------------------------------------");
					
					int allocateM[] = new int[2];
					
					for(int i=0 ; i<arrM.length ; i++)
					{
						if(arrM[i].getMatchId() == mId)
						{
							System.out.println("Enter The First Team Id");
							int firstTeamId = sc.nextInt();
							sc.nextLine();
							
							System.out.println("Enter The Secound Team Id");
							int secondTeamId = sc.nextInt();
							sc.nextLine();
							
							boolean firstTeamExists = false; 
							boolean	secondTeamExists = false;

				            for (int j = 0; j < arrT.length; j++) 
				            {
				                if (arrT[j].getId() == firstTeamId) 
				                {
				                    firstTeamExists = true;
				                }
				                if (arrT[j].getId() == secondTeamId) 
				                {
				                    secondTeamExists = true;
				                }
				            }
				            if (firstTeamExists && secondTeamExists) 
				            {
//				                arrM[i].t = new Teams[2];
//				                arrM[i].t[0] = new Teams();
//				                arrM[i].t[1] = new Teams();
//				                arrM[i].t[0].setId(firstTeamId);
//				                arrM[i].t[1].setId(secondTeamId);

				            	allocateM[0] = firstTeamId ;
				            	allocateM[1] = secondTeamId ;

				                System.out.println("Teams successfully allocated to the match!");
				            } 
				            else 
				            {
				                System.out.println("Error: One or both of the team IDs are invalid.");
				            }
							break;
						}
					}
//					if (!matchFound)
//					{
//				        System.out.println("Error: Match ID not found.");
//				    }
					
					break;
					
				case 6:
					
					System.out.println("=======================================================================");
					System.out.println("View All Teams");
					System.out.println("=======================================================================");
					
					for(int i=0 ; i<arrT.length ; i++)
					{
						System.out.println("Team Id:\t" + arrT[i].getId());
						System.out.println("Team Name:\t" + arrT[i].getName());
					}
					
				default : System.out.println("Invalid choice! Please try again.");
				break;
				
				case 7:
					
					System.out.println("=======================================================================");
					System.out.println("HJso");
					System.out.println("=======================================================================");
			}
			
		}while(flag==true);
	}

}
