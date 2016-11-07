import java.util.*;

public class Comparisons {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input INT 1: ");
		int int1 = scan.nextInt();
		System.out.print("Input INT 2: ");
		int int2 = scan.nextInt();
		System.out.print("Input INT 3: ");
		int int3 = scan.nextInt();

		Compare3.largest(int1, int2, int3);
	}
}