public class TestConstructor
{
    public static void main(String[] args)
    {
	EventSite oneSite = new EventSite();
	int number;
	double amount;
	String name;
	number = oneSite.getSiteNumber();
	amount = oneSite.getFee();
	name = oneSite.getManager();
	System.out.println("Site number " + number + " is managed by " + name);
	System.out.println("The usage fee is $" + amount);
    }
}