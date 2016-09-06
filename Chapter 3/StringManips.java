// ***************************************************************
// FILE:  StringManips.java
//
// Purpose: Test several methods for manipulating String objects
// ***************************************************************

import java.util.Scanner;

public class StringManips
{
    public static void main (String[] args)
    {
	String phrase = new String ("This is a String test.");
	int phraseLength;   // number of characters in the phrase String
	int middleIndex;    // index of the middle character in the String
	String firstHalf;   // first half of the phrase String
	String secondHalf;  // second half of the phrase String
	String middle3;
	String switchedPhrase; // a new phrase with original halves switched
	String city,state;

        Scanner scan = new Scanner (System.in);

	// compute the length and middle index of the phrase
	phraseLength = phrase.length();
	middleIndex = phraseLength / 2;

	// get the substring for each half of the phrase
	firstHalf = phrase.substring(0,middleIndex);
	secondHalf = phrase.substring(middleIndex, phraseLength);

	// get middle 3 characters

	middle3 = phrase.substring(middleIndex-1,middleIndex+2);

	// concatenate the firstHalf at the end of the secondHalf
	switchedPhrase = secondHalf.concat(firstHalf);

	//
	switchedPhrase = phrase.replace(' ','*');

	// print information about the phrase
	System.out.println();
	System.out.println ("Original phrase: " + phrase);
	System.out.println ("Length of the phrase: " + phraseLength +
			    " characters");
	System.out.println ("Index of the middle: " + middleIndex);
	System.out.println ("Character at the middle index: " +
			    phrase.charAt(middleIndex));
	System.out.println ("Three Characters at the middle: [" + middle3+"]");

	System.out.println ("Switched phrase: " + switchedPhrase);

	System.out.println();

	// prompt for and read in the hometown city and state
	System.out.print("Input your hometown [CITY]: ");city = scan.next();
	System.out.print("Input your hometown [STATE]: ");state = scan.next();

	// print results
	System.out.println(state.toUpperCase()+city.toLowerCase()+state.toUpperCase());

    }
}







