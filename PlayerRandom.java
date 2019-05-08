import java.util.Random;

public class PlayerRandom extends Player {

	public PlayerRandom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlayerRandom(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {

		Roshambo roshambo = null;
		Random rand = new Random();
		int num = rand.nextInt(3);
		num += 1; // so that it isnt zero

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
