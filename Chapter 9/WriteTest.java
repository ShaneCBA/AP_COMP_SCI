import java.util.*;
import java.io.*;

 public class WriteTest {
	 public static void main(String[] args) {
		 try {
			 Scanner scan = new Scanner(new File("testbank.dat"));

			 TestQuestion[] testQuestions;
			 testQuestions = new TestQuestion[scan.nextInt()];

			 for (int i = 0; i < testQuestions.length; i++){

				switch (scan.next().toLowerCase().charAt(0)) {
					case 'e':
						testQuestions[i] = new MultChoice();
						testQuestions[i].readQuestion(scan);
					break;


					case 'm':
						testQuestions[i] = new MultChoice();
						testQuestions[i].readQuestion(scan);
					break;
				}

			 }


			for (int i = 0; i < testQuestions.length; i++){
				System.out.println(testQuestions[i].toString());
			}

	 	}
	 	catch(FileNotFoundException e){}

	 }
 }