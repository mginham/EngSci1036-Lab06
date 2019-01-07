package mginham_lab06;

import java.util.Scanner;

public class mginham_lab06_q1 {
	
	// Declare global variables //
	public static Scanner input = new Scanner(System.in);
	
	// Static Classes //
	public static class ConsoleInput {
		// Methods //
		public static int getValidatedInteger(int minValue, int maxValue) {
			// Declare and initialize variables
			int userInput = 0;
			boolean validInput = false;
			
			do { // Loop until input is valid
				validInput = true; // Assume input is valid initially
				
				try {
					// Prompt user for input
					System.out.print("Please enter an integer between " + minValue + " and " + maxValue + ":\n  ");
						userInput = input.nextInt();
				}
				catch(Exception e) { // If invalid input, clear buffer (remove existing input)
					System.out.print("Invalid format. ");
					input.nextLine();
					validInput = false;
				}
				finally {
					if(validInput && (userInput < minValue || userInput > maxValue)) { // Validate that the input is within the range
						System.out.print("Incorrect range. ");
						validInput = false;
					}
				}
			} while(!validInput);
			
			return userInput;
		} // end getValidatedInteger
		public static double getValidatedDouble(double minValue, double maxValue) {
			// Declare and initialize variables
			double userInput = 0;
			boolean validInput = false;
			
			do { // Loop until input is valid
				validInput = true; // Assume input is valid initially
				
				try {
					// Prompt user for input
					System.out.print("Please enter a double between " + minValue + " and " + maxValue + ":\n  ");
						userInput = input.nextDouble();
				}
				catch(Exception e) { // If invalid input, clear buffer (remove existing input)
					System.out.print("Invalid format. ");
					input.nextLine();
					validInput = false;
				}
				finally {
					if(validInput && (userInput < minValue || userInput > maxValue)) { // Validate that the input is within the range
						System.out.print("Incorrect range. ");
						validInput = false;
					}
				}
			} while(!validInput);
			
			return userInput;
		} // end getValidatedDouble
		public static char getValidatedChar(char minChar, char maxChar) {
			// Declare and initialize variables
			String userInput = "";
			char userChar = 0;
			boolean validInput = false;
			
			do { // Loop until input is valid
				validInput = true; // Assume input is valid initially
			
				// Prompt user for input
				System.out.print("Please enter a character between " + minChar + " and " + maxChar + ":\n  ");
					userInput = input.next();
				
				if(userInput.length() != 1) { // If invalid input, clear buffer (remove existing input)
					System.out.print("Incorrect format. ");
					validInput = false;
					input.nextLine();
				}
				else {
					userChar = userInput.charAt(0);
					
					if(userChar < minChar || userChar > maxChar) { // Validate that the input is within the range; if invalid input, clear buffer (remove existing input)
						System.out.print("Incorrect range. ");
						validInput = false;
						input.nextLine();
					}
				}
			} while(!validInput);
			
			return userChar;
		} // end getValidatedChar
	} // end ConsoleInput
	
	// Methods //
	public static void displayStudentInfo() {
		// Display information & question to user
		System.out.println("********************************"
					   + "\nES1036: Lab 06 Q1"
					   + "\n        Input Validation Class"
					   + "\nDate: November 14, 2018"
					   + "\nName: Megan Ginham"
					   + "\nStudent Number: 251029381"
					   + "\nMission: Create a static Java"
					   + "\n         class that is"
					   + "\n         responsible for"
					   + "\n         validating inputs taken"
					   + "\n		 from the user using the"
					   + "\n		 scanner"
					   + "\n********************************");
	} // end displayStudentInfo
	
	// MAIN //
	public static void main(String[] args) {
		ConsoleInput.getValidatedInteger(4, 19);
		ConsoleInput.getValidatedDouble(-34.6, 85.1);
		ConsoleInput.getValidatedChar('a', 'f');
		
		input.close();
	} // end main

} // end class
