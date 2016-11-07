public class Runs {
	public static void main(String[] args) {
		Coin newCoin = new Coin();
		String result = null;
		int headCount=0, tailCount=0;
		int headConsec = 0, tailConsec = 0;
		int lastFlip = 4;
		for (int i = 0; i < 100;i++) {
			newCoin.flip();
			result = (newCoin.getFace()==0) ? "Heads" : "Tails";
			switch (newCoin.getFace()) {
				case 0:
					headCount++;
					if (lastFlip == 0) {
						headConsec++;
					}
					else
					{
						headConsec = 1;
					}
				break;

				case 1:
					tailCount++;
					if (lastFlip == 1) {
						tailConsec++;
					}
					else
					{
						tailConsec = 1;
					}
				break;
			}
			lastFlip = newCoin.getFace();
			System.out.println("Face: "+result);
		}
		System.out.println("\n\n[RESULTS]\n\nHeads: "+headCount);
		System.out.println("Tails: "+tailCount);
		System.out.println("Longest Running Heads: "+headConsec);
		System.out.println("Longest Running Tails: "+tailConsec);
	}
}