import java.util.*;
import java.text.*;
public class Quizzes {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int numQ = 0;
		NumberFormat fmt = NumberFormat.getPercentInstance();

		do {
			System.out.print("How many questions are there?: ");
			numQ = scan.nextInt();
		} while(numQ == 0);
		Integer [] answers = new Integer[numQ];
		Integer [] response = new Integer[numQ];
		System.out.println(answers.length);

		for (int i=0;i < answers.length;i++){
			System.out.print("Enter the key for Q"+(i+1)+": ");
			answers[i] = scan.nextInt();
		}
		do{
			for (int i=0;i < response.length;i++){
				System.out.print("Enter the answer for Q"+(i+1)+": ");
				response[i] = scan.nextInt();
			}
			int numCorrect = 0;
			for (int i=0;i < numQ;i++){
				numCorrect += (answers[i] == response[i])?1:0;
			}
			System.out.println("Correct: "+numCorrect);
			System.out.println("Percent: "+fmt.format((double)numCorrect/numQ));
			System.out.print("Grade another quiz? (y/n): ");
		} while (scan.next().toLowerCase().charAt(0)=='y');
	}
}