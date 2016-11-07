import java.util.*;

public class Comparisons {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input INT 1: ");
		Integer int1 = scan.nextInt();
		System.out.print("Input INT 2: ");
		Integer int2 = scan.nextInt();
		System.out.print("Input INT 3: ");
		Integer int3 = scan.nextInt();

		System.out.println(Compare3.largest(int1, int2, int3));

		System.out.print("Input STRING 1: ");
		String s1 = scan.next();
		System.out.print("Input STRING 2: ");
		String s2 = scan.next();
		System.out.print("Input STRING 3: ");
		String s3 = scan.next();

		System.out.println(Compare3.largest(s1, s2, s3));
	}
}