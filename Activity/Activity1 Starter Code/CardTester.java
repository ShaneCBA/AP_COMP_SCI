/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1,c2,c3;
		c1 = new Card("Jack","Red",10);
		c2 = new Card("Queen","Black",11);
		c3 = new Card("Jack","Red",10);

		System.out.println("C1 >> "+c1);
		System.out.println("C2 >> "+c2);
		System.out.println("C3 >> "+c3);
		System.out.println("");
		System.out.println("");


		System.out.println("c1 "+((c1.matches(c2))?" matches ":" does not match ")+" c2");
		System.out.println("c1 "+((c1.matches(c3))?" matches ":" does not match ")+" c3");
		System.out.println("c2 "+((c1.matches(c3))?" matches ":" does not match ")+" c3");
	}
}
