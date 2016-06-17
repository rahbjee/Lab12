public class AiRandom extends Player {
	
	public AiRandom (String n){
		super(n);
	}
	
	public Roshambo generateRoshambo() {
		int choice = (int) ((Math.random()*3)+1);
		if (choice == 1)
			setValue(Roshambo.PAPER);
		else if (choice == 2)
			setValue(Roshambo.ROCK);
		else if (choice == 3 )
			setValue(Roshambo.SCISSORS);
		return getValue();
	}
}
