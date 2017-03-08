public class Card
{
  private String suit;
  private String rank;
  private int pointValue;
  
  public Card(String paramString1, String paramString2, int paramInt)
  {
    this.rank = paramString1;
    this.suit = paramString2;
    this.pointValue = paramInt;
  }
  
  public String suit()
  {
    return this.suit;
  }
  
  public String rank()
  {
    return this.rank;
  }
  
  public int pointValue()
  {
    return this.pointValue;
  }
  
  public boolean matches(Card paramCard)
  {
    return (paramCard.suit().equals(suit())) && (paramCard.rank().equals(rank())) && (paramCard.pointValue() == pointValue());
  }
  
  public String toString()
  {
    return this.rank + " of " + this.suit + " (point value = " + this.pointValue + ")";
  }
}
