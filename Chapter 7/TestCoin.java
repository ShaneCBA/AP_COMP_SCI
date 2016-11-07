import java.util.*;

public class TestCoin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Coin c1=new Coin(),c2,c3;
		System.out.print("Input coin 2 bias: ");
		c2 = new Coin(scan.nextDouble());
		System.out.print("Input coin 3 bias: ");
		c3 = new Coin(scan.nextDouble());

		int c1H=0,c2H=0,c3H=0;

		for (int i = 0; i<100; i++) {
			c1.flip();
			c2.flip();
			c3.flip();
			c1H+=(c1.isHeads())?1:0;
			c2H+=(c2.isHeads())?1:0;
			c3H+=(c3.isHeads())?1:0;
		}

		System.out.println("Coin 1 Heads: "+c1H);
		System.out.println("Coin 2 Heads: "+c2H);
		System.out.println("Coin 3 Heads: "+c3H);
	}
}