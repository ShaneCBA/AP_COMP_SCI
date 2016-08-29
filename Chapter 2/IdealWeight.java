import java.util.*;
import java.text.*;

public class IdealWeight {
	public static final int IDEALFEMALEWEIGTH = 100;//5 pounds per inch where height is more than 5 ft
	public static final int IDEALMALEWEIGTH = 106;  //6 pounds per inch where hieght is more than 5 ft
	public static void main(String[] args){
		int heightFt;
		int heightIn;
		double idealWeight = 0;
		char gender;

		Scanner scan = new Scanner(System.in);

		DecimalFormat fmt = new DecimalFormat("0.##");

		println("Please input height in feet + inches: ");
		print("\tHeight in Feet: ");heightFt = scan.nextInt();
		print("\tInches remaining: ");heightIn = scan.nextInt();
		print("\tGender [M/F]: ");gender = scan.next().charAt(0);

		if (Character.toLowerCase(gender) == 'm')
			idealWeight = calculateMale((heightFt*12)+heightIn);
		else if (Character.toLowerCase(gender) == 'f')
			idealWeight = calculateFemale((heightFt*12)+heightIn);
		System.out.println("Ideal Weight: " + fmt.format(idealWeight));

	}
	public static double calculateFemale(double height){
		if (height > 60)
			return IDEALFEMALEWEIGTH + (height-60)*5;
		return IDEALFEMALEWEIGTH;
	}
	public static double calculateMale(double height){
		if (height > 60)
			return IDEALMALEWEIGTH + (height-60)*6;
		return IDEALMALEWEIGTH;
	}
	public static void println(String message){
		System.out.println(message);
	}
	public static void print(String message){
		System.out.print(message);
	}
}