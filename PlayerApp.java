import java.util.Scanner;

public class PlayerApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println("Enter Your Name: ");
		String userInput = scan.nextLine();
		PlayerRandom p = new PlayerRandom();
		 p.generateRoshambo();
//		
//		Scanner scan = new Scanner(System.in);
//		String userInput = scan.nextLine();
//		PlayerRandom p = new PlayerRandom();
//		p.generateRoshambo();
//		String opp;
//		int uW = 0;
//		int oW = 0;
//
//		System.out.println("Welcome to ROCK PAPER SCISSOR!");
//		System.out.println("------------------------------");
//
//		String name = Validator.getLine(scan, "Enter Your Name: ");
//		Player user = new PlayerThree(name);
//		Player opponent = null;
//
//		while (true) {
//			System.out.println("Would you like to play against TheJets or TheSharks? (j/s)");
//			opp = scan.next();
//			char s;
//			char j;
//			if (opp.equalsIgnoreCase("j")) {
//				
//				opponent = new PlayerRock();
//				break;
//			} else if (opp.equalsIgnoreCase("s")) {
//				opponent = new PlayerRandom();
//				break;
//			} else {
//				continue;
//			}
//		}
//
//		System.out.println("Playing against" + opponent.getName());
//		System.out.println();
//
//		while (true) {
//
//			String choice = Validator.getString(scan, "Rock, Paper, Scissor? (1/2/3");
//			choice = choice.substring(0, 1);
//			user.setHand(choice);
//
//			// get hands
//			Roshambo uHand = user.generateRoshambo();
//			Roshambo oHand = opponent.generateRoshambo();
//
//			int uH = 0;
//			if (uHand == oHand) {
//				System.out.println("Draw!");
//			} else if (uHand == Roshambo.ROCK && oHand == Roshambo.PAPER) {
//				System.out.println(opponent.getName() + " wins!");
//				oW += 1;
//			} else if (uHand == Roshambo.ROCK && oHand == Roshambo.SCISSOR) {
//				System.out.println("You Win!");
//				uH += 1;
//			} else if (uHand == Roshambo.PAPER && oHand == Roshambo.ROCK) {
//				System.out.println(opponent.getName() + " wins!");
//				oW += 1;
//			} else if (uHand == Roshambo.PAPER && oHand == Roshambo.SCISSOR) {
//				System.out.println("You Win!");
//				uH += 1;
//			} else if (uHand == Roshambo.SCISSOR && oHand == Roshambo.PAPER) {
//				System.out.println(opponent.getName() + " wins!");
//				oW += 1;
//			} else if (uHand == Roshambo.SCISSOR && oHand == Roshambo.ROCK) {
//				System.out.println("You Win!");
//				uH += 1;
//			}
//		}
//	}
//		
//	}
	}
	}
