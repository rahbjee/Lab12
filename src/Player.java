public abstract class Player {
	
	private String name;
	private Roshambo value;
	
	public Player(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}

	public Roshambo getValue() {
		return value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Roshambo setValue(Roshambo value) {
		return this.value = value;
	}

	
	public abstract Roshambo generateRoshambo();
	
}
