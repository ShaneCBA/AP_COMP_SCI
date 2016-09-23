import java.util.Scanner;
import java.text.*;

public class Salary {
	public static void main(String[] args){
		double currentSalary;
		double raise = 0;
		double newSalary;
		int rating;

		Scanner scan = new Scanner(System.in);

		DecimalFormat fmt = new DecimalFormat("0.00");
		NumberFormat money = NumberFormat.getCurrencyInstance();

		System.out.print("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		System.out.print("Enter performance rating: ");
		rating = scan.nextInt();

		switch(rating){
			case 1: raise = currentSalary*0.06; break;
			case 2: raise = currentSalary*0.04; break;
			case 3: raise = currentSalary*0.015; break;
		}
		newSalary = raise+currentSalary;
		System.out.println("Amount of your raise: " + money.format(raise));
		System.out.println("Your new salary: " + money.format(newSalary));

	}
}