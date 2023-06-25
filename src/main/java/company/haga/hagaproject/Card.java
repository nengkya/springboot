/*
Clubs 	 = 0
Diamonds = 1
Hearts 	 = 2
Spades   = 3
*/

public class Card {

	private int rank;
	private int suit;

	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	String[] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
		 "Jack", "Queen", "King"};

	Card threeOfClubs = new Card(3, 0);

	public static void main(String[] arguments) {
		System.out.println("threeOfClubs" + 1);
	}

}
