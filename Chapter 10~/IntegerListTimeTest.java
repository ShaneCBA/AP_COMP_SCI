// ****************************************************************
// FILE:  IntegerListTimeTest.java
//
// Purpose: Provide a menu-driven tester for the IntegerList class.
//          
// ****************************************************************

import java.util.Scanner;
import java.util.*;

public class IntegerListTimeTest
{
    static IntegerListTiming list = new IntegerListTiming(10);
    static Scanner scan = new Scanner (System.in);

    //---------------------------------------------------------
    // main -- creates an initial list, then repeatedly prints
    // the menu and does what the user asks until they quit
    //---------------------------------------------------------
    public static void main(String[] args)
    {
	printMenu();
	int choice = scan.nextInt();
	while (choice != 0)
	    {
		dispatch(choice);
		printMenu();
		choice = scan.nextInt();
	    }
    }

    //------------------------------------------------------
    // dispatch -- takes a choice and does what needs doing 
    //------------------------------------------------------
    public static void dispatch(int choice)
    {
	int loc;
	int val;
	long time1, time2;
	switch(choice)
	    {
	    case 0: 
		System.out.println("Bye!");
		break;
	    case 1:
		System.out.println(list);
		break;
	    case 2:
		System.out.println("How big should the list be?");
		list = new IntegerListTiming(scan.nextInt());
		System.out.println("List is created.");
		break;
	    case 3:
		list.randomize();
		System.out.println("List is filled with random elements.");
		break;
	    case 4:
		list.fillSorted();
		System.out.println("List is filled with sorted elements.");
		break;
	    case 5:
		System.out.print("Enter the value to look for: ");
		val = scan.nextInt();
		time1 = System.currentTimeMillis();
		loc = list.linearSearch(val);
		time2 = System.currentTimeMillis();
		if (loc != -1)
		    System.out.println("Found at location " + loc);
		else
		    System.out.println("Not in list");
		System.out.println ("Search time: " + (time2 - time1));
		break;
	    case 6:
		System.out.print("Enter the value to look for: ");
		val = scan.nextInt();
		time1 = System.currentTimeMillis();
		loc = list.binarySearch(val);
		time2 = System.currentTimeMillis();
		if (loc != -1)
		    System.out.println("Found at location " + loc);
		else
		    System.out.println("Not in list");
		System.out.println ("Search time: " + (time2 - time1));
		break;
	    case 7:
		time1 = System.currentTimeMillis();
		list.sortIncreasing();
		time2 = System.currentTimeMillis();
		System.out.println("List has been sorted.");
		System.out.println ("Sort time: " + (time2 - time1));
		break;
	    case 8:
		time1 = System.currentTimeMillis();
		list.sortDecreasing();
		time2 = System.currentTimeMillis();
		System.out.println("List has been sorted.");
		System.out.println ("Sort time: " + (time2 - time1));
		break;
	    default:
		System.out.println("Sorry, invalid choice");
	    }
    }


    //------------------------------------------------------
    // printMenu -- prints the user's choices
    //------------------------------------------------------
    public static void printMenu()
    {
	System.out.println("\n   Menu   ");
	System.out.println("   ====");
	System.out.println("0: Quit");
	System.out.println("1: Print the list");
	System.out.println("2: Create a new list of a given size");
	System.out.println("3: Fill the list with random ints in range 1-length");
	System.out.println("4: Fill the list with already sorted elements");
	System.out.println("5: Use sequential search to find an element");
	System.out.println("6: Use binary search to find an element (list must be sorted in increasing order)");	
	System.out.println("7: Use selection sort to sort the list into increasing order");
	System.out.println("8: Use insertion sort to sort the list into decreasing order");

	System.out.print("\nEnter your choice: ");
    }


}

