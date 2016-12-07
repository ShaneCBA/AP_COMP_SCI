// ****************************************************************
// IntegerListTest.java
//
// Provide a menu-driven tester for the IntegerList class.
//
// ****************************************************************

import java.util.Scanner;

public class IntegerListTest
{
    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner (System.in);

    //---------------------------------------------------------------
    // Create a list, then repeatedly print the menu and do what the
    // user asks until they quit
    //---------------------------------------------------------------
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


    //-------------------------------------------------------
    // Do what the menu item calls for
    //-------------------------------------------------------
    public static void dispatch(int choice)
    {
	int loc;
	int oldVal, newVal;

	switch(choice)
	    {
	    case 0:
		System.out.println("Bye!");
		break;
	    case 1:
		System.out.println("How big should the list be?");
		int size = scan.nextInt();
		list = new IntegerList(size);
		list.randomize();
		break;
	    case 2:
		list.selectionSort();
		break;
	    case 3:
		System.out.print("Enter the value to look for: ");
		loc = list.search(scan.nextInt());
		if (loc != -1)
		    System.out.println("Found at location " + loc);
		else
		    System.out.println("Not in list");
		break;
	    case 4:
		list.print();
		break;
	    case 5:
		list.sortDecreasing();
		break;
	    case 6:
		System.out.print("Enter the old value: ");
		oldVal = scan.nextInt();
		System.out.print("Enter the new value: ");
		newVal = scan.nextInt();
		list.replaceFirst(oldVal,newVal);
		break;
	    case 7:
		System.out.print("Enter the old value: ");
		oldVal = scan.nextInt();
		System.out.print("Enter the new value: ");
		newVal = scan.nextInt();
		list.replaceAll(oldVal,newVal);
		break;
	    case 8:
		System.out.print("Enter the value to look for: ");
		loc = list.binarySearchD(scan.nextInt());
		if (loc != -1)
		    System.out.println("Found at location " + loc);
		else
		    System.out.println("Not in list");
		break;

	    default:
		System.out.println("Sorry, invalid choice");
	    }
    }


    //-------------------------------------------------------
    // Print the user's choices
    //-------------------------------------------------------
    public static void printMenu()
    {

	System.out.println("\n   Menu   ");
	System.out.println("   ====");
	System.out.println("0: Quit");
	System.out.println("1: Create a new list (** do this first!! **)");
	System.out.println("2: Sort the list using selection sort");
	System.out.println("3: Find an element in the list using sequential search");
	System.out.println("4: Print the list");
	System.out.println("5: Sort the list in decreasing order");
	System.out.println("6: Replace a value in the list");
	System.out.println("7: Replace all occurrences of a value in the list");
	System.out.println("8: Find an element in a list sorted in decreasing order");
	System.out.print("\nEnter your choice: ");
    }


}

