import java.util.Scanner;

public class PlayerApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println("Enter Your Name: ");
		String userInput = scan.nextLine();
		PlayerRandom p = new PlayerRandom();
		// p.generateRoshambo();

	}

}
