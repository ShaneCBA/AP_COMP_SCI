import java.util.*;

public class LuckyNumbers {
	public static void main(String [] args){
		Random rndm = new Random();

		Integer[] lucky = new Integer[3];

		lucky[0] = rndm.nextInt(30)+50;

		lucky[1] = rndm.nextInt(11)+90;

		lucky[2] = rndm.nextInt(20)+11;

		System.out.println("Your lucky numbers are "+lucky[0]+", "+lucky[1]+", "+lucky[2]+".");
	}
}