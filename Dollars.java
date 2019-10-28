public class Dollars
{
    public static void main(String[] args)
    {
	int value = 57, twenties, tens, fives, ones;
	twenties = value / 20;
	value = value - (20 * twenties);
	tens = value / 10;
	value = value - (10 * tens);
	fives = value / 5;
	value = value - (5 * fives);
	ones = value;
	System.out.println("Converting $57 into twenties, tens, fives, and ones is:");
	System.out.println("Twenties: " + twenties);
	System.out.println("Tens: " + tens);
	System.out.println("Fives: " + fives);
	System.out.println("Ones: " + ones);
    }
}
	