import java.util.Scanner;
import java.text.*;

public class Paint {
	public static void main(String[] args){
		final int COVERAGE = 350;
		int length, width, height, doors, windows;
		double totalSqFt, paintNeeded;

		Scanner scan = new Scanner(System.in);

		DecimalFormat fmt = new DecimalFormat("0.#");

		System.out.println("Please input:");
		System.out.print("\tLength: ");length = scan.nextInt();
		System.out.print("\n\tWidth: ");width = scan.nextInt();
		System.out.print("\n\tHeight: ");height = scan.nextInt();
		System.out.print("\n\tNumber of Doors: ");doors = scan.nextInt();
		System.out.print("\n\tNumber of Windows: ");windows = scan.nextInt();

		totalSqFt = 2*(length*width)+2*(length*height)+2*(width*height)-doors*20-windows*15;

		paintNeeded = totalSqFt/COVERAGE;

		System.out.println("\n\nResults");
		System.out.println("\tLength: "+length);
		System.out.println("\tWidth: "+width);
		System.out.println("\tHeight: "+height);
		System.out.println("\n\tTotal Square Feet: "+fmt.format(totalSqFt)+" ft.^3");
		System.out.println("\tPaint Needed: "+fmt.format(paintNeeded)+" gallons");
	}
}