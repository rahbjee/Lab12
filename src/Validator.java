import java.util.Scanner;

public interface Validator
{
    public static String getOppo(Scanner scan){
        System.out.print( "Who would you like to play against, Ash, Brock, or Misty? (a/b/m):");
    	String s = scan.nextLine();
    	while(!(s.equalsIgnoreCase("a") || s.equalsIgnoreCase("b") || s.equalsIgnoreCase("m"))){
    		System.out.print("Invalid entry.  Please enter one of the suggested initials (a/b/m)");
    		s = scan.nextLine();
    	}
        return s;
    }
    
    public static String getContCom(Scanner scan, String prompt)
    {
    	System.out.print(prompt);
    	String s = scan.nextLine();  // read user entry
    	return s;
    }

    
    
}