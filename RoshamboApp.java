import java.util.Random;
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		String userInput = scan.nextLine();
//		PlayerRandom p = new PlayerRandom();
//		p.generateRoshambo();

		// initializing userHand and opponentWin to keep track
		int userHand = 0;
		int oppHand = 0;

		System.out.println("Welcome to ROCK PAPER SCISSOR!");
		System.out.println("------------------------------");

		// getting user's name
		String name = Validator.getString(scan, "Enter Your Name: ");
		Player user = new PlayerThree(name);
		user.generateRoshambo();
		// creating an opponent variable, conditional variable
		Player opponent = null;
		// see if user entered proper shark or jet
		boolean isValid = false;
		// see if user wants to play again
		boolean userContinue = true;

		while (userContinue) {
			while (isValid == false) {
				System.out.println("Would you like to play against TheJets or TheSharks? (j/s)");
				String opp = scan.nextLine();
//			char s;
//			char j;
				// initializes PlayerRock
				if (opp.equalsIgnoreCase("j")) {
					opponent = new PlayerRock("Dwayne \"The Rock\" Johnson");
					isValid = true;

					// initializes PlayerRandom
				} else if (opp.equalsIgnoreCase("s")) {
					opponent = new PlayerRandom();
					isValid = true;
				} else {
					System.out.println("Not valid input!");
				}
			}

			System.out.println("Playing against " + opponent.getName());
			System.out.println();

			String choice = Validator.getString(scan, "Rock, Paper, Scissor? (1/2/3) ");
			choice = choice.substring(0, 1);
			user.setHand(choice);

			// get hands
			Roshambo uHand = user.generateRoshambo();
			Roshambo oHand = opponent.generateRoshambo();

			if (uHand == oHand) {
				System.out.println("Draw!");
			} else if (uHand == Roshambo.ROCK && oHand == Roshambo.PAPER) {
				System.out.println(opponent.getName() + " wins!");
				oppHand += 1;
			} else if (uHand == Roshambo.ROCK && oHand == Roshambo.SCISSOR) {
				System.out.println("You Win!");
				userHand += 1;
			} else if (uHand == Roshambo.PAPER && oHand == Roshambo.ROCK) {
				System.out.println(opponent.getName() + " wins!");
				oppHand += 1;
			} else if (uHand == Roshambo.PAPER && oHand == Roshambo.SCISSOR) {
				System.out.println("You Win!");
				userHand += 1;
			} else if (uHand == Roshambo.SCISSOR && oHand == Roshambo.PAPER) {
				System.out.println(opponent.getName() + " wins!");
				oppHand += 1;
			} else if (uHand == Roshambo.SCISSOR && oHand == Roshambo.ROCK) {
				System.out.println("You Win!");
				userHand += 1;
			}
			
			System.out.println("again");
			// TODO: change logic
			if (userContinue) {
				userContinue = true;
			} else {
				userContinue = false;
			}
		}

	}
	
}// could just generate roshambos and tehn compare them immediately instead of my
	// else if

