// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and print student's name.
// ****************************************************************
import java.util.Scanner;

public class Student
{
    //declare instance data
	private String name=null;
	private int score1;
	private int score2;
	private Scanner scan = new Scanner(System.in);

    //----------------------------------------------------
    //constructor
    //----------------------------------------------------
    public Student(String studentName)
    {
		this.name = studentName;
    }

    //----------------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //----------------------------------------------------
    public void inputGrades()
    {
		System.out.print(name+" Test 1 [0/100]: ");score1 = scan.nextInt();
		System.out.print(name+" Test 2 [0/100]: ");score2 = scan.nextInt();
    }

    //----------------------------------------------------
    //getAverage: compute and return the student's test average
    //----------------------------------------------------
    public double getAverage()
    {
		return (score1+score2)/2;
    }


    //----------------------------------------------------
    //getName: returns the student's name
    //----------------------------------------------------
    public String getName()
    {
		return this.name;
    }

	public String toString(){
		return "Name:\t"+name+"\t Test1:\t"+score1+"\tTest2:\t"+score2;
	}

    //----------------------------------------------------
    //toString: returns a String representing the Student object
    //----------------------------------------------------

}











