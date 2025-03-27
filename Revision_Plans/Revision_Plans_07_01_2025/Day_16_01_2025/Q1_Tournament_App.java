package Day_16_01_2025;

import java.util.*;

class Players {
    private int id;
    private String name;
    private int age;
    private int run;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getRun() {
        return run;
    }
}

class Teams {
    private int id;
    private String name;
    private int[] playerIds; // changed from List<Integer> to int[] array
    private int totalRuns = 0;
    private int totalOvers = 0;
    private int currentPlayerCount = 0; // to keep track of the number of players added

    public Teams(int maxPlayers) {
        playerIds = new int[maxPlayers]; // initializing the array based on the max players
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getPlayerIds() {
        return playerIds;
    }

    public void addPlayer(int playerId) 
        if (currentPlayerCount < playerIds.length) {
            playerIds[currentPlayerCount++] = playerId;
        } else {
            System.out.println("Team is already full!");
        }
    }

    public void addRun(int run) {
        totalRuns += run;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void addOvers(int overs) {
        totalOvers += overs;
    }

    public int getTotalOvers() {
        return totalOvers;
    }
}

class Match {
    private int numOfOvers;
    private int matchId;
    private String matchName;
    private String location;
    private int team1Id;
    private int team2Id;

    public void setNumOfOvers(int numOfOvers) {
        this.numOfOvers = numOfOvers;
    }

    public int getNumOfOvers() {
        return numOfOvers;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setTeams(int team1Id, int team2Id) {
        this.team1Id = team1Id;
        this.team2Id = team2Id;
    }

    public int[] getTeams() {
        return new int[]{team1Id, team2Id};
    }
}

public class Q1_Tournament_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Players[] players = null;
        Teams[] teams = null;
        Match[] matches = null;

        boolean flag = true;

        while (flag) {
            System.out.println("==================================================");
            System.out.println("Tournament Application Menu");
            System.out.println("==================================================");
            System.out.println("1. Add Players");
            System.out.println("2. Add Teams");
            System.out.println("3. Add Players to Teams");
            System.out.println("4. Create Match");
            System.out.println("5. Allocate Teams to Match");
            System.out.println("6. View All Teams");
            System.out.println("7. Show Player-wise Runs");
            System.out.println("8. Show Team-wise Player Run Aggregate");
            System.out.println("9. Decide the Winner");
            System.out.println("10. Show Over Count Played by Team");
            System.out.println("11. Exit");
            System.out.println("==================================================");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    // Add Players
                    System.out.print("How many players to add? ");
                    int numPlayers = sc.nextInt();
                    sc.nextLine();
                    players = new Players[numPlayers];
                    for (int i = 0; i < numPlayers; i++) {
                        System.out.println("Enter details for Player " + (i + 1) + ":");
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Runs: ");
                        int runs = sc.nextInt();
                        sc.nextLine();

                        Players player = new Players();
                        player.setId(id);
                        player.setName(name);
                        player.setAge(age);
                        player.setRun(runs);

                        players[i] = player;
                    }
                    break;

                case 2:
                    // Add Teams
                    System.out.print("How many teams to add? ");
                    int numTeams = sc.nextInt();
                    sc.nextLine();
                    teams = new Teams[numTeams];
                    for (int i = 0; i < numTeams; i++) {
                        System.out.println("Enter details for Team " + (i + 1) + ":");
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Max Players: ");
                        int maxPlayers = sc.nextInt();
                        sc.nextLine();

                        Teams team = new Teams(maxPlayers);
                        team.setId(id);
                        team.setName(name);

                        teams[i] = team;
                    }
                    break;

                case 3:
                    // Add Players to Teams
                    if (teams == null || players == null) {
                        System.out.println("Please add teams and players first!");
                        break;
                    }
                    System.out.print("Enter Team ID to add players: ");
                    int teamId = sc.nextInt();
                    sc.nextLine();

                    Teams selectedTeam = null;
                    
                    for (Teams team : teams) {
                        if (team.getId() == teamId) {
                            selectedTeam = team;
                            break;
                        }
                    }

                    if (selectedTeam == null) {
                        System.out.println("Invalid Team ID!");
                        break;
                    }

                    System.out.print("How many players to add to this team? ");
                    int numTeamPlayers = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < numTeamPlayers; i++) {
                        System.out.print("Enter Player ID to add: ");
                        int playerId = sc.nextInt();
                        sc.nextLine();

                        boolean validPlayer = false;
                        for (Players player : players) {
                            if (player.getId() == playerId) {
                                validPlayer = true;
                                selectedTeam.addPlayer(playerId);
                                break;
                            }
                        }

                        if (!validPlayer) {
                            System.out.println("Invalid Player ID!");
                        }
                    }
                    break;

                case 4:
                    // Create Match
                    System.out.print("How many matches to create? ");
                    int numMatches = sc.nextInt();
                    sc.nextLine();
                    matches = new Match[numMatches];
                    for (int i = 0; i < numMatches; i++) {
                        System.out.println("Enter details for Match " + (i + 1) + ":");
                        System.out.print("Number of Overs: ");
                        int overs = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Match ID: ");
                        int matchId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Match Name: ");
                        String matchName = sc.nextLine();
                        System.out.print("Location: ");
                        String location = sc.nextLine();

                        Match match = new Match();
                        match.setNumOfOvers(overs);
                        match.setMatchId(matchId);
                        match.setMatchName(matchName);
                        match.setLocation(location);

                        matches[i] = match;
                    }
                    break;

                case 5:
                    // Allocate Teams to Match
                    if (matches == null || teams == null) {
                        System.out.println("Please create matches and teams first!");
                        break;
                    }
                    System.out.print("Enter Match ID to allocate teams: ");
                    int matchId = sc.nextInt();
                    sc.nextLine();

                    Match selectedMatch = null;
                    for (Match match : matches) {
                        if (match.getMatchId() == matchId) {
                            selectedMatch = match;
                            break;
                        }
                    }

                    if (selectedMatch == null) {
                        System.out.println("Invalid Match ID!");
                        break;
                    }

                    System.out.print("Enter First Team ID: ");
                    int firstTeamId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Second Team ID: ");
                    int secondTeamId = sc.nextInt();
                    sc.nextLine();

                    boolean firstTeamValid = false;
                    boolean secondTeamValid = false;
                    for (Teams team : teams) {
                        if (team.getId() == firstTeamId) {
                            firstTeamValid = true;
                        }
                        if (team.getId() == secondTeamId) {
                            secondTeamValid = true;
                        }
                    }

                    if (!firstTeamValid || !secondTeamValid) {
                        System.out.println("Invalid Team IDs!");
                        break;
                    }

                    selectedMatch.setTeams(firstTeamId, secondTeamId);
                    break;

                case 6:
                    // View All Teams
                    if (teams == null) {
                        System.out.println("No teams available!");
                        break;
                    }
                    for (Teams team : teams) {
                        System.out.println("Team ID: " + team.getId() + ", Team Name: " + team.getName());
                    }
                    break;

                case 7:
                    // Show Player-wise Runs
                    if (players == null) {
                        System.out.println("No players available!");
                        break;
                    }
                    for (Players player : players) {
                        System.out.println("Player ID: " + player.getId() + ", Name: " + player.getName() + ", Runs: " + player.getRun());
                    }
                    break;

                case 8:
                    // Show Team-wise Player Run Aggregate
                    if (teams == null) {
                        System.out.println("No teams available!");
                        break;
                    }
                    for (Teams team : teams) {
                        System.out.println("Team: " + team.getName() + " - Total Runs: " + team.getTotalRuns());
                    }
                    break;

                case 9:
                    // Decide Winner
                    if (matches == null || teams == null) {
                        System.out.println("No matches or teams available!");
                        break;
                    }
                    System.out.print("Enter Match ID to decide the winner: ");
                    int matchToDecide = sc.nextInt();
                    sc.nextLine();

                    Match matchToCheck = null;
                    for (Match match : matches) {
                        if (match.getMatchId() == matchToDecide) {
                            matchToCheck = match;
                            break;
                        }
                    }

                    if (matchToCheck == null) {
                        System.out.println("Invalid Match ID!");
                        break;
                    }

                    // You could add logic to calculate winner here, depending on team scores.
                    break;

                case 10:
                    // Show Over Count Played by Team
                    if (teams == null) {
                        System.out.println("No teams available!");
                        break;
                    }
                    for (Teams team : teams) {
                        System.out.println("Team: " + team.getName() + " - Total Overs: " + team.getTotalOvers());
                    }
                    break;

                case 11:
                    // Exit
                    flag = false;
                    System.out.println("Exiting the application.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
