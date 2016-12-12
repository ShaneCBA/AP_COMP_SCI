// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a column, either diagonal, and whether it is magic.
//
// ****************************************************************

import java.util.Scanner;

public class Square
{

    int[][] square;

    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size)
    {
		square = new int[size][size];
    }


    //-----------------------------------------------
    //return the sum of the values in the given row
    //-----------------------------------------------
    public int sumRow(int row)
    {
		int sum=0;
		for (int i = 0; i < square.length; i++){
			sum += square[i][row];
		}
		return sum;
    }


    //-------------------------------------------------
    //return the sum of the values in the given column
    //-------------------------------------------------
    public int sumCol(int col)
    {
		int sum = 0;
		for (int i = 0; i < square.length; i++){
			sum += square[col][i];
		}
		return sum;
    }

    //---------------------------------------------------
    //return the sum of the values in the main diagonal
    //---------------------------------------------------
    public int sumMainDiag()
    {
		int sum = 0;
		for (int i = 0; i < square.length; i++) {
			sum += square[i][i];
		}
		return sum;
    }

    //---------------------------------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //---------------------------------------------------------------
    public int sumOtherDiag()
    {
		int sum = 0;
		for (int i = square.length-1; i >= 0; i--) {
			sum += square[i][i];
		}
		return sum;

    }

    //-------------------------------------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //-------------------------------------------------------------------
    public boolean magic()
    {
		boolean isMagic = true;
		int lastSumRow = sumRow(0);
		int lastSumCol = sumCol(0);

		for (int i = 1; i < square.length; i++){

			int rowSum = sumRow(i);
			int colSum = sumCol(i);

			if (rowSum != lastSumRow) {
				isMagic = false;
				break;
			}
			if (colSum != lastSumCol) {
				isMagic = false;
				break;
			}
			lastSumRow = rowSum;

		}
		if (lastSumRow != lastSumCol){
			isMagic = false;
		}

		if (lastSumRow != sumMainDiag() && lastSumRow != sumOtherDiag()){
			isMagic = false;
		}

		return isMagic;

    }

    //----------------------------------------------------
    //read info into the square from the standard input.
    //----------------------------------------------------
    public void readSquare(Scanner scan)
    {
	for (int row = 0; row < square.length; row++)
	    for (int col = 0; col < square.length; col ++)
		square[row][col] = scan.nextInt();
    }

    //---------------------------------------------------
    //print the contents of the square, neatly formatted
    //---------------------------------------------------
    public void printSquare()
    {
		for (int r = 0;r < square.length; r++) {
			for (int c = 0; c < square.length; c++) {
				System.out.print("["+square[r][c]+"]");
			}
			System.out.print("\n");
		}

    }

}






