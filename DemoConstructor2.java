public class DemoConstructor2
{
    public static void main(String[] args)
    {
        EventSite aSite = new EventSite(678);
	EventSite anotherSite = new EventSite();
        System.out.println("Site number is " + aSite.getSiteNumber());
	System.out.println("Another site number is " + anotherSite.getSiteNumber());
    }
}
