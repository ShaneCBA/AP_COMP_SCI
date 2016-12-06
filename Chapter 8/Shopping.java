//*********************************************************************
//  Shopping.java
//
//  Simulates shopping.
//*********************************************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class Shopping
{
    //-----------------------------------------------------
    // Reads in name, price, and quantity of each item
    // the user wants to purchase.  The contents of the 
    // cart and the total price are printed.
    //-----------------------------------------------------
    public static void main (String[] args)
    {
	String itemName;
	int quantity;
	double price;
	Scanner scan = new Scanner (System.in);

	ShoppingCart cart = new ShoppingCart();

	System.out.println ("Welcome to Shopper's Paradise");
	System.out.println ();

	System.out.print ("Enter the name of the first item: ");
	itemName = scan.nextLine();
	while (!itemName.equals("q") && !itemName.equals("Q"))
	    {
		System.out.print ("Enter the quantity: ");
		quantity = scan.nextInt();
		System.out.print ("Enter the price: ");
		price = scan.nextDouble();
		scan.nextLine();    // read over the end of line

		cart.addToCart(itemName, price, quantity);

		System.out.print ("Enter the name of the next item or Q to quit: ");
		itemName = scan.nextLine();
	    }

	System.out.println();
	System.out.println (cart);
	System.out.println();

	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	System.out.println ("Please pay... " + fmt.format(cart.getTotal()));
    }
}
