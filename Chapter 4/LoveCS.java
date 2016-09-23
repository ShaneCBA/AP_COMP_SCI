import java.util.*;

public class LoveCS {
	public static void main(String[] args){
		final int LIMIT = 3;
		int sum=0;
		int count = 1;

		while(count <= LIMIT) {
			System.out.println(count+"I love computer science!!");
			sum+=count;
			count++;
		}
		System.out.println("Printed this message "+count+" times. The sum of the numbers 1-3 is "+sum);
	}
}