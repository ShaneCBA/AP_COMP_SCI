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
		Random rand = new Random();
		String [] pRanks = {"ace","two","three","four","five","six","seven","eight","nine","ten","jester","queen","king"};

		String [] ranks;
		String [] suits;
		int[] pointVals;

		ranks = new String[]{"jack","queen","king"};
		suits = new String[]{"blue","red","blue"};
		pointVals = new int[]{11,12,13};
		Deck d1 = new Deck(ranks, suits, pointVals);

		ranks = new String[]{"ace","queen","four"};
		suits = new String[]{"red","blue","blue"};
		pointVals = new int[]{1,12,4};
		Deck d2 = new Deck(ranks, suits, pointVals);

		ranks = new String[]{"king","jester","eight"};
		suits = new String[]{"blue","red","red"};
		pointVals = new int[]{13,11,8};
		Deck d3 = new Deck(ranks, suits, pointVals);


		ranks = new String[53];
		suits = new String[53];
		pointVals = new int[53];

		for (int i = 0; i < 53; i++){
			pointVals[i] = rand.nextInt(pRanks.length);
			ranks[i] = pRanks[pointVals[i]];
			suits[i] = (rand.nextInt(2)==0)?"blue":"red";
		}

		Deck blackjack = new Deck(ranks, suits, pointVals);
	}
}
