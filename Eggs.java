public class Eggs
{
    public static void main(String[] args)
    {
	int numberofEggs = 20;
	dozenEggs(numberofEggs);
    }
    public static void dozenEggs(int eggs)
    {
	int dozen = eggs / 12;
	System.out.println("The number of dozen eggs is: " + dozen);
    }
}