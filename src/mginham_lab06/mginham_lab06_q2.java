package mginham_lab06;

import java.util.Scanner;

public class mginham_lab06_q2 {

	// Declare global variables //
	public static Scanner input = new Scanner(System.in);
	
	// Methods //
	public static void displayStudentInfo() {
		// Display information & question to user
		System.out.println("********************************"
					   + "\nES1036: Lab 06 Q2"
					   + "\n        Grade Calculator Using"
					   + "\n		Arrays"
					   + "\nDate: November 14, 2018"
					   + "\nName: Megan Ginham"
					   + "\nStudent Number: 251029381"
					   + "\nMission: Calculate a weighted"
					   + "\n         grade of a number of"
					   + "\n         assignments"
					   + "\n********************************");
	} // end displayStudentInfo
	public static int getNumOfAssignments() {
		// Declare and initialize variables
		int numOfAssignments = 0;
		boolean validInput = false;
		
		do { // Loop until input is valid
			validInput = true; // Assume input to be valid initially
			
			try {
				// Prompt user for number of assignments
				System.out.println("How many assignments would you like to compute?");
					numOfAssignments = input.nextInt();
			}
			catch (Exception e) { // If invalid input, clear buffer (remove existing input)
				System.out.println("Invalid input.");
				input.nextLine();
				validInput = false;
			}
			
			if(validInput && numOfAssignments < 0) { // Validate that the input is a positive integer
				System.out.println("Invalid input. Please enter a positive integer.");
				validInput = false;
			}
		} while(!validInput);
		
		return numOfAssignments;
	} // end getNumOfAssignments
	public static double getValidatedDouble(String numType, int iteration, double minValue, double maxValue) {
		// Declare and initialize variables
		double userInput = 0;
		boolean validInput = false;
		
		do { // Loop until input is valid
			validInput = true; // Assume input is valid initially
			
			try {
				System.out.println("Input " + numType + " " + iteration + " (" + minValue + "-" + maxValue + "):");
				userInput = input.nextDouble();
			}
			catch(Exception e) { // If invalid input, clear buffer (remove existing input)
				System.out.println("Invalid format. Try again:");
				input.nextLine();
				validInput = false;
			}
			
			if(validInput && (userInput < minValue || userInput > maxValue)) { // Validate that the input is within the range
				System.out.println("Incorrect range. Try again:");
				validInput = false;
			}
		} while(!validInput);
		
		return userInput;
	} // end getValidatedDouble
	public static double computeFinalGrade(int numOfAssignments) {
		// Declare and initialize variables
		double finalGrade = 0, weightSum = 0;
		double[] grade = new double[numOfAssignments];
		double[] weight = new double[numOfAssignments];
		
		do { // Loop until weightSum = 1
			weightSum = 0;
			
			// Prompt user for grades and weights
			for(int i = 0; i < numOfAssignments; i++) {
				grade[i] = getValidatedDouble("grade", i+1, 0, 100);
				weight[i] = getValidatedDouble("weight", i+1, 0.0, 1.0);
			}
			
			// Validate that weight sum = 1
			for(int i = 0; i < numOfAssignments; i++) {
				weightSum += weight[i];
			}
			if(weightSum != 1)
				System.out.println("The sum of grade weights must equal 1. Please try again.");
		} while(weightSum != 1);
		
		// Calculate final grade
		for(int i = 0; i < numOfAssignments; i++) {
			finalGrade += (grade[i]*weight[i]);
		}
		
		return finalGrade;
	} // end computeFinalGrade
	
	// MAIN //
	public static void main(String[] args) {
		// Declare and initialize variables
		int numOfAssignments = -1;
		double finalGrade = -1;
		
		numOfAssignments = getNumOfAssignments();
		
		System.out.println(); // cosmetic
		
		finalGrade = computeFinalGrade(numOfAssignments);
		
		System.out.println("\nThe course grade is: " + finalGrade);
	} // end main

} // end class
