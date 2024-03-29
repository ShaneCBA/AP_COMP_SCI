// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if
// each square is magic.
//
// ****************************************************************

import java.util.Scanner;

public class SquareTest
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner (System.in);

	int count = 1;                 //count which square we're on
	int size = scan.nextInt();     //size of next square

	//Expecting -1 at bottom of input file
	while (size > 0)
	    {
		//create a new Square of the given size
		Square sqr = new Square(size);

		//call its read method to read the values of the square
		sqr.readSquare(scan);

		System.out.println("\n******** Square " + count + " ********");
		//print the square
		sqr.printSquare();

		//print the sums of its rows
		System.out.println("Printing sum of rows: ");
		for (int i = 0; i < size; i++){
			System.out.println("\tSum of row "+(i+1)+": "+sqr.sumRow(i));
		}

		//print the sums of its columns
		System.out.println("Printing sum of columns: ");
		for (int i = 0; i < size; i++){
			System.out.println("\tSum of column "+(i+1)+": "+sqr.sumCol(i));
		}



		//print the sum of the main diagonal
		System.out.println("Sum of main diagonal: "+sqr.sumMainDiag());

		//print the sum of the other diagonal
		System.out.println("Sum of other diagonal: "+sqr.sumOtherDiag());


		//determine and print whether it is a magic square
		System.out.println("The square is"+(sqr.magic()?"":" not")+" magic");


		//get size of next square
		size = scan.nextInt();

	    }

   }
}


