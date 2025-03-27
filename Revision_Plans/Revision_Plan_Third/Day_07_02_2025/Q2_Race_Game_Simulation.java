package Day_07_02_2025;
import java.util.*;

class Player implements Runnable 
{
    private String name;
    private int position = 0;
    private static final int FINISH_LINE = 100;
    private static boolean raceWon = false;
    
    public Player(String name) 
    {
        this.name = name;
    }
    
    @Override
    synchronized public void run() 
    {
        Random random = new Random();
        
        while (position < FINISH_LINE && !raceWon) 
        {
            int move = random.nextInt(5) + 1; // Move between 1 and 5 units
            position += move;
            System.out.println(name + " moved " + move + " units. Current position: " + position);
            
            if (position >= FINISH_LINE && !raceWon) 
            {
                raceWon = true;
                System.out.println(name + " has won the race!");
            }
            
            try {
                Thread.sleep(500); // Delay to simulate real-time movement
            } 
            catch (InterruptedException e) 
            {
                System.out.println(name + " was interrupted.");
            }
        }
    }
}

public class Q2_Race_Game_Simulation 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        Thread[] players = new Thread[numPlayers];
        
        for (int i = 0; i < numPlayers; i++) 
        {
            System.out.print("Enter name for Player " + (i + 1) + ": ");
            String name = scanner.nextLine();
            players[i] = new Thread(new Player(name));
        }
        
        System.out.println("Race started!");
        
        for (Thread player : players) 
        {
            player.start();
        }
        
        for (Thread player : players)
        {
            try 
            {
                player.join();
            }
            catch (InterruptedException e) 
            {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Race is over!");
    }
}
