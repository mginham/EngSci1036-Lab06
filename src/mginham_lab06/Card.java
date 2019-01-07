package mginham_lab06;

public class Card {
	// Declare global variables //
	private int denomination;
	private char suit;
	
	// Constructor //
	public Card(int denomination, char suit) {
		this.denomination = denomination;
		this.suit = suit;
	} // end constructor
	
	// Methods //
	public String face() {
		// Declare and initialize variables
		String cardFace = "";
		
		// Combine denomination and suit into cardFace
		if(denomination > 1 && denomination < 11) {
			cardFace = Integer.toString(denomination) + suit;
		}
		else {
			// Convert denomination 1, 11, 12, 13 to A, J, Q, K
			switch (denomination) {
				case 1:
					cardFace = "A" + suit;
					break;
				case 11:
					cardFace = "J" + suit;
					break;
				case 12:
					cardFace = "Q" + suit;
					break;
				case 13:
					cardFace = "K" + suit;
					break;
			}
		}
		
		return cardFace;
	} // end face

	// Getters and Setters //
	protected void setDenomination(int denomination) {
		this.denomination = denomination;
	} // end setDenomination
	protected int getDenomination() {
		return denomination;
	} // end getDenomination
	protected void setSuit(char suit) {
		this.suit = suit;
	} // end setSuit
	protected char getSuit() {
		return suit;
	} // end getSuit
	
} // end class
