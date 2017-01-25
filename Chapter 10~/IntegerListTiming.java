// ****************************************************************
// FILE:  IntegerListTiming.java
//
// Purpose: Define an IntegerList class with methods to create, fill,
//          sort, and search in a list of integers.
//
// ****************************************************************

import java.util.Scanner;

public class IntegerListTiming
{
    int[] list; //values in the list

    //------------------------------------------------------------
    // Constructor -- takes an integer and creates a list of that
    // size.  All elements default to value 0.
    //------------------------------------------------------------
    public IntegerListTiming(int size)
    {
	list = new int[size];
    }


    //------------------------------------------------------------
    // randomize -- fills the array with randomly generated integers
    // between 1 and 100, inclusive
    //------------------------------------------------------------
    public void randomize()
    {
	int max = list.length;
	for (int i=0; i<list.length; i++)
	    list[i] = (int)(Math.random() * max) + 1;
    }


    //------------------------------------------------------------
    // fillSorted -- fills the array with sorted values
    //------------------------------------------------------------
    public void fillSorted()
    {
	for (int i=0; i<list.length; i++)
	    list[i] = i + 2;
    }



    //------------------------------------------------------------
    // print -- prints array elements with indices, one per line
    //------------------------------------------------------------
    public String toString()
    {
	String s = "";
	for (int i=0; i<list.length; i++)
	   s += i + ":\t" + list[i] + "\n";
	return s;
    }


    //----------------------------------------------------------------
    // linearSearch -- takes a target value and returns the index of
    // the first occurrence of target in the list.  Returns -1 if
    // target does not appear in the list
    //----------------------------------------------------------------
    public int linearSearch(int target)
    {
	int location = -1;
	for (int i=0; i<list.length && location == -1; i++)
	    if (list[i] == target)
		location = i;
	return location;
    }


    //------------------------------------------------------------
    // sortIncreasing  -- uses selection sort
    //------------------------------------------------------------
    public void sortIncreasing()
    {
	for (int i=0; i<list.length-1; i++)
	    {
		int minIndex = minIndex(list, i);
		swap(list, i, minIndex);
	    }
    }



    //----------------------------------------------------------------------
    // minIndex -- takes an array of ints and an index and returns the index
    // of the smallest value at the given index or higher.
    //----------------------------------------------------------------------
    private int minIndex(int[] a, int start)
    {

    }

    //----------------------------------------------------------------------
    // swap -- takes an array of ints and two indices and swaps the contents
    // of the array at those indices
    //----------------------------------------------------------------------
    private void swap(int[] a, int i, int j)
    {

    }


    //------------------------------------------------------------
    // sortDecreasing -- uses insertion sort to sort the list into
    // decreasing order
    //------------------------------------------------------------
    public void sortDecreasing()
    {

    }


    //------------------------------------------------------------
    // binarySearch -- takes a target and returns the index where
    // the target exists in the list, or -1 if it is not there
    //------------------------------------------------------------
    public int binarySearch(int target)
    {

    }

}

