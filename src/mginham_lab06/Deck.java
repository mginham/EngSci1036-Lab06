package mginham_lab06;

public class Deck {
	// Declare global variables //
	public Card cards[] = new Card[52];
	private char suits[] = new char[4];
	private int denominations = 13;
	
	// Constructor //
	public Deck() {
		int n = 0; // counter
		
		suits[0] = 'S';
		suits[1] = 'D';
		suits[2] = 'C';
		suits[3] = 'H';
		
		// Populate the member cards array w/ a deck of 52 cards organized by 13 spades, 13 diamonds, 13 clubs, and 13 hearts
		for(int i = 0; i < 4; i++) { // Cycle through suits
			for(int j = 1; j <= denominations; j++) { // Cycle through denominations
				cards[n++] = new Card(j,suits[i]);
			}
		}
	} // end constructor
	
	// Methods //
	public void printCards() {
		int n = 0; // counter
		
		// Print deck
		for(int i = 0; i < 4; i++) {
			for(int j = 1; j <= 13; j++) {
				System.out.print(cards[n++].face());
				
				if(j < 13)
					System.out.print(", ");
			}
			System.out.println(); // Separate lines by suit
		}
	} // end printCards
	
} // end class
