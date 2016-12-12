//********************************************************
//  Parameters.java
//
//  Illustrates the concept of a variable parameter list.
//********************************************************

import java.util.Scanner;

public class Parameters
{
    //-----------------------------------------------
    //  Calls the average and minimum methods with
    //  different numbers of parameters.
    //-----------------------------------------------
    public static void main(String[] args)
    {
	double mean1, mean2, mean3, mean4, mean5;
	int numVals;
	int [] mean5List;

	Scanner scan = new Scanner (System.in);

	mean1 = average(42, 69, 37);
	mean2 = average(35, 43, 93, 23, 40, 21, 75);
	mean3 = average(13);
	mean4 = average(0);

	System.out.print("Print length of new mean: ");
	numVals = scan.nextInt();
	mean5List = new int[numVals];
	System.out.println("Input the next "+numVals+" numbers: ");

	for (int i = 0; i < numVals; i++){
		System.out.print("\t");
		mean5List[i] = scan.nextInt();
	}
	mean5 = average(mean5List);

	System.out.println ("mean1 = " + mean1);
	System.out.println ("mean2 = " + mean2);
	System.out.println ("mean3 = " + mean3);
	System.out.println ("mean4 = " + mean4);
	System.out.println ("mean5 = " + mean5);
	System.out.println ("\nLowest value of your list: "+minimum(mean5List));

	}
    //----------------------------------------------
    //  Returns the average of its parameters.
    //----------------------------------------------
    public static double average (int ... list)
    {
	double result = 0.0;

	if (list.length != 0)
	    {
		int sum = 0;
		for (int num: list)
		    sum += num;
		result = (double)sum / list.length;
	    }

	return result;
    }

    //-----------------------------------------
    // Returns the minimum of its parameters.
    //-----------------------------------------
    public static int minimum (int ... list) {
		int lowest = list[0];
		for (int i = 1; i < list.length; i++){
			lowest = (lowest > list[i])?list[i]:lowest;
		}
		return lowest;
	}

}
