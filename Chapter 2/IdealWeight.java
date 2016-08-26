import java.util.*;
import java.text.*;

public class IdealWeight {
	public final int IDEALFEMALEWEIGTH = 100;//5 pounds per inch where height is more than 5 ft
	public final int IDEALMALEWEIGTH = 106;  //6 pounds per inch where hieght is more than 5 ft
	public static void main(String[] args){
		int heightFt;
		int heightIn;
		double idealWeight;

		Scanner scan = new Scanner(System.in);

		println("Please input height in feet + inches: ");
		print("\tHeight in Feet: ");heightFt = scan.nextInt();
		print("\tInches remaining: ");heightIn = scan.nextInt();


	}
	public static double calculateFemale(double height){
		return 0;
	}
	public static double calculateMale(double height){
		return 0;
	}
	public static void println(String message){
		System.out.println(message);
	}
	public static void print(String message){
		System.out.print(message);
	}
}