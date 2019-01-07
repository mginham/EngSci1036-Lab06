package mginham_lab06;

public class mginham_lab06_q3 {

	// Methods //
	public static void displayStudentInfo() {
		// Display information & question to user
		System.out.println("********************************"
					   + "\nES1036: Lab 06 Q3"
					   + "\n        Deck of Cards"
					   + "\nDate: November 14, 2018"
					   + "\nName: Megan Ginham"
					   + "\nStudent Number: 251029381"
					   + "\nMission: Write a simple deck of"
					   + "\n         cards program that"
					   + "\n         creates a deck of cards"
					   + "\n         and prints them"
					   + "\n********************************");
	} // end displayStudentInfo
	
	// MAIN //
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.printCards();
	} // end main

} // end class
