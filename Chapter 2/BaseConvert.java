import java.util.*;

public class BaseConvert {
	public static void main(String[] args) {
		int num, base;
		String newNum = new String("");

		int [] places = new int[4];
		int [] placeDivision = new int[4];

		final int MAXDIGITS;

		Scanner scan = new Scanner(System.in);

		System.out.print("Input New Base (2-9): ");base = scan.nextInt();

		int maximumNumWithBase=0;
		for (int i = 0; i < 4; i++){
			maximumNumWithBase+=Math.pow(base,i);
		}

		System.out.print("Please input a number between 0-"+maximumNumWithBase+": ");num = scan.nextInt();

		places[0] = num%base;
		placeDivision[0] = num/base;

		for (int i = 1; i < 4; i++){
			places[i] = placeDivision[i-1]%base;
			placeDivision[i] = placeDivision[i-1]/base;
		}

		for (int i = 3; i >= 0; i--) {//Integer item:places) {
			newNum.concat(places[i].toString());
			//System.out.print(item);//.toString());
		}

		System.out.println(newNum);
	}
}
