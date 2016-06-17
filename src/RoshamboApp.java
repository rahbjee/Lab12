import java.util.Scanner;

public class RoshamboApp implements Validator {

	public static void main(String[] args) {
		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.print("Enter your name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		User gamer = new User(name);
		Player player2 = null;
		Roshambo choice = null;
		Roshambo choice2 = null;
		System.out.print("Who would you like to play against, Ash, Brock, or Misty? (a/b/m): ");
		String opponent = scan.nextLine();
		//String opponent = getOppo(scan); tried to inherit method didn't work
		if (opponent.equalsIgnoreCase("b")||opponent.equalsIgnoreCase("brock")){
			player2 = new Rocker("Brock");
		}else if (opponent.equalsIgnoreCase("m")||opponent.equalsIgnoreCase("misty")){
			player2 = new AiRandom("Misty");
		}else if (opponent.equalsIgnoreCase("a")||opponent.equalsIgnoreCase("ash")){
			player2 = new User("Ash");
		}
		choice2 = player2.generateRoshambo();
		boolean cont = true;
		while(cont){
			System.out.println("Rock, paper or scissors? (R/P/S): ");
			String answer = scan.nextLine().toLowerCase();
			switch (answer) {
			case "r":
				choice = gamer.setValue(Roshambo.ROCK);
				break;
			case "p":
				choice = gamer.setValue(Roshambo.PAPER);
				break;
			case "s":
				choice = gamer.setValue(Roshambo.SCISSORS);
				break;
			default:
				break;
			}
			//Calculate result by comparing Roshambo values
			if (choice.compareTo(choice2) == 0 ){
				System.out.println(name + ": " + gamer.getValue());
				System.out.println(player2.getName() + ": " + player2.getValue());
				System.out.println("Draw!");
			}
			else if (choice.compareTo(choice2) == 1){
				System.out.println(name + ": " + gamer.getValue());
				System.out.println(player2.getName() + ": " + player2.getValue());
				System.out.println(name + "wins!");
			}
			else if (choice == Roshambo.SCISSORS && choice2 == Roshambo.PAPER){
				System.out.println(name + ": " + gamer.getValue());
				System.out.println(player2.getName() + ": " + player2.getValue());
				System.out.println(name + " wins!");
			}
			else {
				System.out.println(name + ": " + gamer.getValue());
				System.out.println(player2.getName() + ": " + player2.getValue());
				System.out.println(name + " lost.");
			}
		System.out.print("Play again? (y/n): ");
		String again = scan.nextLine();
		if (again.equalsIgnoreCase("n")||again.equalsIgnoreCase("no"))
			cont = false;
		}
		scan.close();
	}



}