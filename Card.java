public class Card
{
    private char suit;
    private int value;
    public void setSuit(char s)
    {
	suit = s;
    }
    public void setValue(int number)
    {
	value = number;
    }
    public char getSuit()
    {
	return suit;
    }
    public int getValue()
    {
	return value;
    }
}