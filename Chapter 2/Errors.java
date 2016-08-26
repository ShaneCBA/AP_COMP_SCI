import java.util.*;

public class Errors {
	public static void main(String[] args) {
		String name;
		int number,numSqr;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your name, please: ");
		name = scan.next();
		System.out.print("What is your favorite number: ");
		number = scan.nextInt();
		numSqr = number * number;
		System.out.println(name + ", the square root of your favorite ("+number+") number is " + numSqr);
	}
}