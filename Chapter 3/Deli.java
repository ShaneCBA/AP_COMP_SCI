// **********************************************************
// DeliFormat.java
//
// Computes the price of a deli item given the weight
// (in ounces) and price per pound -- prints a label,
// nicely formatted, for the item.
//
// **********************************************************

import java.util.*;
import java.text.*;

public class Deli
{
    // ---------------------------------------------------
    //  main reads in the price per pound of a deli item
    //  and number of ounces of a deli item then computes
    //  the total price and prints a "label" for the item
    //  --------------------------------------------------

    public static void main (String[] args)
    {

		final double OUNCES_PER_POUND = 16.0;

		double pricePerPound;  // price per pound
		double weightOunces;   // weight in ounces
		double weight;         // weight in pounds
		double totalPrice;     // total price for the item

		Scanner scan = new Scanner (System.in);

		// Declare money as a NumberFormat object and use the
		// getCurrencyInstance method to assign it a value

		//Currency money = Currency.getInstance();

		NumberFormat  money = NumberFormat.getCurrencyInstance();


		// Declare fmt as a DecimalFormat object and instantiate
		// it using the pattern "0.##" it will format numbers with
		// at least one digit to the left of the decimal and round
		// the fractional part to two digits.

		DecimalFormat fmt = new DecimalFormat("0.##");

		// prompt the user and read in each input
		System.out.println ("Welcome to the CS Deli!!\n ");

		System.out.print ("Enter the price per pound of your item: ");
		pricePerPound = scan.nextDouble();

		System.out.print ("Enter the weight (ounces): ");
		weightOunces = scan.nextDouble();

		// Convert ounces to pounds and compute the total price
		weight = weightOunces / OUNCES_PER_POUND;
		totalPrice = pricePerPound * weight;

		// Print the label using the formatting objects
		// fmt for the weight in pounds and money for the prices
		System.out.println("\n\n\n*****CSDeli*****\n");
		System.out.println("Unit Price: "+money.format(pricePerPound)+" per pound");
		System.out.println("Weight: "+fmt.format(weight)+" pounds");
		System.out.println("\nTOTAL: "+money.format(totalPrice)+" pounds\n\n");

    }
}
