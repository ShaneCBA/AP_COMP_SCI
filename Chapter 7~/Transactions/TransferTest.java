import java.util.*;

public class TransferTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Account acct1 = new Account(1000, "Sue", 123);
		Account acct2 = new Account(1000, "Joe", 456);

		System.out.print("Would you like to transfer to acct1 or acct2? : ");
		String input = scan.next();
		System.out.print("Amount? : ");
		double amnt = scan.nextDouble();

		if (input.equals("acct1")){
			acct1.transfer(acct2,amnt);
		}
		else if (input.equals("acct2")){
			acct2.transfer(acct1,amnt);
		}
		else {
		}
		acct1.printSummary();

		System.out.println();
		acct2.printSummary();
	}
}