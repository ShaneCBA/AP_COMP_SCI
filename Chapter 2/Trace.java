import java.util.*;

public class Trace {
	public static void main(String[] args){
		int one,two,three;
		double what;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter two integers:");
		one = scan.nextInt();
		two = scan.nextInt();

		System.out.print("Enter a floating point number: ");
		what = scan.nextDouble();

		three = 4*one+5*two;
		two=2*one;
		System.out.println("one " + two + ":" + three);
		one = 46/5*2+19%4;
		three = one+two;
		what = (what+2.5)/2;
		System.out.println(what + " is what!");
	}
}
/*
Enter two integers:
10
3
Enter a floating point number: 14.3
one 20:55
8.4 is what!
Press any key to continue . . .
*/