import java.util.*;

public class DiceRoll {
	public static Random rndm = new Random();
	public static void main(String[] args){
		int dice1,dice2;

		dice1 = sixDieRoll();

		dice2 = sixDieRoll();

		System.out.println("Dice 1 Roll = "+dice1);
		System.out.println("Dice 2 Roll = "+dice2);

		System.out.println("Dice Total  = "+(dice2+dice1));

	}
	public static int sixDieRoll(){
		return rndm.nextInt(5)+1;
	}
}