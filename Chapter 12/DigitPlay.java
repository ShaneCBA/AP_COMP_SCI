// *******************************************************************
//   DigitPlay.java
//
//   Finds the number of digits in a positive integer.
// *******************************************************************

import java.util.Scanner;

public class DigitPlay
{
    public static void main (String[] args)
    {
	int num;    //a number

	Scanner scan = new Scanner (System.in);

	System.out.println ();
	System.out.print ("Please enter the identification number: ");
	num = scan.nextInt ();

	if (num <= 0)
	    System.out.println ( num + " isn't positive -- start over!!");
	else
	    // Call numDigits to find the number of digits in the number
		// Print the number returned from numDigits
		System.out.println ("\nThe number " + num + " contains " + numDigits (num) + " digits.");
		System.out.println ("\nThe number " + num + " digit sum is " + sumDigits (num) + ".");
		System.out.println ("\nThe number " + num + " is " + (((sumDigits (num)/7)*7==(sumDigits(num)))?" valid":" not valid") + ".");
		System.out.println ();
    }


    // -----------------------------------------------------------
    //  Recursively sums the digits in a positive integer
    // -----------------------------------------------------------
    public static int numDigits(int num)
    {
	if (num < 10)
	    return (1);
	else
	    return (1 + numDigits(num/10));
    }


    public static int sumDigits(int num)
    {
		if (num < 10){
		    return (num);}
		else{
	 	   //System.out.println(num-((num/((int)Math.pow(10,numDigits(num)-1)))*((int)Math.pow(10,numDigits(num)-1))));
	 	   return (num/((int)Math.pow(10,numDigits(num)-1)) + sumDigits(num-((num/((int)Math.pow(10,numDigits(num)-1)))*((int)Math.pow(10,numDigits(num)-1)))));
	   }
    }
}



