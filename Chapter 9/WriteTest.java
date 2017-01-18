import java.util.*;

 public class WriteTest {
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

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
	 }
 }