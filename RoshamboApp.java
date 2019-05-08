import java.util.Random;
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		PlayerRandom p = new PlayerRandom();
		p.generateRoshambo();
		char opp;
		int uW = 0;
		int oW = 0;

		System.out.println("Welcome to ROCK PAPER SCISSOR!");
		System.out.println("------------------------------");

		String name = Validator.getLine(scan, "Enter Your Name: ");
		Player user = new Player(name);
		Player opponent = null;

		while (true) {
			System.out.println("Would you like to play against TheJets or TheSharks? (j/s)");
			opp = scan.next().charAt(0);
			char s;
			char j;
			if (opp == j) {
				opponent = new PlayerRock();
				break;
			} else if (opp == s) {
				opponent = new PlayerRandom();
				break;
			} else {
				continue;
			}
		}

		System.out.println("Playing against" + opponent.getName());
		System.out.println();

		while (true) {

			String choice = Validator.getString(scan, "Rock, Paper, Scissor? (1/2/3");
			choice = choice.substring(0, 1);
			user.setHand(choice);

			// get hands
			Roshambo uHand = user.generateRoshambo();
			Roshambo oHand = opponent.generateRoshambo();

			int uH;
			if (uHand == oHand) {
				System.out.println("Draw!");
			} else if (uHand == Roshambo.ROCK && oHand == Roshambo.PAPER) {
				System.out.println(opponent.getName() + " wins!");
				oW += 1;
			} else if (uHand == Roshambo.ROCK && oHand == Roshambo.SCISSOR) {
				System.out.println("You Win!");
				uH += 1;
			} else if (uHand == Roshambo.PAPER && oHand == Roshambo.ROCK) {
				System.out.println(opponent.getName() + " wins!");
				oW += 1;
			} else if (uHand == Roshambo.PAPER && oHand == Roshambo.SCISSOR) {
				System.out.println("You Win!");
				uH += 1;
			} else if (uHand == Roshambo.SCISSOR && oHand == Roshambo.PAPER) {
				System.out.println(opponent.getName() + " wins!");
				oW += 1;
			} else if (uHand == Roshambo.SCISSOR && oHand == Roshambo.ROCK) {
				System.out.println("You Win!");
				uH += 1;
			}
		}
	}
}
