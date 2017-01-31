import java.util.*;
import java.io.*;

 public class WriteTest {
	 public static void main(String[] args) {
		 try {
			 Scanner scan = new Scanner(new File("testbank.dat"));

			 TestQuestion[] testQuestions;
			 int temp;
			 String tmp;
			 temp = scan.nextInt();
			 System.out.println("NumQ: "+temp);
			 testQuestions = new TestQuestion[temp];

			 for (int i = 0; i < testQuestions.length; i++){

				tmp = scan.next().toLowerCase();
				System.out.println("E or M: "+tmp);
				switch (tmp.charAt(0)) {
					case 'e':
						System.out.println("Essay");
						testQuestions[i] = new Essay();
						testQuestions[i].readQuestion(scan);
						System.out.println("\\Essay");
					break;


					case 'm':
						System.out.println("Mult");
						testQuestions[i] = new MultChoice();
						testQuestions[i].readQuestion(scan);
					break;
					default:
						System.out.println("Error");
					break;
				}

			 }

		System.out.println("*******************************");
		for (int i = 0; i < testQuestions.length; i++){
			System.out.println(testQuestions[i].toString());
		}
		 }
		 catch(FileNotFoundException e){}


	 }
 }