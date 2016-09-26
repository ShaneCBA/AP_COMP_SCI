// ****************************************************************
//   Guess2.java
//
//   Play a game where the user guesses a number from 1 to 10
//   Uses a do..while loop.
//
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess2
{
    public static void main(String[] args)
    {
        int numToGuess;       //Number the user tries to guess
        int guess;            //The user's guess
	int numGuesses;       //Number of guesses
	int tooHigh;          //Number of too high guesses
	int tooLow;           //Number of too low guesses

	Random generator = new Random();
	Scanner scan = new Scanner (System.in);

	//randomly generate the  number to guess
	numToGuess = generator.nextInt(10) + 1;

	//print message asking user to enter a guess
	System.out.println("I'm thinking of a number!!");
	System.out.print("Enter your guess: ");

	numGuesses = 0;
	tooHigh = 0;
	tooLow = 0;
	guess = 0;

	do {
	    //read in guess
	    guess = scan.nextInt();

	    numGuesses++;
	    if (guess > numToGuess)
		{
		    System.out.print("Too high, guess again: ");
		    tooHigh++;
		}
	    else if (guess < numToGuess)
		{
		    System.out.print("Too low, guess again: ");
		    tooLow++;
		}
	} while (guess != numToGuess);


	if (numGuesses == 1)
	    System.out.println("You got it, after only one guess!!");
	else
	    System.out.println("You got it, after only " + numGuesses + " guesses!!");

	if (tooHigh == 1)
	    System.out.println(tooHigh + " guess was too high.");
	else
	    System.out.println(tooHigh + " guesses were too high.");

	if (tooLow == 1)
	    System.out.println(tooLow + " guess was too low.");
	else
	    System.out.println(tooLow + " guesses were too low.");






    }
}


