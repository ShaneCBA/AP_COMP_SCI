import java.util.*;
import java.text.*;

public class Circle {
	public static final double PI = 3.14159265359;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*int radius = 10;
		double area = PI * radius * radius;

		System.out.println("The area of a circle with radius "+radius+" is " + area);

		radius = 2.0;//This is a float, not int
		double area = PI * radius * radius;

		System.out.println("The area of a circle with radius "+radius+" is " + area);*/

		DecimalFormat fmt = new DecimalFormat("0.####");

		getAreaPrint(10);
		getAreaPrint(2.0);
		getCircumPrint(10);
		getCircumPrint(2.0);

		System.out.println("[Press Enter to continue]");
		try {
			System.in.read();
		}
		catch (Exception e) {
		}

		System.out.println("\n\n");

		System.out.println("What happens when to the circumference and area when the radius doubles? :");
		System.out.println("");
		System.out.println("Radius: 5");
		System.out.println("\tArea:"+getArea(5));
		System.out.println("\tCircumference:"+getCircum(5));

		System.out.println("\n");

		System.out.println("Radius: 10");
		System.out.println("\tArea:"+getArea(10));
		System.out.println("\tCircumference:"+getCircum(10));

		System.out.println("\n");

		System.out.println("[Circle: radius 10]/[Circle: radius 5]");
		System.out.println("\tAreas Divided:"+(getArea(10)/getArea(5)));
		System.out.println("\tCircumferences Divided:"+(getCircum(10)/getCircum(5)));

		System.out.println("\n");

		System.out.println("[Press Enter to continue]");
		try {
			System.in.read();
		}
		catch (Exception e) {}

		System.out.print("Input 1st radius: ");
		int radius1 = scan.nextInt();
		System.out.print("\nInput 2nd radius: ");
		int radius2 = scan.nextInt();
		int radius3 = radius2*2;


		System.out.print("\n\n\n\n\n");


		System.out.println("Radius 1: "+radius1);
		System.out.println("\tArea: "+fmt.format(getArea(radius1)));
		System.out.println("\tCircumference: "+fmt.format(getCircum(radius1)));

		System.out.println("\nRadius 2: "+radius2);
		System.out.println("\tArea: "+fmt.format(getArea(radius2)));
		System.out.println("\tCircumference: "+fmt.format(getCircum(radius2)));


		System.out.println("\nRadius 2 Doubled [Radius 3]: "+radius3);
		System.out.println("\tArea: "+fmt.format(getArea(radius3)));
		System.out.println("\tCircumference: "+fmt.format(getCircum(radius3)));

		System.out.println("[Circle: Radius 3 | "+radius3+"]/[Circle: Radius 2 | "+radius2+"]");
		System.out.println("\n\tArea3/Area2: "+fmt.format(getArea(radius3)/getArea(radius2)));
		System.out.println("\tCircumference3/Circumference2: "+fmt.format(getCircum(radius3)/getCircum(radius2)));

	}
	public static double getArea(double radius) {
		double area = PI * radius * radius;

		return area;
	}
	public static double getCircum(double radius) {
		double circumference = 2 * PI * radius;

		return circumference;
	}
	public static double getAreaPrint(double radius) {
		double area = PI * radius * radius;

		System.out.println("The area of a circle with radius "+radius+" is " + area);

		return area;
	}
	public static double getCircumPrint(double radius) {
		double circumference = 2 * PI * radius;

		System.out.println("The circumference of a circle with radius "+radius+" is " + circumference);

		return circumference;
	}
}