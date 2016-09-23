// ****************************************************************
// Dates.java
//
// Determine whether a 2nd-millenium date entered by the user
// is valid
// ****************************************************************
import java.util.Scanner;

public class Dates
{
    public static void main(String[] args)
    {
	int month, day, year;   //date read in from user
	int daysInMonth;        //number of days in month read in
	boolean monthValid, yearValid, dayValid;  //true if input from user is valid
	boolean leapYear;  //true if user's year is a leap year

	Scanner scan = new Scanner (System.in);

	//Get integer month, day, and year from user
	System.out.print("Month: ");month = scan.nextInt();
	System.out.print("Day: ");day = scan.nextInt();
	System.out.print("Year: ");year = scan.nextInt();

	//Check to see if month is valid


	//Check to see if year is valid


	//Determine whether it's a leap year


	//Determine number of days in month


	//Use number of days in month to check to see if day is valid


	//Determine whether date is valid and print appropriate message

    }
}


