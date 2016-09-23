// ****************************************************************
// Rock.java
//
// Play Rock, Paper, Scissors with the user
//
// ****************************************************************
import java.util.*;

public class Rock
{
    public static void main(String[] args){
	String[] RPS = {"R","P","S"};
	String personPlay;    //User's play -- "R", "P", or "S"
	String computerPlay = "";  //Computer's play -- "R", "P", or "S"
	int computerInt;      //Randomly generated number used to determine
	                      //computer's play

	Random generator = new Random();
	Scanner scan = new Scanner (System.in);

	//Get player's play -- note that this is stored as a string
	System.out.print("Enter your play [R,P, or S]: ");
	personPlay = (scan.next()).toUpperCase();
	//Make player's play uppercase for ease of comparison

	while (!Arrays.asList(RPS).contains(personPlay)) {
		System.out.print("Enter your play [R,P, or S]: ");
		personPlay = (scan.next()).toUpperCase();
	}


	//Generate computer's play (0,1,2)
	computerInt = (int)(Math.random()*100)%3;

	//Translate computer's randomly generated play to string
	//"R", "P", or "S".  If play is not a value you expected (0,1,2),
	//set it to "I" and print a warning message.
	switch (computerInt)
	    {
			case 0:
				computerPlay="R";
			break;
			case 1:
				computerPlay="P";
			break;
			case 2:
				computerPlay="S";
			break;
	    }

	//Print computer's play
	System.out.println("The computer's play is "+computerPlay);

	//Illegal person play?

	//Illegal computer play?

	//See who won.  Use nested ifs instead of &&.

	if (personPlay.equals(computerPlay))
		System.out.println("It's a tie!");

	else if (personPlay.equals("R"))
		if (computerPlay.equals("S"))
		System.out.println("Rock crushes scissors.  You win!!");
		if (computerPlay.equals("P"))
		System.out.println("Paper covers rock.  You lose!!");

	else if (personPlay.equals("S"))
		if (computerPlay.equals("R"))
		System.out.println("Rock crushes scissors.  You lose!!");
		if (computerPlay.equals("P"))
		System.out.println("Scissors cuts paper.  You win!!");

	else if (personPlay.equals("P"))
		if (computerPlay.equals("R"))
		System.out.println("Paper covers rock.  You win!!");
		if (computerPlay.equals("S"))
		System.out.println("Scissors cuts paper.  You lose!!");

	}
}








