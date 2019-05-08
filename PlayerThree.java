import java.util.Random;
import java.util.Scanner;

public class PlayerThree extends Player {

	Scanner scan = new Scanner(System.in);
	int userInput = scan.nextInt();

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub

		Roshambo roshambo = null;
		Random rand = new Random();
		int num = rand.nextInt(3);
		num += 1;
		if (num == 3) {
			roshambo = Roshambo.SCISSOR;
		} else if (num == 2)
			roshambo = Roshambo.PAPER;
		else if (num == 1) {
			roshambo = Roshambo.ROCK;
		}

		return roshambo;
	}
}

//public static final int ROCK = 1;
//public static final int PAPER = 2;
//public static final int SCISSOR = 3;
//
//public static void display(String name, int userInput) {
//	switch (userInput) {
//	case 1:
//		System.out.println(name + " selected ROCK  ");
//		break;
//	case 2:
//		System.out.println(name + " selected PAPER  ");
//		break;
//	case 3: 
//		System.out.println(name + " selected SCISSOR");
//		break;
//	}
//}