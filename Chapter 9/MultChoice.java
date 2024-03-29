// ****************************************************************
// MultChoice.java
//
// A class that defines a multiple choice test question by extending class
// TestQuestion.
//
// ****************************************************************
import java.util.Scanner;
public class MultChoice extends TestQuestion

{
    private String[] choices;
    private int numChoices;

    //---------------------------------------
    // Reads the question and each of four choices
    // from the standard input
    // Note that although the directions call for readQuestion to be a
    // parameterless question, it needs to take the Scanner
    // as a parameter to read correctly if the input is redirected from
    // a file.

    //---------------------------------------
    protected void readQuestion(Scanner scan)
    {
		numChoices = scan.nextInt();
		System.out.println(numChoices);
		choices = new String[numChoices];

		//Eat up newline after integer

		//Read question
		scan.nextLine();
		question = scan.nextLine();
		System.out.println(question);

		//Read choices
		for (int i = 0; i < choices.length; i++){
			choices[i] = scan.nextLine();
		}
	}

    //---------------------------------------
    // Returns the questions and each of the
    // choices in a neatly formatted string
    //---------------------------------------
    public String toString()
    {
		String ans = question + "\n";
		for (int i=1; i<numChoices; i++)
			ans += "\t" + (char)('a'+i-1) + ". " + choices[i] + "\n";
		return ans;
    }
}
