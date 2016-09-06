import java.util.*;
import java.text.*;

public class PlayCards {
	public enum Rank {ace,two,three,four,five,six,seven,eight,nine,ten,jack,queen,king};
	public static void main(String[] args) {
		Rank highCard, faceCard, card1, card2;
		int card1Val, card2Val;


		highCard = Rank.ace;
		faceCard = Rank.jack;
		card1 = Rank.four;card1Val = 4;
		card2 = Rank.six;card2Val = 6;

		System.out.println("A blackjack hand: ace and "+faceCard);

		System.out.println("A two card hand: "+card1+" and "+card2);
		System.out.println("Hand value: "+(card1Val+card2Val));

	}
}
