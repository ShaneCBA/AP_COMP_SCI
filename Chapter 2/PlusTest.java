public class PlusTest {
	public static void main(String[] args){
		System.out.println("This is a long string that is the "+
		"concatination of two shorter strings.");
		System.out.println("The first computer was invented about " + 55 +
		" years ago.");
		System.out.println("8 plus 5 is " + 8 + 5);//8 plus 5 is 85 -- It will concatinate 8 + 5 as a string if not specified
		System.out.println("8 plus 5 is " + (8 + 5));//8 plus 5 is 13 -- Is specified correctly as an equation
		System.out.println(8 + 5 + " equals 8 plus 5");//13 equals 8 plus 5 -- A string has not been introduced yet, so it runs this as an equation
		System.out.println("The robins plus "+13+" canaries is "+(13+10)+" birds.");
		/*
		8 plus 5 is 85
		8 plus 5 is 13
		13 equals 8 plus 5
		*/
	}
}