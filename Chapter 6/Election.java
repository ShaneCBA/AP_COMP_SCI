// ***************************************************************
//   Election.java
//
//   This file contains a program that tallies the results of
//   an election.  It reads in the number of votes for each of
//   two candidates in each of several precincts.  It determines
//   the total number of votes received by each candidate, the
//   percent of votes received by each candidate, the number of
//   precincts each candidate carries, and the
//   maximum winning margin in a precinct.
// **************************************************************

import java.util.Scanner;

public class Election
{
    public static void main (String[] args)
    {
	int votesForPolly;  // number of votes for Polly in each precinct
	int votesForErnest; // number of votes for Ernest in each precinct
	int totalPolly=0;     // running total of votes for Polly
	int totalErnest=0;    // running total of votes for Ernest
	int pollyPrecincts=0;  // number of precincts won by Polly
	int ernestPrecincts=0; // number of precincts won by Ernest
	int tiePrecincts=0;    // number of precincts that are tied
	String response;     // answer (y or n) to the "more precincts" question

	Scanner scan = new Scanner (System.in);

	System.out.println ();
	System.out.println ("Election Day Vote Counting Program");
	System.out.println ();

	// Loop to "process" the votes in each precinct
	do {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("Votes for Polly: ");votesForPolly = scan.nextInt();
		totalPolly += votesForPolly;
		System.out.print("Votes for Ernest: ");votesForErnest = scan.nextInt();
		totalErnest += votesForErnest;
		if (votesForPolly > votesForErnest) {pollyPrecincts++;}
		else if (votesForPolly == votesForErnest) {tiePrecincts++;}
		else {ernestPrecincts++;}
		System.out.print("Another Precinct? [y/n] : ");response = scan.next();
	} while(response.equalsIgnoreCase("y"));
	// Print results
	System.out.println("\n\n\nTotal Votes For Polly: "+totalPolly+
	"\nTotal Votes For Ernest: "+totalErnest+
	"\nPercent Votes For Polly: "+((double)(1000*totalPolly/(totalPolly+totalErnest))/10)+"%"+
	"\nPercent Votes For Ernest: "+((double)(1000*totalErnest/(totalPolly+totalErnest)))/10+"%"+
	"\nPrecincts Won By Polly: "+pollyPrecincts+
	"\nPrecincts Won By Ernest: "+ernestPrecincts+
	"\nPrecenct Ties: "+tiePrecincts);

    }
}
