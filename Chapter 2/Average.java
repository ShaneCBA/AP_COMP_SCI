import java.util.*;

public class Average {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int val1,val2,val3;
		System.out.print("How many numbers do you want to average? ");
		int x = input.nextInt();
		//int [] valArray = new int[x];
		double average=0;
		for(int i = 0; i < x;i++) {
			System.out.println("Input number "+(i+1)+" of "+x+":");
			//valArray[i] = input.nextInt();
			average += input.nextInt();
		}
		average /= x;
		System.out.println("Average of numbers: "+average);
		/*int a = 3, b = 10, c = 7;
		double w = 12.9, y = 3.2;
		System.out.println("Q4: "+(w%y));*/
	}
}