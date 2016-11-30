import java.util.*;
public class ReverseArray {
	public static void main(String[] args){
		int [] array1;
		int [] array2;
		Scanner scan = new Scanner(System.in);

		System.out.print("How many values?: ");
		array1 = new int[scan.nextInt()];
		array2 = new int[array1.length];

		for (int i = 0; i < array1.length;i++){
			System.out.print("INPUT Val"+i+": ");
			array1[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(array1));
		for (int i = 0; i < array1.length;i++){
			array2[array2.length - (i+1)] = array1[i];
		}
		System.out.println(Arrays.toString(array2));
	}
}