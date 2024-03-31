package Swiggy;

public class MagicalArena {
	
	public static void main(String[] args) {
		
		// Static data for players
        Player playerA = new Player(50, 10, 10);
        Player playerB = new Player(50, 10, 10);

        // Create a match in the magical arena
        Match match = new Match(playerA, playerB);
        match.fight();

        // Determine and print the winner
        String winner = getMatchResult(playerA, playerB);
        System.out.println("Winner: " + winner);
    }

    public static String getMatchResult(Player playerA, Player playerB) {
        if (playerA.getHealth() <= 0) {
            return "Player B wins!";
        } else {
            return "Player A wins!";
        }
    }
//For  dyanamic input we can use the below code		
//			System.out.println("Player A");
//			Scanner sc=new Scanner(System.in);
//			
//			System.out.println("Enter the health of Player A:");
//			int healthA=sc.nextInt();
//			System.out.println("Enter the Strength of Player A:");
//			int StrengthA=sc.nextInt();
//			System.out.println("Enter the attack of Player A:");
//			int attackA=sc.nextInt();
//
//
//			System.out.println("Player B");
//			System.out.println("Enter the health of Player B:");
//			int healthB=sc.nextInt();
//			System.out.println("Enter the Strength of Player B:");
//			int StrengthB=sc.nextInt();
//			System.out.println("Enter the attack of Player B:");
//			int attackB=sc.nextInt();
//			
//			
//		 	Player playerA = new Player(healthA, StrengthA, attackA);
//	        Player playerB = new Player(healthB, StrengthB, attackB);
	
}
