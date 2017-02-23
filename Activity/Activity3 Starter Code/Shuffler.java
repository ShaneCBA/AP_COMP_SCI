import java.util.*;
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;

	/**
	 * The number of values to shuffle.
	 */
	private static final int VALUE_COUNT = 4;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = new int[VALUE_COUNT];
		for (int i = 0; i < values1.length; i++) {
			values1[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = new int[VALUE_COUNT];
		for (int i = 0; i < values2.length; i++) {
			values2[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("PERMUTABLE: ");
		System.out.println(arePermutations(new int[]{1,2,2,3},new int[]{2,1,3,2})?"Yes":"No");
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		int[] shuffled = new int[values.length];
		/*int i = 0;
		while (k < values.length){
			if (){}
			i+=2;
		}*/

		int k = 0;
		for (int i = 0; i < values.length/2; i++){
			shuffled[k]=values[i];
			k+=2;
		}

		k = 1;
		for (int i = values.length/2+1; i < values.length; i++){
			shuffled[k]=values[i];
			k+=2;
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		int k = values.length;
		Random rand = new Random();
		for (int i = k-1; i >= 0; i--){
			int r = rand.nextInt(k);
			int t = values[i];
			values[i] = values[r];
			values[r] = values[i];
		}
	}

	public static String flip(){
		Random rand = new Random();
		return (rand.nextInt(3)==2)?"TAILS":"HEADS";
	}

	public static boolean arePermutations(int[] a1, int[] a2){
		//List<Integer> counts = new ArrayList<Integer>(Collections.nCopies(a1.length, 0));
		Map<Integer,Integer> counts = new HashMap<Integer,Integer>();
		for (int i = 0; i < a1.length; i++){
			if (counts.get(a1[i])==null){
				counts.put(a1[i],0);
			}
			counts.put(a1[i],counts.get(a1[i])+1);
		}
		for (int i = 0; i < a2.length; i++){
			if (counts.get(a2[i])==null){
				return false;
			}
			counts.put(a2[i],counts.get(a2[i])-1);
		}
		for (Map.Entry<Integer, Integer> entry : counts.entrySet()){
			System.out.println(entry.getValue());
			if (entry.getValue()!=0)return false;
		}
		return true;
	}
}
