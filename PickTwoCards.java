public class PickTwoCards
{
    public static void main(String[] args)
    {
	Card card1 = new Card();
	Card card2 = new Card();
	int myValue = ((int) (Math.random() * 100) % 13 + 1);
	card1.setSuit('s');
	card1.setValue(myValue);
	card2.setSuit('h');
	myValue = ((int) (Math.random() * 100) % 13 + 1);
	card2.setValue(myValue);
	System.out.println("Card 1: " + card1.getSuit() + " " + card1.getValue());
	System.out.println("Card 2: " + card2.getSuit() + " " + card2.getValue());
    }
}