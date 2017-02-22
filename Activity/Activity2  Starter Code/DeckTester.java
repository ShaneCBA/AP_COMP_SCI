import java.util.*;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		string [] pRanks = {"ace","two","three","four","five","six","seven","eight","nine","ten","jester","queen","king"}

		String [] ranks;
		String [] suits;
		int[] pointVals;

		ranks = {"jack","queen","king"};
		suits = {"blue","red","blue"}
		pointVals = {11,12,13};
		Deck d1 = new Deck(ranks, suits, pointVals);

		ranks = {"ace","queen","four"};
		suits = {"red","blue","blue"}
		pointVals = {1,12,4};
		Deck d2 = new Deck(ranks, suits, pointVals);

		ranks = {"king","jester","eight"};
		suits = {"blue","red","red"}
		pointVals = {13,11,8};
		Deck d3 = new Deck(ranks, suits, pointVals);


		ranks = new String[53];
		suits = new String[53];
		pointVals = new String[53];

		for (int i = 0; i < 53; i++){
			pointVals[i] = Random.nextInt(pRanks.length);
			ranks[i] = pRanks[pointVals[i]];
			suits[i] = (Random.nextInt(2)==0)?"blue":"red";
		}

		Deck blackjack = new Deck(ranks, suits, pointVals);
	}
}
