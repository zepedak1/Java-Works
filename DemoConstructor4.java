public class DemoConstructor4
{
    public static void main(String[] args)
    {
	EventSite aSite = new EventSite("Kenny", 225);
	int number = aSite.getSiteNumber();
	String name = aSite.getManager();
	System.out.println("Site number is " + number + "\nManager is " + name);
    }
}