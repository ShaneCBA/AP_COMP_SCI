import java.util.*;

public class IntegerClassTesting {
	public static void main(String[] args) {
		Integer intTest;
		Integer parsedInt;

		String decNum1="";
		String decNum2="";

		Scanner scan = new Scanner(System.in);

		System.out.print("Input an Integer: ");intTest = scan.nextInt();
		System.out.println("Maximum Value: "+intTest.MAX_VALUE);
		System.out.println("Minimum Value: "+intTest.MIN_VALUE);
		System.out.println("Size: "+intTest.SIZE);
		System.out.println("Binary: "+Integer.toBinaryString(intTest));
		System.out.println("Hex: "+Integer.toHexString(intTest));
		System.out.println("Octal: "+Integer.toOctalString(intTest));

		System.out.print("\nInput 2 Decimal Number [1]: ");decNum1 += scan.next();
		System.out.print("Input 2 Decimal Number [2]: ");decNum2 += scan.next();

		System.out.println("Sum: "+(Integer.parseInt(decNum1)+Integer.parseInt(decNum2)));




	}
}