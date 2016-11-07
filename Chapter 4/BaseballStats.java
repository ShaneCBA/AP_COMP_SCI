// ****************************************************************
//   BaseballStats.java
//
//   Reads baseball data in from a comma delimited file. Each line
//   of the file contains a name followed by a list of symbols
//   indicating the result of each at bat: h for hit, o for out,
//   w for walk, s for sacrifice.  Statistics are computed and
//   printed for each player.
// ****************************************************************

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class BaseballStats
{
    public static void main (String[] args) throws IOException
    {
	Scanner fileScan, lineScan;
	String fileName;
	String line;          //a line from the file
	String playerName;
	int atBats, numHits, numWalks, numSacrifices, numOuts;
	String action;

	Scanner scan = new Scanner (System.in);

	System.out.print ("Enter the name of the input file: ");
	fileName = scan.nextLine();
	fileScan = new Scanner (new File(fileName));

	// Read and process each line of the file
	while (fileScan.hasNext())
	    {
		line = fileScan.nextLine();
		lineScan = new Scanner(line);
		lineScan.useDelimiter(",");

		atBats = 0;
		numHits = 0;
		numOuts = 0;
		numSacrifices = 0;
		numWalks = 0;
		playerName = lineScan.next();

		while (lineScan.hasNext())
		    {
			action = lineScan.next();
			//System.out.println(action);
			atBats++;
			switch (action) {
					case "h":
					numHits++;
						break;
					case "o":
					numOuts++;
						break;
					case "w":
					numWalks++;
						break;
					case "s":
					numSacrifices++;
						break;
				}
		    }

		//print statistics for the player
		System.out.println(playerName+" Stats:");
		System.out.println("\tAt Bats: "+atBats);
		System.out.println("\tHits: "+numHits);
		System.out.println("\tOuts: "+numOuts);
		System.out.println("\tSacrifices: "+numSacrifices);
		System.out.println("\tWalks: "+numWalks);
		System.out.println("\tBatting Average: "+(double)(1000*numHits/numOuts)/1000);
	    }
    }
}
