// ****************************************************************
// Essay.java
//
// A class that defines an essay test question by extending class
// TestQuestion.
//
// ****************************************************************
import java.util.Scanner;
public class Essay extends TestQuestion
{
    private int numLines;

    //---------------------------------------
    // Reads the next question from the standard input.
    // Note that although the directions call for readQuestion to be a
    // parameterless question, it needs to take the Scanner
    // as a parameter to read correctly if the input is redirected from
    // a file.
    //---------------------------------------
    protected void readQuestion(Scanner scan)
    {
		numLines = scan.nextInt();
		System.out.println("NumLines: "+numLines);
		scan.nextLine();
		question = scan.nextLine();
		System.out.println("Question: "+question);

    }

    //---------------------------------------
    // Returns the formatted question as a string.
    //---------------------------------------
    public String toString()
    {
	String ans = question;
	for (int i=0; i<numLines; i++)
	    ans += "\n";
	return ans;
    }


}
