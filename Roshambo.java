
public enum Roshambo {

	ROCK, PAPER, SCISSOR;

	public String toString() {
		switch (this) {
		case ROCK:
			return "You picked Rock!";
		case PAPER:
			return "You picked Paper!";
		case SCISSOR:
			return "You picked Scissor!";
		}
		return "";
	}

}
