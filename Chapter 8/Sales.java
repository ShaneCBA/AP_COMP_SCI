// ****************************************************************************
// Sales.java
//
// Reads in and stores sales for each of any number of salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************************
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
	final int SALESPEOPLE = 5;
	int[] sales = new int[SALESPEOPLE];
	int sum;
	double avg;
	int maxSale=0, minSale=9999999;
	int maxSP=0, minSP=0;

	Scanner scan = new Scanner (System.in);

	for (int i=0; i<sales.length; i++) {
		System.out.print("Enter sales for salesperson " + (i+1) + ": ");
		sales[i] = scan.nextInt();
		if (maxSale < sales[i]){
			maxSale = sales[i];
			maxSP = i;
		}
		if(minSale > sales[i]){
			minSale = sales[i];
			minSP = i;
	    }
	}

	System.out.println("\nSalesperson   Sales");
	System.out.println("--------------------");
	sum = 0;

	for (int i=0; i<sales.length; i++)
	    {
		System.out.println("     " + (i+1) + "\t\t" + sales[i]);
		sum += sales[i];

		}
	System.out.println("\nTotal sales: " + sum);
		avg = sum/sales.length;
		System.out.println("AVG: "+avg);
		System.out.println("Max: "+maxSale);
		System.out.println("Max SP: "+(maxSP+1));
		System.out.println("Min: "+minSale);
		System.out.println("Min SP: "+(minSP+1));
    }
}



