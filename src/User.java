public class User extends Player {

		public User(String n){
			super(n);
		}
		
		public Roshambo generateRoshambo(){
			setValue(Roshambo.PAPER);
			return getValue();
		}
		
		
}
