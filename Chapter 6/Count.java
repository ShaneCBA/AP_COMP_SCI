// **********************************************************
//   Count.java
//
//   This program reads in strings (phrases) and counts the
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.Scanner;

public class Count
{
	public static void main (String[] args)
	{
		String phrase;    // a string of characters
		int length;		// the length of the phrase
		char ch;          // an individual character in the string
		String cont = "yes";

		do {
			Scanner scan = new Scanner (System.in);
			int countBlank=0, countA=0, countE=0, countS=0, countT=0; // the number of blanks (spaces) in the phrase
			// Print a program header
			System.out.println ();
			System.out.println ("Character Counter");
			System.out.println ();

			// Read in a string and find its length
			System.out.print ("Enter a sentence or phrase: ");
			phrase = scan.nextLine();
			length = phrase.length();

			// Initialize counts
			countBlank = 0;


			// a for loop to go through the string character by character
			// and count the blank spaces
			for (int i = 0; i < length;i++) {
				ch = phrase.toLowerCase().charAt(i);
				switch (ch) {
					case ' ': countBlank++; break;
					case 'a': countA++; break;
					case 'e': countE++; break;
					case 's': countS++; break;
					case 't': countT++; break;
				}
			}


			// Print the results
			System.out.println ();
			System.out.println ("Number of blank spaces: " + countBlank);
			System.out.println ("Number of 'a': " + countA);
			System.out.println ("Number of 'e': " + countE);
			System.out.println ("Number of 's': " + countS);
			System.out.println ("Number of 't': " + countT);


			//Get phrase for next time
			System.out.println("\n\nContinue [y/n]: ");
			cont = scan.next();

		} while(cont.toLowerCase().charAt(0)=='y');
	}
}
