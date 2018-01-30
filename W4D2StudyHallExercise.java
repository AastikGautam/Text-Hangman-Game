package w4d2StudyHall;

import java.util.Scanner;

public class W4D2StudyHallExercise {
	/* Replace this line with a proper header which includes your name */
	

	private static String usersName;
	private static String inputFromUser;
	private static char menuCharacter;

	public static void main(String args[]) {
		/* Initialize the Text Hangman game */
		Scanner keyboard = new Scanner(System.in);
		

		/* Welcome the user and request the user to enter a name */
		System.out.println("Welcome!");
		System.out.println("");
		
		/* Read in the user's name */
		System.out.println("Please Enter Your Name followed by a return");
		usersName = keyboard.nextLine();
				
		while (true) {
			/* Display menu */
        System.out.println(usersName+",Please enter a command letter followed by a return");
        System.out.println("p -> Play The Game");
        System.out.println("s -> View Statistics");
        System.out.println("q -> Quit");
        
			/* Read the menu character */
        inputFromUser=keyboard.next();
        
			/* Play the game? */
        if(inputFromUser.equals("p")) {
        	System.out.println("Play the game command recognised");
        }

			/* View the statistics? */
        else if(inputFromUser.equals("s")) {
        	System.out.println("View the statistics command recognised");
        }

			/* Quit the game? */
        else if(inputFromUser.equals("q")) {
        	System.out.println("Quit the game command recognised");
        	System.out.println("Thank You For Playing,"+usersName);
        }

			/* Display error (if command is none of the above) */
        else {
        	System.out.println("***Error***");
        	System.out.println("Invalid item entered. It must be p,q or s");
        	System.out.println("The input found was:"+inputFromUser);
        }
			
		}
	}
}
