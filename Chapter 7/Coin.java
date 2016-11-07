// *******************************************************************
//   Coin.java            Author: Lewis and Loftus
//
//   Represents a coin with two sides that can be flipped and given
//   a bias.
// *******************************************************************

public class Coin
{
    public final int HEADS = 0;
    public final int TAILS = 1;
    private double bias;//Chance of heads

    private int face;


    // ---------------------------------------------
    //   Sets up the coin by making it fair and flipping it initially.
    // ---------------------------------------------
    public Coin ()
    {
		bias=0.5;
		flip();
    }

    // ---------------------------------------------
    //   Sets up the coin by setting bias and flipping it initially.
    // ---------------------------------------------
    public Coin (double bias) {
		this.bias=(bias <= 1 && bias >= 0)?bias:0.5;
		flip();
    }
    // -----------------------------------------------
    //   Flips the coin by randomly choosing a face.
    // -----------------------------------------------
    public void flip()
    {
		//face = (int) (Math.random() * 2);
		face = (Math.random() < bias)?0:1;
    }

    // -----------------------------------------------------
    //   Returns true if the current face of the coin is heads.
    // -----------------------------------------------------
    public boolean isHeads()
    {
	return (face == HEADS);
    }

    // -----------------------------------------------------
    //   Returns the probability of heads for this coin
    // -----------------------------------------------------
    public double bias()
    {
	return bias;
    }


    // ----------------------------------------------------
    //   Returns the current face of the coin as a string.
    // ----------------------------------------------------
    public String toString()
    {
	String faceName;

	if (face == HEADS)
	    faceName = "Heads";
	else
	    faceName = "Tails";

	return faceName;
    }
}
