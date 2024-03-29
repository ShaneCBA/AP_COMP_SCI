// ****************************************************************************
//   Warning.java
//
//   Reads student data from a text file and writes data to another text file.
// ****************************************************************************

import java.util.*;
import java.io.*;

public class Warning
{
    // --------------------------------------------------------------------
    //   Reads student data (name, semester hours, quality points) from a
    //   text file, computes the GPA, then writes data to another file
    //   if the student is placed on academic warning.
    // --------------------------------------------------------------------
    public static void main (String[] args)
    {

	int creditHrs;         // number of semester hours earned
	double qualityPts;     // number of quality points earned
	double gpa;            // grade point (quality point) average

	String line, name, inputName = "students.dat";
	String outputName = "warning.dat";


		// Set up Scanner to input file


		// Set up the output file stream


		// Print a header to the output file
		outFile.println ();
		outFile.println ("Students on Academic Warning");
		outFile.println ();

		// Process the input file, one token at a time
		while (scan.hasNext())
		    {
			// Get the credit hours and quality points and
			// determine if the student is on warning. If so,
			// write the student data to the output file.


		//Close output file
	    }

	catch (FileNotFoundException e)
	    {
		System.out.println ("The file " + inputName + " was not found.");
	    }
	//Note that the Scanner throws an InputMismatchException, not a
	//NumberFormatException as indicated in the problem statement
	catch (InputMismatchException e)
	    {
		System.out.println("Format error in input file: " + e);
	    }
	catch (IOException e)
	    {
		System.out.println (e);
	    }
    }
}
