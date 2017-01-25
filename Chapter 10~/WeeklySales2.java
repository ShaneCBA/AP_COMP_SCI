// *************************************************************
//    WeeklySales2.java
//
//    Reads in the sales data for the sales staff, then sorts
//    the sales staff in descending order by sales.
// ************************************************************

import java.util.Scanner;

public class WeeklySales2
{
    public static void main(String[] args)
    {
	int numSellers;
	String first, last;  // first and last names of sales people
	int salesAmt;        // amount sold 

	Scanner scan = new Scanner (System.in);

	System.out.println("\nSales Sorter\n");
	System.out.print("Enter the number of sales people: ");
	numSellers = scan.nextInt();
	scan.nextLine();     //read to nextLine

	Salesperson[] salesStaff = new Salesperson[numSellers];

	for (int i = 0; i < numSellers; i++)
	    {
		System.out.print("Enter the first name of salesperson " +
				 (i+1) + ": ");
		first = scan.nextLine();
		System.out.print("Enter the last name: ");
		last = scan.nextLine();
		System.out.print("Enter the number of sales: ");
		salesAmt = scan.nextInt();
		scan.nextLine();           //read past the end of line

		salesStaff[i] = new Salesperson(first, last, salesAmt);
	    }

	Sorting.insertionSort(salesStaff);

	System.out.println ("\nRanking of Sales for the Week\n");

	for (Salesperson s : salesStaff)
	    System.out.println (s);
    }
}
