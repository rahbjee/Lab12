public class Rocker extends Player {

	public Rocker(String n) {
		super(n);
	}
	@Override
	public Roshambo generateRoshambo() {
		setValue(Roshambo.ROCK);
		return getValue();
	}

}
