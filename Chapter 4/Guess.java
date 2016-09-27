// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess
{
    public static void main(String[] args)
    {
    int numToGuess;       //Number the user tries to guess
    int guess;            //The user's guess

	int numOfGuesses;

	int low=0, high=0;

	Random generator = new Random();
	Scanner scan = new Scanner (System.in);

	//randomly generate the  number to guess
	numToGuess = generator.nextInt();

	//print message asking user to enter a guess
	System.out.print("Enter your guess: ");

	//read in guess
	guess = scan.nextInt();

	while ( guess != numToGuess ) {
	    guess = scan.nextInt();

	    numOfGuesses++;

	    if (guess > numToGuess) {
			high++;
			System.out.print("Your guess was too high: ");
		}
		else if (guess < numToGuess)
		{
			low++;
			System.out.print("Your guess was too low: ");
		}
	}
	System.out.println("You guessed correct!");
	System.out.println("Low:"+low);
	System.out.println("High:"+high);
	System.out.println("Total: "+numOfGuesses);






    }
}


