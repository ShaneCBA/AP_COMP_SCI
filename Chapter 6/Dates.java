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
	boolean monthValid = true, yearValid = true, dayValid = true;  //true if input from user is valid

	Scanner scan = new Scanner (System.in);

	//Get integer month, day, and year from user
	System.out.print("Month: ");month = scan.nextInt();
	System.out.print("Day: ");day = scan.nextInt();
	System.out.print("Year: ");year = scan.nextInt();

	yearValid = (Math.abs(year) == year);

	switch (month) {
		case 1:
			dayValid = (day <= 31);
		break;

		case 2:
			dayValid =  ((((year%4==0)&&(year%100!=0)||(year%400==0))&&(day <= 29))||(day <= 28));
		break;

		case 3:
			dayValid = (day <= 31);
		break;

		case 4:
			dayValid = (day <= 30);
		break;

		case 5:
			dayValid = (day <= 31);
		break;

		case 6:
			dayValid = (day <= 30);
		break;

		case 7:
			dayValid = (day <= 31);
		break;

		case 8:
			dayValid = (day <= 31);
		break;

		case 9:
			dayValid = (day <= 30);
		break;

		case 10:
			dayValid = (day <= 31);
		break;

		case 11:
			dayValid = (day <= 30);
		break;

		case 12:
			dayValid = (day <= 31);
		break;

		default:
			monthValid = false;
		break;
	}

	if (monthValid && dayValid && yearValid) {
		System.out.println("Date Valid");
		if (month == 2 && (((year%4==0)&&(year%100!=0)||(year%400==0))&&(day <= 29))) System.out.println("It's a leap year");
	}
	else {
		System.out.println("Date Invalid");
	}

    }
}


