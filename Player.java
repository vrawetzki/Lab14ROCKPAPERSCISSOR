
public abstract class Player {

	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public Player() {
		
	}

	public abstract Roshambo generateRoshambo();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHand(String choice) {
		// TODO Auto-generated method stub

	}

}
