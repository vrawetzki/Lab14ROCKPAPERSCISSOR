
public class PlayerRock extends Player {

	public PlayerRock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlayerRock(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {

		return Roshambo.ROCK;
	}
}
