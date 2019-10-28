public class Dollars
{
    public static void main(String[] args)
    {
	int number = 57;
	convert(number);
    }
    public static void convert(int number)
    {
	int twenties = 20, tens = 10, fives = 5;
	System.out.println("The number " + number + " converted into twenties, tens, fives, and ones is:");
	twenties = number / twenties;
	number = number - (twenties * 20);
	System.out.println("Twenties: " + twenties);
	tens = number / tens;
	number = number - (tens * 10);
	System.out.println("Tens: " + tens);
	fives = number / fives;
	number = number - (fives * 5);
	System.out.println("Fives: " + fives);
	System.out.println("Ones: " + number);
    }
}