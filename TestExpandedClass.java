public class TestExpandedClass
{
    public static void main(String[] args)
    {
	EventSite oneSite = new EventSite();
	int number;
	double amount;
	String name;
	oneSite.setSiteNumber(101);
	oneSite.setFee(3125.75);
	oneSite.setManager("Nancy Kenneth");
	number  = oneSite.getSiteNumber();
	amount = oneSite.getFee();
	name = oneSite.getManager();
	System.out.println("Site number " + number + " is managed by " + name);
	System.out.println("The usage fee is $" + amount);
    }
}