// **************************************************************
//   Temps.java
//
//   This program reads in a sequence of hourly temperature
//   readings (beginning with midnight) and prints the maximum
//   temperature (along with the hour, on a 24-hour clock, it
//   occurred) and the minimum temperature (along with the hour
//   it occurred).
// **************************************************************

import java.util.*;

public class Temps
{
    public static void main (String[] args)
    {
	final int HOURS_PER_DAY = 24;

	int maximumTemperature=-935412312, minimumTemperature=935412312;

	int maxTime=0, minTime=0;

	Scanner scan = new Scanner (System.in);

	int temp;              // a temperature reading


	// print program heading


	for (int hour = 0; hour < HOURS_PER_DAY; hour++)
	{
	    System.out.print ("Enter the temperature reading at " + hour +
				" hours: ");
	    temp = scan.nextInt();

		if (minimumTemperature == -935412312) {minimumTemperature = temp;minTime = hour;}
		if (maximumTemperature == 935412312) {maximumTemperature = temp;maxTime = hour;}

		maximumTemperature = (temp>maximumTemperature) ? temp : maximumTemperature;
		minimumTemperature = (temp<minimumTemperature) ? temp : minimumTemperature;

		maxTime = (temp>maximumTemperature) ? hour : maxTime;
		minTime = (temp>minimumTemperature) ? hour : minTime;

	}

	// Print the results
	System.out.println("Max Tempt at Hour "+maxTime+":"+maximumTemperature);
	System.out.println("Min Tempt at Hour "+minTime+":"+minimumTemperature);
    }
}
